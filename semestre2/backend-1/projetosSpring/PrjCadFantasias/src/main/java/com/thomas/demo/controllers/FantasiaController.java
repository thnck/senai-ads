package com.thomas.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thomas.demo.entities.Fantasia;
import com.thomas.demo.services.FantasiaService;

@RestController
@RequestMapping("/fantasias")
public class FantasiaController {
	
	private final FantasiaService fantasiaservice;
	
	public FantasiaController(FantasiaService fantasiaservice) {
		this.fantasiaservice = fantasiaservice;
	}
	
	@PostMapping
	public Fantasia saveFantasia(@RequestBody Fantasia fantasia){
		return fantasiaservice.criarFantasia(fantasia);
	}
	
	@GetMapping
	public List<Fantasia> ListarTodos(){
		return fantasiaservice.ListarFantasias();
	}
	
	@GetMapping("/{id}")
	public Fantasia ListarPorId(@PathVariable Long id){
		return fantasiaservice.getFantasiaPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletarFantasia(@PathVariable Long id) {
		fantasiaservice.excluirFantasia(id);
	}
}
