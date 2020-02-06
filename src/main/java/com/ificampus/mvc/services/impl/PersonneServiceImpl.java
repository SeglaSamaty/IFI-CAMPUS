package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IPersonneDao;
import com.ificampus.mvc.entities.Personne;
import com.ificampus.mvc.services.IPersonneService;

@Transactional
public class PersonneServiceImpl implements IPersonneService{

	private IPersonneDao dao;
	public void setDao(IPersonneDao dao) {
		this.dao = dao;
	}
	public Personne save(Personne entity) {
		return dao.save(entity);
	}
	public Personne update(Personne entity) {
		return dao.update(entity);
	}
	public List<Personne> selectAll() {
		return dao.selectAll();
	}
	public Personne getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);
	}
	public List<Personne> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public Personne findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public Personne findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	public Personne getByMail(String mail) {
		return dao.getByMail(mail);
	}
	

	
}
