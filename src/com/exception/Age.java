package com.exception;

import java.util.Scanner;

public class Age {
	
	public static void main(String[] args) {
		 
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter your age");
		 int age=scan.nextInt();
		 try {
			 license(age);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}
public  static void license(int age) throws OverAgeException,UnderAgeException {
	
	if(age>=18 && age<=60) {
		System.out.println("you can apply to license");
	}
	else if(age<18) {
		throw new UnderAgeException();
	}else {
		throw new OverAgeException();
	}
}

}
