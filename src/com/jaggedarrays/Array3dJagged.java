package com.jaggedarrays;

import java.util.Scanner;

public class Array3dJagged {

	public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
 int arr[][][]=new int [2][][];
    arr[0]=new int[2][];
    arr[1]=new int[1][];
    arr[0][0]=new int[3];
    arr[0][1]=new int[2];
    arr[1][0]=new int[3];
    for (int i = 0; i < arr.length; i++) {
		
		for (int j = 0; j < arr[i].length; j++) {
			for (int k = 0; k < arr[i][j].length; k++) {
				System.out.println("enter "+i+" th school "+j+" th class "+k+" th student marks");
				arr[i][j][k]=scan.nextInt();
			}
		}
	}
    for (int i = 0; i < arr.length; i++) {
		
		for (int j = 0; j < arr[i].length; j++) {
			for (int k = 0; k < arr[i][j].length; k++) {
				System.out.print(arr[i][j][k]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
	}


	}

}
