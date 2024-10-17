package com.jaggedarrays;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		int arr[][]=new int[2][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter class"+i+"student"+j);
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Arrays contnets are");{
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}

	}
	
}
