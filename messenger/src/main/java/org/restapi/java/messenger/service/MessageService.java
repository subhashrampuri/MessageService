package org.restapi.java.messenger.service;

import java.util.*;

import org.restapi.java.messenger.database.DatabaseClass;
import org.restapi.java.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService()
	{
		messages.put(1L, new Message(1L, "I too had a love story", "Ravinder Singh"));
		messages.put(2L, new Message(2L, "Can Love Happen Twice", "Ravinder Singh"));
	}
	public List<Message> getAllMessage() 
	{
		/*
		Message m1 = new Message(1L, "I too had a love story", "Ravinder Singh");
		Message m2 = new Message(2L, "Can Love Happen Twice", "Ravinder Singh");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		*/
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id)
	{
		return messages.get(id);
	}
	
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message)
	{
		if(message.getId() <=0)
		{
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id)
	{
		return messages.remove(id);
	}
	
	
	
}
