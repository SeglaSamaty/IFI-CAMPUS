package com.ificampus.mvc.services;

import java.util.List;

import com.ificampus.mvc.entities.Message;

public interface IMessageService {
	
	public Message save(Message entity);
	public Message update(Message entity);
	public List<Message>selectAll();
	public Message getById(int id);
	public void remove (int id);
	public List<Message>selectAll(String sortField, String sort);
	public Message findOneBy(String paramName, Object paramValue);
	public Message findOneBy(String[] paramNames, Object[] paramValues);
	public int findCountBy(String paramName, String paramValue);
	

}
