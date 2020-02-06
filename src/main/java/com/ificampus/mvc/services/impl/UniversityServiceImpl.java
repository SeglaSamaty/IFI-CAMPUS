package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IUniversityDao;
import com.ificampus.mvc.entities.University;
import com.ificampus.mvc.services.IUniversityService;

@Transactional
public class UniversityServiceImpl implements IUniversityService{

	private IUniversityDao dao;
	
	public void setDao(IUniversityDao dao) {
		this.dao = dao;
	}
	public University save(University entity) {
		return dao.save(entity);
	}
	public University update(University entity) {
		return dao.update(entity);
	}
	public List<University> selectAll() {
		return dao.selectAll();
	}
	public List<University> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public University getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);
	}
	public University findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public University findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
}
