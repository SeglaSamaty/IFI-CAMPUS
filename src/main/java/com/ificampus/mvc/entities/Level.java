package com.ificampus.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="level")
public class Level implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="level_id", nullable=false)
	private int level_id;
	@Column (name="level_name")
	private String name;
	@OneToMany(mappedBy="formation_level")
	private List <Formation> list_formation;
	
	public Level() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLevel_id() {
		return level_id;
	}
	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Formation> getList_formation() {
		return list_formation;
	}
	public void setList_formation(List<Formation> list_formation) {
		this.list_formation = list_formation;
	}
	
	
	

}
