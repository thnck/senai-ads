package com.thomas.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thomas.demo.entities.Usuario;
import com.thomas.demo.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	private LoginService loginservice;
	
	public  LoginController(LoginService loginservice) {
		this.loginservice = loginservice;
	}
@PostMapping
	public ResponseEntity<String> login(@RequestBody Usuario usuario) {
		boolean isValid = loginservice.validarLogin(usuario);
		if (isValid) {
			return ResponseEntity.ok("Login bem sucedido");
		} else {
			return ResponseEntity.status(401).body("Credenciais Inválidas");
		} 
	}
}
