package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Dossier;
import com.ificampus.mvc.entities.Personne;

public interface IDossierService {
	
	public Dossier save(Dossier entity);
	public Dossier update(Dossier entity);
	public List<Dossier>selectAll();
	public int countAll();
	public Dossier getById(int id);
	public Dossier getByCandidat(int id);
	public void remove (int id);
	public List<Dossier>selectAll(String sortField, String sort);
	public Dossier findOneBy(String paramName, Object paramValue);
	public Dossier findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);

}
