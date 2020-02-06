package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IDocumentDao;
import com.ificampus.mvc.entities.Document;
import com.ificampus.mvc.services.IDocumentService;

@Transactional
public class DocumentServiceImpl implements IDocumentService {

	private IDocumentDao dao;
	
	public void setDao(IDocumentDao dao) {
		this.dao = dao;
	}
	public Document save(Document entity) {	
		return dao.save(entity);
	}
	@Override
	public void savedoc(Document entity) {
		dao.savedoc(entity);
	}
	public Document update(Document entity) {
		return dao.update(entity);
	}
	public List<Document> selectAll() {
		return dao.selectAll();
	}
	public Document getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);
	}
	public List<Document> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public Document findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public Document findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	

}
