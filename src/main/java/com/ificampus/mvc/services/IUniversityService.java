package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.University;

public interface IUniversityService {
	public University save(University entity);
	public University update(University entity);
	public List<University>selectAll();
	public University getById(int id);
	public void remove (int id);
	public List<University>selectAll(String sortField, String sort);
	public University findOneBy(String paramName, Object paramValue);
	public University findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);

}
