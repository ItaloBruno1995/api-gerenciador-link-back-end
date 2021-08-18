package com.example.link.resources;

import java.net.URI;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.link.models.Pasta;
import com.example.link.models.Pastaa;
import com.example.link.models.link;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class Template {
	
	
RestTemplate template = new RestTemplate();

@GetMapping
public Pasta[] consumirApi() {
	
	
	
	//https://api-rest-link.herokuapp.com/pasta/listar
	UriComponents uri = UriComponentsBuilder.newInstance()
			.scheme("https")
			.host("api-rest-link.herokuapp.com")
			.path("pasta/listar")
			.queryParam("pasta","listar")
			.build();
	
	
	///RETORNA UM ARRY DE PASTAS
	 ResponseEntity<Pasta[]> response= template.getForEntity(uri.toUriString(), Pasta[].class);
	
	  response.getBody();
	 
	  return response.getBody();
	
}	



@PostMapping("/salvar")
public ResponseEntity<Pasta> salvarPasta(@RequestBody Pasta pasta) {
	
	 return template.postForEntity("http://localhost:8080/pasta/salvar", pasta, Pasta.class);
	
	
	//return pasta ;
	
		
}



//TENTANDO AS CLASSES MAPEADAS 

@GetMapping("/map")
public Pastaa[] consumirApiClasses() {
	
	
	
	//https://api-rest-link.herokuapp.com/pasta/listar
	UriComponents uri = UriComponentsBuilder.newInstance()
			.scheme("https")
			.host("api-rest-link.herokuapp.com")
			.path("pasta/listar")
			.queryParam("pasta","listar")
			.build();
	
	
	///RETORNA UM ARRY DE PASTAS
	 ResponseEntity<Pastaa[]> response= template.getForEntity(uri.toUriString(), Pastaa[].class);
	
	  response.getBody();
	 
	  return response.getBody();
	
}	


@GetMapping("/map/link")
public link[] consumirApiClassesLink() {
	
	
	
	//https://api-rest-link.herokuapp.com/pasta/listar
	UriComponents uri = UriComponentsBuilder.newInstance()
			.scheme("https")
			.host("api-rest-link.herokuapp.com")
			.path("pasta/listar")
			.queryParam("pasta","listar")
			.build();
	
	
	///RETORNA UM ARRY DE PASTAS
	 ResponseEntity<link[] > response= template.getForEntity(uri.toUriString(), link[].class);
	
	  response.getBody();
	 
	  return response.getBody();
	
}	


//** teste API-CEUMA
//@GetMapping("/ceuma")
//public ResponseEntity<Pasta> validaDiploma(@RequestBody Pasta pasta) {
	
	 //return template.getForEntity("http://localhost:8080/pasta/salvar", pasta, Pasta.class);
	
	
	//return pasta ;
	
		
//}




}
