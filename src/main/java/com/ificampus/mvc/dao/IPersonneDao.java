package com.ificampus.mvc.dao;
import com.ificampus.mvc.entities.Personne;

public interface IPersonneDao extends IGenericDao<Personne>{
	public Personne getByMail(String mail);

}
