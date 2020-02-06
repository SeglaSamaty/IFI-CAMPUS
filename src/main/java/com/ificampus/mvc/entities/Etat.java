package com.ificampus.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="etat")

public class Etat implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="etat_id")
	private int etat_id;
	@Column(name="etat_intitule")
	private String intitule;
	@OneToMany(mappedBy="dossier_etat")
	private List <Dossier> liste_doss;
	
	public Etat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEtat_id() {
		return etat_id;
	}
	public void setEtat_id(int etat_id) {
		this.etat_id = etat_id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public List<Dossier> getListe_doss() {
		return liste_doss;
	}
	public void setListe_doss(List<Dossier> liste_doss) {
		this.liste_doss = liste_doss;
	}
	
	

}
