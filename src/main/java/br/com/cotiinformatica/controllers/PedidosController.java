package br.com.cotiinformatica.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidosController {
	@PostMapping
	public ResponseEntity<String> post() {
		return ResponseEntity.ok("Pedido inserido com sucesso.");
	}
	
	@PutMapping
	public ResponseEntity<String> put() {
		return ResponseEntity.ok
("Pedido atualizado com sucesso.");
	}
	
	@DeleteMapping
	public ResponseEntity<String> delete() {
		return ResponseEntity.ok("Pedido excluído com sucesso.");
	}
	
	@GetMapping
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Pedido obtido com sucesso.");
	}


}
