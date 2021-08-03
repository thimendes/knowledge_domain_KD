package org.rede_social.knowledgeDomainKD.controller;

import org.rede_social.knowledgeDomainKD.model.Tema;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/tema") 
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TemaController {

	@PostMapping
	public ResponseEntity<Tema> post (@RequestBody Tema tema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(temaRepository.save(tema));
		
	}
	
}
