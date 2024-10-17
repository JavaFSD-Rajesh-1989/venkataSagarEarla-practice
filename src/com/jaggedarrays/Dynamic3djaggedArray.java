package com.jaggedarrays;

import java.util.Scanner;

public class Dynamic3djaggedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[][][]=new int[2][][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the number of classes in "+i+" th school");
			arr[i]=new int[scan.nextInt()][];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter the number of students in "+i+" th school "+j+"class");
				arr[i][j]=new int[scan.nextInt()];
			}
		}
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
