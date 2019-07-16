package com.br.relacionamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.relacionamento.models.Login;
import com.br.relacionamento.models.Usuario;
import com.br.relacionamento.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired

	private LoginRepository loginRepository;

	public String cadastrarLogin(Usuario user, Login login) {
		login.setUsuario(user);
		loginRepository.save(login);
		return "Login cadastrado";
	}
}