package com.ificampus.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="pays")
public class Pays implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="pays_id")
	@GeneratedValue 
	private int pays_id;
	@Column(name="pays_name")
	private String pays_name; 
	@Column(name="pays_code")
	private String pays_code;
	@OneToMany(mappedBy="canditat_pays")
	private List<Candidat>candidats;
	@OneToMany(mappedBy="universite_pays")
	private List<University>universites;
	
	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPays_id() {
		return pays_id;
	}
	public void setPays_id(int pays_id) {
		this.pays_id = pays_id;
	}
	public String getPays_name() {
		return pays_name;
	}
	public void setPays_name(String pays_name) {
		this.pays_name = pays_name;
	}
	public String getPays_code() {
		return pays_code;
	}
	public void setPays_code(String pays_code) {
		this.pays_code = pays_code;
	}
	public List<Candidat> getCandidats() {
		return candidats;
	}
	public void setCandidats(List<Candidat> candidats) {
		this.candidats = candidats;
	}
	public List<University> getUniversites() {
		return universites;
	}
	public void setUniversites(List<University> universites) {
		this.universites = universites;
	}
	
	
	

}
