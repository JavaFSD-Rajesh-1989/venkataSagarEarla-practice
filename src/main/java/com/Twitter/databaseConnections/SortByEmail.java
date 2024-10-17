package com.Twitter.databaseConnections;

import java.util.Comparator;

import com.Twitter.entity.TwitterEntity;

public class SortByEmail implements Comparator<TwitterEntity >{

//	String email;
//	String name;
//	String password;
//	String address;
//	public SortByEmail(String email) {
//		this.email=email;
//		
//	}
//	public int  callByEmail(TwitterEntity email1,TwitterEntity email2) {
//		int i=compare( o1,  o2);
//		return i;
//	}
	@Override
	public int compare(TwitterEntity o1, TwitterEntity o2) {
		return o1.getEmail().compareTo(o2.getEmail());
		
	}

	

}
