package com.ificampus.mvc.entities;

import javax.persistence.*;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="membre_staff")
@PrimaryKeyJoinColumn(name = "personne_id")

public class MembreStaff extends Personne {
	
	private static final long serialVersionUID = 1L;
	@Column(name = "staff_post")
	private String poste;
	@OneToMany(mappedBy="entretien_staff")
	private List <Entretien> list_entretien;

	/*
	 * @OneToOne private Role role;
	 */	
	public MembreStaff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public List<Entretien> getList_entretien() {
		return list_entretien;
	}
	public void setList_entretien(List<Entretien> list_entretien) {
		this.list_entretien = list_entretien;
	}
	/*
	 * public Role getRole() { return role; } public void setRole(Role role) {
	 * this.role = role; }
	 */
	
	

}
