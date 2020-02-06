package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Etat;

public interface IEtatService {
	
	public Etat save(Etat entity);
	public Etat update(Etat entity);
	public List<Etat>selectAll();
	public Etat getById(int id);
	public void remove (int id);
	public List<Etat>selectAll(String sortField, String sort);
	public Etat findOneBy(String paramName, Object paramValue);
	public Etat findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);

}
