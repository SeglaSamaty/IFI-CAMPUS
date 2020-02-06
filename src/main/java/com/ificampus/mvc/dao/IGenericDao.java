package com.ificampus.mvc.dao;

import java.util.List;

public interface IGenericDao<E> {
	
	public E save(E entity);
	public E update(E entity);
	public List<E>selectAll();
	public E getById(int id);
	public void remove (int id);
	public List<E>selectAll(String sortField, String sort);
	public E findOneBy(String paramName, Object paramValue);
	public E findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
	
	

}
