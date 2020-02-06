package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Personne;

public interface IPersonneService {
	
	public Personne save(Personne entity);
	public Personne update(Personne entity);
	public List<Personne>selectAll();
	public Personne getById(int id);
	public Personne getByMail(String mail);
	public void remove (int id);
	public List<Personne>selectAll(String sortField, String sort);
	public Personne findOneBy(String paramName, Object paramValue);
	public Personne findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);

}
