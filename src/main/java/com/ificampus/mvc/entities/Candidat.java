package com.ificampus.mvc.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "candidat")
@PrimaryKeyJoinColumn(name = "personne_id")
public class Candidat extends Personne  {
	private static final long serialVersionUID = 1L;
	@Column(name = "candidat_nais")
	private String nais;
	@Column(name = "candidat_sex")
	private String sex;
	@Column(name = "candidat_num")
	private Long num;
	@Column(name = "candidat_passeport")
	private String passeport;
	@ManyToOne
	@JoinColumn(name="pays_id")
	private Pays canditat_pays;
	@OneToMany(mappedBy="message_candidat")
	private List <Message> messages;
	@OneToMany(mappedBy="formation_candidat")
	private List <Formation> formation;
	@OneToOne(mappedBy="entretien_candidat")
	private Entretien entretien;
	@OneToOne(mappedBy="dossier_candidat")
	private Dossier candidat_dossier;
	
	public Candidat() {
		super();
		
	}
	public String getNais() {
		return nais;
	}
	public void setNais(String nais) {
		this.nais = nais;
	}
	public Pays getCanditat_pays() {
		return canditat_pays;
	}
	public void setCanditat_pays(Pays canditat_pays) {
		this.canditat_pays = canditat_pays;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	public List<Formation> getFormation() {
		return formation;
	}
	public void setFormation(List<Formation> formation) {
		this.formation = formation;
	}
	public Entretien getEntretien() {
		return entretien;
	}
	public void setEntretien(Entretien entretien) {
		this.entretien = entretien;
	}
	public Dossier getCandidat_dossier() {
		return candidat_dossier;
	}
	public void setCandidat_dossier(Dossier candidat_dossier) {
		this.candidat_dossier = candidat_dossier;
	}
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getPasseport() {
		return passeport;
	}
	public void setPasseport(String passeport) {
		this.passeport = passeport;
	}
	public String getSex() {
		return sex;
	}
	public String getSexc() {
		if(sex.equals("1")) {
			return "M";
		}else {
			return "F";
		}
		
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	 

}
