package com.thomas.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thomas.demo.repositories.ProdutoRepository;

import com.thomas.demo.entities.Produto;

@Service
public class ProdutoService {
	
	private final ProdutoRepository produtorepository;
	
	public ProdutoService(ProdutoRepository produtorepository) {
		this.produtorepository = produtorepository;
	}
	
	public Produto criarProduto(Produto produto) {
		return produtorepository.save(produto);
	}
	public List<Produto> ListarProdutos(){
		return produtorepository.findAll();
	}

	public Produto getProdutoPorId(Long id) {
		return produtorepository.findById(id).orElse(null);
	}
	
	public void excluirProduto(Long id) {
		produtorepository.deleteById(id);
	}
}
