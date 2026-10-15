package com.thomas.demo.entities;

public class Usuario {

	private String username;
	private String password;

	// Construtor vazio
	public Usuario() {
	}

	// Construtor com parâmetros
	public Usuario(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Getters e Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}