package br.com.vsg.hostelcontrol.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.vsg.hostelcontrol.model.Login;

public interface LoginRepository extends CrudRepository<Login, Integer> {

	Login findByLogin(String login);

}
