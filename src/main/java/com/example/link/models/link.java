package com.example.link.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_link")
public class link implements Serializable {

	private static final long serialVersionUID = 1L;


@Id
@Column(name = "idlink")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;







@Column(name ="url")
private String url;



//UM LINK TEM UMA PASTA 

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "tb_pasta_idpasta")
private Pastaa  pastaLink;


public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getUrl() {
	return url;
}



public void setUrl(String url) {
	this.url = url;
}



public Pastaa getPastaLink() {
	return pastaLink;
}



public void setPastaLink(Pastaa pastaLink) {
	this.pastaLink = pastaLink;
}


	
}
