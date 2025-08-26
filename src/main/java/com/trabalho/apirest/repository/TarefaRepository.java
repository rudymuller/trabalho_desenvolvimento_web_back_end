package com.trabalho.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.apirest.model.Tarefa;

@Repository
public interface TarefaRepository  extends JpaRepository <Tarefa, Long>{

}
