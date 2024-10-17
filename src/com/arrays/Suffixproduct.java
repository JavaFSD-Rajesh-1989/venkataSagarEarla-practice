package com.arrays;

import java.util.Arrays;

public class Suffixproduct {

	public static void main(String[] args) {
//		int arr[]= {-1,1,0,-3,3};
//		int suffixProductArray[]=new int[arr.length];
//		suffixProductArray[arr.length-1]=arr[arr.length-1];
//		for(int i=arr.length-2;i>=0;i--) {
//			suffixProductArray[i]=suffixProductArray[i+1]*arr[i];
//		}
//		int j=1;
//		int arr1[]=new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			int mul=1;
//				for(int k=0;k<arr.length;k++) {
//					if(arr[k]!=j) {
//						mul=mul*arr[k];
//					}
//					
//				}
//				  if(mul>=0){
//			             arr1[i]=mul;
//			            }
//			           
//				j++;
//				
//			}
//		
//			
//			
//			
//		
//for (int i = 0; i < arr1.length; i++) {
//	System.out.print(arr1[i]+" ");
//}
//	}
//		String address = "1.1.1.1";
//		System.out.println(address.length());
//
//		StringBuilder sb=new StringBuilder();
//		for(int i=0;i<address.length();i++) {
//			char ch=address.charAt(i);
//		
//			if(ch=='.') {
//				address.replace(".", "[.]");
//			}
//		}
//		System.out.println(address);
		
		String  s = "codeleet";
				int indices []= {4,5,6,7,0,2,1,3};
				Arrays.sort(indices);
				 String str="";
			        for(int i=0;i<indices.length ;i++){
			        	int j=indices[i];
			           str=str+s.charAt(j);
			         
			        }	
			        System.out.println(str);
	}
}
