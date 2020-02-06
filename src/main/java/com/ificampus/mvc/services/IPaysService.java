package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Pays;

public interface IPaysService {

	
	public Pays save(Pays entity);
	public Pays update(Pays entity);
	public List<Pays>selectAll();
	public Pays getById(int id);
	public void remove (int id);
	public List<Pays>selectAll(String sortField, String sort);
	public Pays findOneBy(String paramName, Object paramValue);
	public Pays findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
	
	
	
}
