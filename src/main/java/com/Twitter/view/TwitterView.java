package com.Twitter.view;

import java.util.Scanner;

import com.Twitter.controller.TwitterController;
import com.Twitter.controller.TwitterControllerInterface;
import com.Twitter.databaseConnections.TwitterControllerFactory;

public class TwitterView {
	Scanner scan=new Scanner(System.in);
	public void view() {
//	TwitterControllerInterface tc=new TwitterController();
//above object creation is not following any design pattern
//we should create object of a class using creational design pattern from gof
//here we should use factory or singleton design pattern
TwitterControllerInterface tc=TwitterControllerFactory.createObject("user");
//we will never use new keyword because managing the memory will be diffcult
//so we will take the help of the factory ,as we will pass user createObject() will take the user
	 System.out.println("choose your options");
	 System.out.println("enter 1 to register");
	 System.out.println("enter 2 to viewAllProfiles");
	 System.out.println("enter 3 to viewProfile");
	 int choice =scan.nextInt();
	 switch(choice) {
	 case 1 :tc.createProfileController();
	          break;
	 case 2:tc.viewAllProfileController();
	         break;
	 case 3 :tc.viewProfileController();
	         break;
	  default:System.out.println("you have choosen wrong option");       
	 }
	}

}
