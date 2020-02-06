package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.ILevelDao;
import com.ificampus.mvc.entities.Level;
import com.ificampus.mvc.services.ILevelService;

@Transactional
public class LevelServiceImpl implements ILevelService{

	private ILevelDao dao;
	
	public void setDao(ILevelDao dao) {
		this.dao = dao;
	}
	
	public Level save(Level entity) {
		return dao.save(entity);
	}
	public Level update(Level entity) {
		return dao.update(entity);
	}
	public List<Level> selectAll() {
		return dao.selectAll();
	}
	public Level getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);
		
	}
	public List<Level> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public Level findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public Level findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
