package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IDossierDao;
import com.ificampus.mvc.entities.Dossier;
import com.ificampus.mvc.entities.Personne;
import com.ificampus.mvc.services.IDossierService;

@Transactional
public class DossierServiceImpl implements IDossierService{

	private IDossierDao dao;
	public void setDao(IDossierDao dao) {
		this.dao = dao;
	}
	public Dossier save(Dossier entity) {
		return dao.save(entity);
	}
	public Dossier update(Dossier entity) {
		return dao.update(entity);
	}
	public List<Dossier> selectAll() {
		return dao.selectAll();
	}
	public Dossier getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);
		
	}
	public List<Dossier> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public Dossier findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public Dossier findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	@Override
	public Dossier getByCandidat(int id) {
		// TODO Auto-generated method stub
		return dao.getByCandidat(id);
	}
	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return dao.countAll();
	}

}
