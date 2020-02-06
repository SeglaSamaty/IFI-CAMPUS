package com.ificampus.mvc.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;


@Entity
@Table(name = "Personne")
@Inheritance(strategy = InheritanceType.JOINED)

public class Personne implements Serializable {
	
	private static final long serialVersionUID = 1L;
 	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personne_id", nullable=false)
    private int personne_id;
 	@Column(name = "personne_nom")
    private String nom;
    @Column(name = "personne_prenom")
    private String prenom;
    @Column(name = "mail")
    private String mail;
    @Column(name="personne_password")
    private String password;
    @Column(name="status")
    private  boolean actived;
	
    
    @OneToMany(mappedBy="personne")
    List<Role>roles;
    
    
	
	public int getPersonne_id() {
		return personne_id;
	}
	public void setPersonne_id(int personne_id) {
		this.personne_id = personne_id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
		
 	
 	
}
