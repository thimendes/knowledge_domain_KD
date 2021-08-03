package org.rede_social.knowledgeDomainKD.controller;

import java.util.List;

import org.rede_social.knowledgeDomainKD.model.Tema;
import org.rede_social.knowledgeDomainKD.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/tema") 
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TemaController {
	
    @Autowired
	private TemaRepository temaRepository;
	
	@PostMapping
	public ResponseEntity<Tema> post (@RequestBody Tema tema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(temaRepository.save(tema));
		
	}
	
	@GetMapping(value = "/getAll")
	public ResponseEntity<List<Tema>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(temaRepository.findAll());
	}
	
	
}
