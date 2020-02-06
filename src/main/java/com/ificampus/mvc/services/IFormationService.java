package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Formation;

public interface IFormationService {
	
	
	public Formation save(Formation entity);
	public Formation update(Formation entity);
	public List<Formation>selectAll();
	public Formation getById(int id);
	public void remove (int id);
	public List<Formation>selectAll(String sortField, String sort);
	public Formation findOneBy(String paramName, Object paramValue);
	public Formation findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);

}
