package com.Twitter.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.Twitter.databaseConnections.SortByEmail;
import com.Twitter.databaseConnections.TwitterServiceFactory;
import com.Twitter.entity.TwitterEntity;
import com.Twitter.service.TwitterService;
import com.Twitter.service.TwitterServiceInterface;

public class TwitterController implements TwitterControllerInterface {
	Scanner sc=new Scanner(System.in);
	Logger log=Logger.getLogger("TwitterController");
	@Override
	public void createProfileController() {
//		TwitterServiceController 
		int i=0;
		System.out.println("Enter name ");
		String name=sc.next();
		System.out.println("Enter Email ");
		String email=sc.next();
		System.out.println("Enter Password ");
		String password=sc.next();
		
		System.out.println("Enter Address ");
		String address=sc.next();
		TwitterEntity twitterUser=new TwitterEntity();
		twitterUser.setName(name);
		twitterUser.setEmail(email);
		twitterUser.setPassword(password);
		twitterUser.setAddress(address);
		TwitterServiceInterface tsi=new TwitterService();
		i=tsi.createUser(twitterUser);
//		if(i>0) {
//			System.out.println("user is created");
//			
//		}else {
//			System.out.println("user is not created");
//		}
//if we want to store our log information inside the c drive file there is one xml file we have configure log4j.xml	log4j.dtd	
		if(i>0) {
			log.info("profile created "+LocalDateTime.now());
		}
		else {
			log.error("could not create profile");
		}
		
	}

	@Override
	public void viewAllProfileController() {
		//we are using the interface to maintain the low coupling
//		TwitterServiceInterface tsi=new TwitterService();
		TwitterServiceInterface tsi=TwitterServiceFactory.creatObject("user");
		System.out.println("the value of tsi inside viewAllProfile is"+tsi);
		List<TwitterEntity> users=tsi.viewAllUsers();
		System.out.println("before sorting");
		for (TwitterEntity user : users) {
			System.out.println("user name is  "+user.getName());
			System.out.println("user email is  "+user.getEmail());
			System.out.println("user password "+user.getPassword());
			System.out.println("user address "+user.getAddress());
		}
//		System.out.println("after sorting");
//		System.out.println("enter your choice");
//		System.out.println("enter 1 to sort by name");
//		System.out.println("enter 2 to sort by email");
//		System.out.println("enter 3 to sort by password");
//		System.out.println("enter 4 to sort by address");
//		int choice=sc.nextInt();
//		switch(choice) {
//		case 1:Collections.sort(users, new SortByEmail());
//		break;
//		default:System.out.println("you have entered wrong options");
//		}
		Collections.sort(users, new SortByEmail());
		for (TwitterEntity user : users) {
			System.out.println("user name is  "+user.getName());
			System.out.println("user email is  "+user.getEmail());
			System.out.println("user password "+user.getPassword());
			System.out.println("user address "+user.getAddress());
		}
		
	}

	@Override
	public void viewProfileController() {
		
		TwitterEntity user= new TwitterEntity();
		System.out.println("enter your email");
		String email=sc.next();
		user.setEmail(email);
		TwitterServiceInterface tsi=new TwitterService();
		TwitterEntity twitterUser=tsi.viewUserProfile(user);
		if(twitterUser!=null) {
			System.out.println(twitterUser.getName());
			System.out.println(twitterUser.getEmail());
			System.out.println(twitterUser.getPassword());
			System.out.println(twitterUser.getAddress());
		}else {
			System.out.println("user is not found with email: "+user.getEmail());
		}
		
		
		
	}

}
