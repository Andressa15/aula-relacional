package com.br.relacionamento.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.relacionamento.models.Login;
@Repository
public interface LoginRepository extends CrudRepository<Login, Integer>{

}
