package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IFormationDao;
import com.ificampus.mvc.entities.Formation;
import com.ificampus.mvc.services.IFormationService;

@Transactional
public class FormationServiceImpl implements IFormationService {

	private IFormationDao dao;
	public void setDao(IFormationDao dao) {
		this.dao = dao;
	}
	public Formation save(Formation entity) {
		return dao.save(entity);
	}
	public Formation update(Formation entity) {
		return dao.update(entity);
	}
	public List<Formation> selectAll() {
		return dao.selectAll();
	}
	public Formation getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);
		
	}
	public List<Formation> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public Formation findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public Formation findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
