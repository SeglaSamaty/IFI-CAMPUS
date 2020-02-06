package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Droit;

public interface IDroitService {
	
	public Droit save(Droit entity);
	public Droit update(Droit entity);
	public List<Droit>selectAll();
	public Droit getById(int id);
	public void remove (int id);
	public List<Droit>selectAll(String sortField, String sort);
	public Droit findOneBy(String paramName, Object paramValue);
	public Droit findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);

}
