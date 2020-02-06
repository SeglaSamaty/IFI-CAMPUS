package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.MembreStaff;

public interface IMembreStaffService {
	
	public MembreStaff save(MembreStaff entity);
	public MembreStaff update(MembreStaff entity);
	public List<MembreStaff>selectAll();
	public MembreStaff getById(int id);
	public void remove (int id);
	public List<MembreStaff>selectAll(String sortField, String sort);
	public MembreStaff findOneBy(String paramName, Object paramValue);
	public MembreStaff findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);


}
