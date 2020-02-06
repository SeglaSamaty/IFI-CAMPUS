package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Role;

public interface IRoleService {

	public Role save(Role entity);
	public Role update(Role entity);
	public List<Role>selectAll();
	public Role getById(int id);
	public void remove (int id);
	public List<Role>selectAll(String sortField, String sort);
	public Role findOneBy(String paramName, Object paramValue);
	public Role findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
	
	
}
