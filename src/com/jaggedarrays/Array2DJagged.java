package com.jaggedarrays;

import java.util.Scanner;

public class Array2DJagged {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	int arr[][]=new int[3][];
	arr[0]=new int[2];
	arr[1]=new int [3];
	arr[2]=new int[2];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter"+i+"th school "+j+"th student marks");
			arr[i][j]=scan.nextInt();
		}
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}

}
