package org.restapi.java.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import org.restapi.java.messenger.model.Message;
import org.restapi.java.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messsagService = new MessageService();
		
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages()
	{
		return messsagService.getAllMessage();
	}
	
}
