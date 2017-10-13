package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Persona;
import com.example.demo.repository.PersonaRepository;
@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	PersonaRepository personaRepository;
	
	@Override
	public Persona saveOrUpdatePersona(Persona persona) {
	return personaRepository.save(persona);
	}

	@Override
	public Persona findById(int id) {
		return personaRepository.findOne(id);
	}

	@Override
	public List<Persona> findAll() {
		return (List<Persona>) personaRepository.findAll();
	}

	@Override
	public void deletePersona(int id) {
		personaRepository.delete(id);
	}

	@Override
	public List<Persona> findByProfessione(String professione) {
		return personaRepository.findByProfessione(professione);
	}

}
