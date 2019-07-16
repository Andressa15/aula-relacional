package com.br.relacionamento.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.relacionamento.models.Usuario;
@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario, Integer>{

}
