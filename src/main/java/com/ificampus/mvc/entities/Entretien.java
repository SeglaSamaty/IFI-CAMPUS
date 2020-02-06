package com.ificampus.mvc.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="entretien")
public class Entretien implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="entretien_id", nullable=false)
	@GeneratedValue
	private int entretien_id;
	@Column(name="entretien_com")
	private String commentaire;//commentaire sur l'entretien
	@Column(name="entretien_note")
	private int note;
	@Column (name="entretien_date")
	private Date entretien_date;
	@OneToOne
	private Candidat entretien_candidat;
	@ManyToOne
	private MembreStaff entretien_staff;
	
	public Entretien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEntretien_id() {
		return entretien_id;
	}
	public void setEntretien_id(int entretien_id) {
		this.entretien_id = entretien_id;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public Date getEntretien_date() {
		return entretien_date;
	}
	public void setEntretien_date(Date entretien_date) {
		this.entretien_date = entretien_date;
	}
	public Candidat getEntretien_candidat() {
		return entretien_candidat;
	}
	public void setEntretien_candidat(Candidat entretien_candidat) {
		this.entretien_candidat = entretien_candidat;
	}
	public MembreStaff getEntretien_staff() {
		return entretien_staff;
	}
	public void setEntretien_staff(MembreStaff entretien_staff) {
		this.entretien_staff = entretien_staff;
	}
	
	
	
	
	
	

}
