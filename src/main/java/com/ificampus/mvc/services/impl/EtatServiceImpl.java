package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IEtatDao;
import com.ificampus.mvc.entities.Etat;
import com.ificampus.mvc.services.IEtatService;

@Transactional
public class EtatServiceImpl implements IEtatService {

	private IEtatDao dao;
	public void setDao(IEtatDao dao) {
		this.dao = dao;
	}
	public Etat save(Etat entity) {
		return dao.save(entity);
	}
	public Etat update(Etat entity) {
		return dao.update(entity);
	}
	public List<Etat> selectAll() {
		return dao.selectAll();
	}
	public Etat getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);
		
	}
	public List<Etat> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public Etat findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public Etat findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
