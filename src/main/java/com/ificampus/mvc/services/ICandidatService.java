package com.ificampus.mvc.services;

import java.util.List;
import com.ificampus.mvc.entities.Candidat;

public interface ICandidatService {

	public Candidat save(Candidat entity);
	public Candidat update(Candidat entity);
	public List<Candidat>selectAll();
	public Candidat getById(int id);
	public void remove (int id);
	public List<Candidat>selectAll(String sortField, String sort);
	public Candidat findOneBy(String paramName, Object paramValue);
	public Candidat findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
	
	
}
