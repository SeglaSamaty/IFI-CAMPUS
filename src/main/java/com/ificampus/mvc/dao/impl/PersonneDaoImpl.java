package com.ificampus.mvc.dao.impl;

import javax.persistence.Query;


import com.ificampus.mvc.dao.IPersonneDao;
import com.ificampus.mvc.entities.Personne;

public class PersonneDaoImpl extends GenericDaoImpl<Personne> implements IPersonneDao{

	@Override
	public Personne getByMail(String mail) {
		
		Query query = em.createQuery("select p from " + Personne.class.getSimpleName() + " p where p.mail = :x");
		query.setParameter("x", mail);
		return (Personne) query.getSingleResult();
		
	}

}
