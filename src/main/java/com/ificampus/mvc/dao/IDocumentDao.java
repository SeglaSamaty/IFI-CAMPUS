package com.ificampus.mvc.dao;

import com.ificampus.mvc.entities.Document;

public interface IDocumentDao extends IGenericDao<Document>{

	void savedoc(Document uploadFile);

}
