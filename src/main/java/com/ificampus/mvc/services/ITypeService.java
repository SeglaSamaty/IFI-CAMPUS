package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Type;

public interface ITypeService {
	
	
	public Type save(Type entity);
	public Type update(Type entity);
	public List<Type>selectAll();
	public Type getById(int id);
	public void remove (int id);
	public List<Type>selectAll(String sortField, String sort);
	public Type findOneBy(String paramName, Object paramValue);
	public Type findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);

}
