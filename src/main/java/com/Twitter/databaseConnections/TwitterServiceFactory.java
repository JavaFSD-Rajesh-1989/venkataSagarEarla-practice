package com.Twitter.databaseConnections;

import com.Twitter.service.TwitterService;
import com.Twitter.service.TwitterServiceInterface;
//singleton design factory
//here we are creating the object only once
//first we will check if object is there or not if object is there we wont create again object
public class TwitterServiceFactory {
private static TwitterServiceInterface  ts=null;
	private TwitterServiceFactory() {
		
	}

	public static TwitterServiceInterface creatObject(String n) {
		System.out.println("the value of n is"+n);
		if(n.equals("user")) {
			System.out.println("n is equal to the user");
			if(ts==null) {
				ts=new TwitterService();
				System.out.println(ts);
				return ts;
			}
		}
		return null;
	}

}
