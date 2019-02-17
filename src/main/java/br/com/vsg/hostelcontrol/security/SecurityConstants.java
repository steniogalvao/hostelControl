package br.com.vsg.hostelcontrol.security;

import org.springframework.beans.factory.annotation.Value;

public class SecurityConstants {

	@Value("${server.servlet.context-path}")
	private static String URL;
	public static final String SECRET = "SecretKeyToGenJWTs";
	public static final long EXPIRATION_TIME = 864_000_000; // 10 days
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = URL + "/user/register";
	public static final String SIGN_IN_URL = URL + "/auth";

}