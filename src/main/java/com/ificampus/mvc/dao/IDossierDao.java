package com.ificampus.mvc.dao;

import com.ificampus.mvc.entities.Dossier;

public interface IDossierDao extends IGenericDao<Dossier> {

	public Dossier getByCandidat(int id);
	public int countAll();
	
}
