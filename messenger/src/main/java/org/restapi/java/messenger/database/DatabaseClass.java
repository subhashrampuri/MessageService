package org.restapi.java.messenger.database;

import java.util.*;

import org.restapi.java.messenger.model.Message;
import org.restapi.java.messenger.model.Profile;

public class DatabaseClass {

	public static HashMap<Long, Message> messages = new HashMap<>();
	public static HashMap<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages()
	{
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles()
	{
		return profiles;
	}
}
