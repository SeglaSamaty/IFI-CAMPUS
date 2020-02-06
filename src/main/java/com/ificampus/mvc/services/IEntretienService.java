package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Entretien;

public interface IEntretienService {

	
	public Entretien save(Entretien entity);
	public Entretien update(Entretien entity);
	public List<Entretien>selectAll();
	public Entretien getById(int id);
	public void remove (int id);
	public List<Entretien>selectAll(String sortField, String sort);
	public Entretien findOneBy(String paramName, Object paramValue);
	public Entretien findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
}
