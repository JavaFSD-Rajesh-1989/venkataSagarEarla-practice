package com.arrays;

public class Slidingwindow {

	public static void main(String[] args) {
	int arr[]= {1,9,-1,-2,7,3,-1,2};
		
	int k=4;
	int sum=0;
	int max=0;
	for(int i=1;i<=arr.length-k;i++) {
		sum=0;
		for(int j=i;j<i+k;j++) {
			sum=sum+arr[j];
		}
		if(sum>max) {
			max=sum;
		}
	}

	System.out.println(max);

}
	
//	int sum=0;
//	for(int i=0;i<arr.length;i++) {
//		sum=sum+arr[i];
//	}
//     System.out.println(sum);
//	}
}
