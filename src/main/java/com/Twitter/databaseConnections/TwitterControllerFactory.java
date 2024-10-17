package com.Twitter.databaseConnections;

import com.Twitter.controller.TwitterController;
import com.Twitter.controller.TwitterControllerInterface;
//factory design 
public class TwitterControllerFactory {
	private  TwitterControllerFactory() {
		
	}

	public static TwitterControllerInterface createObject(String n) {
		if(n.equals("user")) {
			return new TwitterController();
		}
		return null;
	}

}
