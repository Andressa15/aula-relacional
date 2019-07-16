package com.br.relacionamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.relacionamento.models.Login;
import com.br.relacionamento.models.Usuario;
import com.br.relacionamento.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRespoRepository;

	public void salvarUsuario(Usuario usuario, Login login) {
		usuario.setLogin(login);
		usuarioRespoRepository.save(usuario);
	}
	public Iterable<Usuario> mostrar(){
		return usuarioRespoRepository.findAll();
	}
	

}
