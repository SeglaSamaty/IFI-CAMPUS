package com.ificampus.mvc.dao.impl;

import javax.persistence.Query;

import com.ificampus.mvc.dao.IDossierDao;
import com.ificampus.mvc.entities.Dossier;
import com.ificampus.mvc.entities.Personne;

public class DossierDaoImpl extends GenericDaoImpl<Dossier> implements IDossierDao{

	@Override
	public Dossier getByCandidat(int id) {
		
		Query query = em.createQuery("select d from " + Dossier.class.getSimpleName() + " d where d.dossier_candidat.personne_id = :x");
		query.setParameter("x", id);
		return (Dossier)query.getSingleResult();

	}

	@Override
	public int countAll() {
		
		Query query = em.createQuery("select d from "+ Dossier.class.getSimpleName()+" d");
		
		if (query.getResultList().size()>0) {
			
			return query.getResultList().size();
		}else {
			return 0;
		}
	}

}
