package com.example.link.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.link.models.link;
import com.example.link.repository.LinkRepository;

@CrossOrigin
@RestController
@RequestMapping("/link")
public class LinkResource {

//INJECAO
@Autowired
LinkRepository linkRepository;

//MEDOTODOS:

//**RETORNAR Links PELO ID DA PASTA (OS LINKS QUE ESTAO NA PASTA)

@GetMapping(value = "/listar/{id}")
public List<link>listaDeLinksPasta(@PathVariable(value = "id") Integer id){
	
	return linkRepository.listadeLinksPorPasta(id);
}

	

@PostMapping("/salvar")
public link salvarLink(@RequestBody link Link) {
	
	return linkRepository.save(Link);
}
	
@DeleteMapping("/deletar")
public void deletarLink(@RequestBody link Link) {
	linkRepository.delete(Link);
}
	
}
