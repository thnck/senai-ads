package com.thomas.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thomas.demo.entities.Produto;
import com.thomas.demo.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	private final ProdutoService produtoservice;
	
	public ProdutoController(ProdutoService produtoservice) {
		this.produtoservice = produtoservice;
	}
	
	@PostMapping
	public Produto saveProduto(@RequestBody Produto produto){
		return produtoservice.criarProduto(produto);
	}
	
	@GetMapping
	public List<Produto> ListarTodos(){
		return produtoservice.ListarProdutos();
	}
	
	@GetMapping("/{id}")
	public Produto ListarPorId(@PathVariable Long id){
		return produtoservice.getProdutoPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void deletarProduto(@PathVariable Long id) {
		produtoservice.excluirProduto(id);
	}
}
