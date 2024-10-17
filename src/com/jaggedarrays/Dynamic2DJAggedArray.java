package com.jaggedarrays;

import java.util.Scanner;

public class Dynamic2DJAggedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	int arr[][]=new int [3][];
	for(int i=0;i<arr.length;i++) {
		System.out.println("enter 2d length for"+i+"th array");
		arr[i]=new int[scan.nextInt()];
	}
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter the "+i+"th class"+j+"student marks");
				arr[i][j]=scan.nextInt();
			}
		}

        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
