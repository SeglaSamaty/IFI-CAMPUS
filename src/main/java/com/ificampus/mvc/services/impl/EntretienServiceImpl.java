package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IEntretienDao;
import com.ificampus.mvc.entities.Entretien;
import com.ificampus.mvc.services.IEntretienService;

@Transactional
public class EntretienServiceImpl implements IEntretienService{

	private IEntretienDao dao;
	public void setDao(IEntretienDao dao) {
		this.dao = dao;
	}
	public Entretien save(Entretien entity) {
		return dao.save(entity);
	}
	public Entretien update(Entretien entity) {
		return dao.update(entity);
	}
	public List<Entretien> selectAll() {
		return dao.selectAll();
	}
	public Entretien getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);
		
	}
	public List<Entretien> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public Entretien findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public Entretien findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
