package com.example.link.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pasta")
public class Pastaa  implements Serializable{

	private static final long serialVersionUID = 1L;

@Id
@Column (name = "idpasta")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;


@Column(name = "nome")
private String nome;






public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}







	
	
}
