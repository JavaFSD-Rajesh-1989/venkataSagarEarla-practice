package com.arrays;

public class Non_DecresingOrder {

	public static void main(String[] args) {
		int n=3;
		int d[]= {1,2,3};
		int count=0;
        for(int i=0;i<n-1;i++){
            if(d[i]<=d[i+1]){
             count++;
             
         
   }
   else{
       continue;
   }
}
if(count==n-1){
   System.out.println("Yes");
}
else{
   System.out.println("No");
}

	}

}
