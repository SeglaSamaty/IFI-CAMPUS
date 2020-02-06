package com.ificampus.mvc.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="dossier")


public class Dossier implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="dossier_id",nullable=false)
	private int dossier_id;
	@Column(name="dossier_create_date")
	private Date create_date;
	@Column(name="dossier_modificate_date")
	private Date modif_date;
	@OneToMany(mappedBy="dossier")
	private List <Document> list_doc;
	@OneToMany(mappedBy="dossier")
	private List <Formation> list_formation;
	@ManyToOne
	private Etat dossier_etat;
	@OneToOne
	private Candidat dossier_candidat;
	
	public Dossier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDossier_id() {
		return dossier_id;
	}
	public void setDossier_id(int dossier_id) {
		this.dossier_id = dossier_id;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getModif_date() {
		return modif_date;
	}
	public void setModif_date(Date modif_date) {
		this.modif_date = modif_date;
	}
	public List<Document> getList_doc() {
		return list_doc;
	}
	public void setList_doc(List<Document> list_doc) {
		this.list_doc = list_doc;
	}
	public List<Formation> getList_formation() {
		return list_formation;
	}
	public void setList_formation(List<Formation> list_formation) {
		this.list_formation = list_formation;
	}
	public Etat getDossier_etat() {
		return dossier_etat;
	}
	public void setDossier_etat(Etat dossier_etat) {
		this.dossier_etat = dossier_etat;
	}
	public Candidat getDossier_candidat() {
		return dossier_candidat;
	}
	public void setDossier_candidat(Candidat dossier_candidat) {
		this.dossier_candidat = dossier_candidat;
	}
	

}
