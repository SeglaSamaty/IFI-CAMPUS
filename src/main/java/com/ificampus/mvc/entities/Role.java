package com.ificampus.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;


@Entity
@Table(name="role")
public class Role implements Serializable,GrantedAuthority{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="role_id", nullable=false)
	private int role_id;
	
	@Column(name="role_intitule")
	private String role_name;
	
	@ManyToOne
	@JoinColumn(name="personne_id")
	private Personne personne;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return role_name;
	}
	
	

}
