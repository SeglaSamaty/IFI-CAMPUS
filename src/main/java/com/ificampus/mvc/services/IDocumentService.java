package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Document;

public interface IDocumentService {
	public Document save(Document entity);
	public void savedoc(Document entity);
	public Document update(Document entity);
	public List<Document>selectAll();
	public Document getById(int id);
	public void remove (int id);
	public List<Document>selectAll(String sortField, String sort);
	public Document findOneBy(String paramName, Object paramValue);
	public Document findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);

}
