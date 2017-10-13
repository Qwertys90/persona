package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Persona;

public interface PersonaService {

	Persona saveOrUpdatePersona(Persona persona);
	
	Persona findById(int id);
	
	List<Persona> findAll();
	
	void deletePersona(int id);
	
	List<Persona> findByProfessione(String professione);
	
}
