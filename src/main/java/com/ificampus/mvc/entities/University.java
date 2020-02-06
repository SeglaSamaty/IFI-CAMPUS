package com.ificampus.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="university")
public class University implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="university_id", nullable=false)
	private int university_id;
	@Column(name="university_name")
	String univ_name;
	@ManyToOne
	@JoinColumn(name="pays_id")
	private Pays universite_pays;
	@OneToMany(mappedBy="formation_university")
	private List <Formation> list_formation;
	
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUniversity_id() {
		return university_id;
	}
	public void setUniversity_id(int university_id) {
		this.university_id = university_id;
	}
	public String getUniv_name() {
		return univ_name;
	}
	public void setUniv_name(String univ_name) {
		this.univ_name = univ_name;
	}
	public Pays getUniversite_pays() {
		return universite_pays;
	}
	public void setUniversite_pays(Pays universite_pays) {
		this.universite_pays = universite_pays;
	}
	public List<Formation> getList_formation() {
		return list_formation;
	}
	public void setList_formation(List<Formation> list_formation) {
		this.list_formation = list_formation;
	}
	
	
	
	

}
