package com.ificampus.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ificampus.mvc.dao.IMessageDao;
import com.ificampus.mvc.entities.Message;
import com.ificampus.mvc.services.IMessageService;

@Transactional
public class MessageServiceImpl implements IMessageService{

	private IMessageDao dao;
	
	public void setDao(IMessageDao dao) {
		this.dao = dao;
	}
	
	public Message save(Message entity) {
		return dao.save(entity);
	}
	public Message update(Message entity) {
		return dao.update(entity);
	}
	public List<Message> selectAll() {
		return dao.selectAll();
	}
	public Message getById(int id) {
		return dao.getById(id);
	}
	public void remove(int id) {
		dao.remove(id);
	}
	public List<Message> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	public Message findOneBy(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}
	public Message findOneBy(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
