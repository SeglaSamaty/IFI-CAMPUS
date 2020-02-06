package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Level;

public interface ILevelService {

	
	
	public Level save(Level entity);
	public Level update(Level entity);
	public List<Level>selectAll();
	public Level getById(int id);
	public void remove (int id);
	public List<Level>selectAll(String sortField, String sort);
	public Level findOneBy(String paramName, Object paramValue);
	public Level findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
	
	
}
