package com.thomas.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thomas.demo.repositories.FantasiaRepository;

import com.thomas.demo.entities.Fantasia;

@Service
public class FantasiaService {
	
	private final FantasiaRepository fantasiarepository;
	
	public FantasiaService(FantasiaRepository fantasiarepository) {
		this.fantasiarepository = fantasiarepository;
	}
	
	public Fantasia criarFantasia(Fantasia fantasia) {
		return fantasiarepository.save(fantasia);
	}
	public List<Fantasia> ListarFantasias(){
		return fantasiarepository.findAll();
	}

	public Fantasia getFantasiaPorId(Long id) {
		return fantasiarepository.findById(id).orElse(null);
	}
	
	public void excluirFantasia(Long id) {
		fantasiarepository.deleteById(id);
	}
}
