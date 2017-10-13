package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Integer>{

	List<Persona> findByProfessione (String professione);
	
}
