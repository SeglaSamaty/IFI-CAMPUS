package com.ificampus.mvc.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="formation")

public class Formation implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="formation_id", nullable=false)
	private int formation_id;
	@Column(name="formation_nom")
	private String formation_nom;
	@Column(name="formation_debut")
	private Date formation_debut;
	@Column (name="formation_fin")
	private Date formation_fin;
	@ManyToOne
	private Candidat formation_candidat;
	@ManyToOne
	private Level formation_level;
	@ManyToOne
	private University formation_university;
	@ManyToOne
	private Dossier dossier;
	
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFormation_id() {
		return formation_id;
	}
	public void setFormation_id(int formation_id) {
		this.formation_id = formation_id;
	}
	public String getFormation_nom() {
		return formation_nom;
	}
	public void setFormation_nom(String formation_nom) {
		this.formation_nom = formation_nom;
	}
	public Date getFormation_debut() {
		return formation_debut;
	}
	public void setFormation_debut(Date formation_debut) {
		this.formation_debut = formation_debut;
	}
	public Date getFormation_fin() {
		return formation_fin;
	}
	public void setFormation_fin(Date formation_fin) {
		this.formation_fin = formation_fin;
	}
	public Candidat getFormation_candidat() {
		return formation_candidat;
	}
	public void setFormation_candidat(Candidat formation_candidat) {
		this.formation_candidat = formation_candidat;
	}
	public Level getFormation_level() {
		return formation_level;
	}
	public void setFormation_level(Level formation_level) {
		this.formation_level = formation_level;
	}
	public University getFormation_university() {
		return formation_university;
	}
	public void setFormation_university(University formation_university) {
		this.formation_university = formation_university;
	}
	public Dossier getDossier() {
		return dossier;
	}
	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
	
	

}
