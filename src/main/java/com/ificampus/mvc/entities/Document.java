package com.ificampus.mvc.entities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="document")

public class Document implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="doc_id",nullable=false)
	private int doc_id;
	@Column(name="doc_path")
	private String path;
	@ManyToOne
	private Type doc_type;
	@ManyToOne
	private Dossier dossier;
	@Column(name = "fileData")
	private byte[] fileData;
	 @Column(name = "fileName")
	private String fileName;
	
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_doc() {
		return doc_id;
	}
	public void setId_doc(int id_doc) {
		this.doc_id = id_doc;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public Type getDoc_type() {
		return doc_type;
	}
	public void setDoc_type(Type doc_type) {
		this.doc_type = doc_type;
	}
	public Dossier getDossier() {
		return dossier;
	}
	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	

}
