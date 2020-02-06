package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IRoleDao;
import com.ificampus.mvc.entities.Role;
import com.ificampus.mvc.services.IRoleService;


@Transactional
public class RoleServiceImpl implements IRoleService {
	
	private IRoleDao dao;
	public void setDao(IRoleDao dao) {
		this.dao = dao;
	}
	public Role save(Role entity) {
		return dao.save(entity);
	}
	public Role update(Role entity) {
		return dao.update(entity);
	}
	public List<Role> selectAll() {
		return dao.selectAll();
	}
	public Role getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);	
	}
	public List<Role> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public Role findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public Role findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
