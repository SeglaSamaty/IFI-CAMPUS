package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IPaysDao;
import com.ificampus.mvc.entities.Pays;
import com.ificampus.mvc.services.IPaysService;


@Transactional
public class PaysServiceImpl implements IPaysService{

	private IPaysDao dao;
	
	public void setDao(IPaysDao dao) {
		this.dao = dao;
	}
	public IPaysDao getDao() {
		return dao;
	}



	@Override
	public Pays save(Pays entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Pays update(Pays entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<Pays> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Pays getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public List<Pays> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Pays findOneBy(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public Pays findOneBy(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}
}
