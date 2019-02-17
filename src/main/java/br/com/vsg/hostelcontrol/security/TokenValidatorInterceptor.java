package br.com.vsg.hostelcontrol.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import br.com.infoway.senseusergrid.config.UriEnum;
import br.com.infoway.senseusergrid.model.admin.RequestInfo;
import br.com.infoway.senseusergrid.services.admin.RequestInfoService;
import br.com.infoway.senseusergrid.services.admin.TokenService;

/**
 * Interceptor responsavel por validar o token de acesso.
 * 
 * @author Luan Pontes
 *
 */
public class TokenValidatorInterceptor implements HandlerInterceptor {

	@Autowired
	TokenService tokenService;

	@Autowired
	RequestInfoService reqInfoService;

	public boolean preHandle( HttpServletRequest request, HttpServletResponse response, Object handler ) throws Exception {
		RequestInfo clientReqInfo = reqInfoService.getClientReqInfo( request );
		System.out.println( "---------------------------------------" );
		System.out.println( request.getRequestURI() );
		System.out.println( "---------------------------------------" );
		if ( !UriEnum.contains( request.getRequestURI() ) ) {
			String accessToken = request.getHeader( "access-token" );
			if ( accessToken != null ) {
				if ( tokenService.isValid( accessToken, clientReqInfo ) ) {
					return true;
				} else {
					return reutrnError( response, HttpStatus.UNAUTHORIZED.value(), "invalid token" );
				}
			}
			return reutrnError( response, HttpStatus.UNPROCESSABLE_ENTITY.value(), "access-token not found" );
		} else {
			return true;
		}
	}

	public void postHandle( HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView ) throws Exception {}

	public void afterCompletion( HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex ) throws Exception {}

	private boolean reutrnError( HttpServletResponse response, int code, String msg ) {
		try {
			response.getWriter().write( msg );
			response.setStatus( code );
		} catch ( IOException e ) {
			e.printStackTrace();
		}
		return false;
	}
}
