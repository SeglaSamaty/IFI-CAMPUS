package com.ificampus.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="type")

public class Type implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="type_id", nullable=false)
	@GeneratedValue
	private int type_id;
	@Column(name="type_intitule")
	private String type_intitule;
	
	@OneToMany(mappedBy="doc_type")
	private List <Document> liste_doc;
	
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getType_intitule() {
		return type_intitule;
	}
	public void setType_intitule(String type_intitule) {
		this.type_intitule = type_intitule;
	}
	public List<Document> getListe_doc() {
		return liste_doc;
	}
	public void setListe_doc(List<Document> liste_doc) {
		this.liste_doc = liste_doc;
	}
	
	
	
}
