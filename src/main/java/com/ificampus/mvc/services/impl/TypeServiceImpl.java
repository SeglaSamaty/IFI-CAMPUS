package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.ITypeDao;
import com.ificampus.mvc.entities.Type;
import com.ificampus.mvc.services.ITypeService;


@Transactional
public class TypeServiceImpl implements ITypeService{
	
	private ITypeDao dao;
	
	public void setDao(ITypeDao dao) {
		this.dao = dao;
	}
	public Type save(Type entity) {
		
		return dao.save(entity);
	}
	public Type update(Type entity) {
		return dao.update(entity);
	}
	public List<Type> selectAll() {
		return dao.selectAll();
	}
	public Type getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);
		
	}
	public List<Type> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public Type findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public Type findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
