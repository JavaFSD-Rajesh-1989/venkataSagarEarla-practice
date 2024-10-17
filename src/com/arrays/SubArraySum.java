package com.arrays;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[]= {1,2,3,4,5};
//		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
//		int arr[]={-2 ,1 ,-3 ,4 ,-1 ,2 ,1 ,-5 ,4};
		int arr[]= {-10,-2,-3,-4};
		System.out.println(findMaxSum(arr));
//		int maxSum=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			
// 			for(int j=i;j<arr.length;j++) {
//				int sum=0;
//				for(int k=i;k<=j;k++) {
//					System.out.print(arr[k]);
//					sum=sum+arr[k];
//					maxSum=Math.max(maxSum, sum);
//				}
//				System.out.println();
//				
//			}
//		}
//System.out.println(maxSum);
//		int maxSum=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			int sum=0;
//			for(int j=i;j<arr.length;j++) {
//				sum=sum+arr[j];
//				maxSum=Math.max(maxSum, sum);
//			}
//		}
//		System.out.println(maxSum);
//		int maxSum=Integer.MIN_VALUE;
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum=sum+arr[i];
//			if(sum>maxSum) {
//				maxSum=sum;
//			}
//			if(sum<0) {
//				sum=0;
//			}
//			
//		}
//		System.out.println(maxSum);
		
		
		
		
		
	}
	public  static long findMaxSum(int arr[]) {
		 long minMax=Integer.MIN_VALUE;
	        long maxSum=0;
	        long sum=0;
	        for(int i=0;i<arr.length;i++){
	            sum=sum+arr[i];
	            System.out.println("Sum is "+sum);
	            if(sum>maxSum){
	                maxSum=sum;
	                System.out.println("MAxSum is "+maxSum);
	            }
	            if(sum<0) {
	            	sum=0;
	            }
	        }
	       
	        if(maxSum!=0){
	            return maxSum;
	        }
	        else{
	            for(int i=0;i<arr.length;i++){
	            if(arr[i]>minMax){
	                minMax=arr[i];
	            }
	        } 
	        } 
		     System.out.println(Integer.MAX_VALUE);
	     return minMax;

		
	}
	

}
