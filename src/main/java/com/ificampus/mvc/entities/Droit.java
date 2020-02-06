package com.ificampus.mvc.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="droit")
public class Droit implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="droit_id")
	private int droit_id;
	@Column(name="droit_intitule")
	private String droit_intitule;
	/*
	 * @ManyToOne private Role droit_role;
	 */
	
	public Droit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDroit_id() {
		return droit_id;
	}
	public void setDroit_id(int droit_id) {
		this.droit_id = droit_id;
	}
	public String getDroit_intitule() {
		return droit_intitule;
	}
	public void setDroit_intitule(String droit_intitule) {
		this.droit_intitule = droit_intitule;
	}
	/*
	 * public Role getDroit_role() { return droit_role; } public void
	 * setDroit_role(Role droit_role) { this.droit_role = droit_role; }
	 */
	

}
