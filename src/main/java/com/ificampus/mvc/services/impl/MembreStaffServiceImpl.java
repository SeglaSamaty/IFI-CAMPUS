package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IMembreStaffDao;
import com.ificampus.mvc.entities.MembreStaff;
import com.ificampus.mvc.services.IMembreStaffService;

@Transactional
public class MembreStaffServiceImpl implements IMembreStaffService {

	private IMembreStaffDao dao;
	public void setDao(IMembreStaffDao dao) {
		this.dao = dao;
	}
	public MembreStaff save(MembreStaff entity) {
		return dao.save(entity);
	}
	public MembreStaff update(MembreStaff entity) {
		return dao.update(entity);
	}
	public List<MembreStaff> selectAll() {
		return dao.selectAll();
	}
	public MembreStaff getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);	
	}
	public List<MembreStaff> selectAll(String sortField, String sort) 
	{
		return dao.selectAll(sortField, sort);
	}
	public MembreStaff findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public MembreStaff findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
