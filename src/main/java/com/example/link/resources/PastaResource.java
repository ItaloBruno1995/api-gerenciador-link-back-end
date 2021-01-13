package com.example.link.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.link.models.Pasta;
import com.example.link.repository.PastaRepository;
@CrossOrigin
@RestController
@RequestMapping(value = "/pasta")
public class PastaResource {

//INJECAO
	
@Autowired
PastaRepository pastaRepository;


//METODOS:



//* RETORNAR TODAS AS PASTAS

@GetMapping("/listar")
public List<Pasta> listarPastas(){
	
	return pastaRepository.findAll();
	
}
	

//CRIAR PASTA

@PostMapping("/salvar")
public Pasta salvarPasta(@RequestBody Pasta pasta) {
	
	return pastaRepository.save(pasta);
	
}
	

//DELETAR PASTA 
@DeleteMapping("/deletar")
public void deletarPasta(@RequestBody Pasta pasta) {
	pastaRepository.delete(pasta);
	
}


}
