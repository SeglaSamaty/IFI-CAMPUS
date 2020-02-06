package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.ICandidatDao;
import com.ificampus.mvc.entities.Candidat;
import com.ificampus.mvc.services.ICandidatService;

@Transactional
public class CandidatServiceImpl implements ICandidatService {

	private ICandidatDao dao;
	public void setDao(ICandidatDao dao) {
		this.dao = dao;
	}
	@Override
	public Candidat save(Candidat entity) {
		// TODO Auto-generated method stub
	     return dao.save(entity);
	}
	@Override
	public Candidat update(Candidat entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}
	@Override
	public List<Candidat> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	@Override
	public Candidat getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}
	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}
	@Override
	public List<Candidat> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}
	@Override
	public Candidat findOneBy(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findOneBy(paramName, paramValue);
	}
	@Override
	public Candidat findOneBy(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOneBy(paramNames, paramValues);
	}
	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}
	
	
}
