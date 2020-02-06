package com.ificampus.mvc.entities;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="message")
public class Message implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="message_id", nullable=false)
	private int id_message;
	@Column(name="message_date")
	private Date message_date;
	@ManyToOne
	@JoinColumn(name="personne_id")
	private Candidat message_candidat;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_message() {
		return id_message;
	}
	public void setId_message(int id_message) {
		this.id_message = id_message;
	}
	public Date getMessage_date() {
		return message_date;
	}
	public void setMessage_date(Date message_date) {
		this.message_date = message_date;
	}
	public Candidat getMessage_candidat() {
		return message_candidat;
	}
	public void setMessage_candidat(Candidat message_candidat) {
		this.message_candidat = message_candidat;
	}
	
	
	
	
	

}
