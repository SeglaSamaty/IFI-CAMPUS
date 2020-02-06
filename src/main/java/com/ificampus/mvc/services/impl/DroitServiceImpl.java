package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IDroitDao;
import com.ificampus.mvc.entities.Droit;
import com.ificampus.mvc.services.IDroitService;

@Transactional
public class DroitServiceImpl implements IDroitService{

	private IDroitDao dao;
	public void setDao(IDroitDao dao) {
		this.dao = dao;
	}
	
	public Droit save(Droit entity) {
		return dao.save(entity);
	}
	public Droit update(Droit entity) {
		return dao.update(entity);
	}
	public List<Droit> selectAll() {
		return dao.selectAll();
	}
	public Droit getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);
		
	}
	public List<Droit> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public Droit findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public Droit findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
