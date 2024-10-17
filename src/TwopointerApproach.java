import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwopointerApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {3,3};
		int target=6;
		int arr1[]=twoSum(nums,target);
	for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
	}
		
		

	}
	 public static  int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> indexMap = new HashMap<>();

	        // Populate the map with the original indices
	        for (int i = 0; i < nums.length; i++) {
	            indexMap.put(nums[i], i);
	        }
	        Arrays.sort(nums);
	        int arr[]=new int[2];
	        int start=0;
	        int end=nums.length-1;
	        while(start<end){
	           int sum= nums[start]+nums[end];
	            if(sum==target){
//	            	  arr[0]=indexMap.get(nums[start]);
//	                  arr[1]=indexMap.get(nums[end]);
//	                  break;
	                  arr[0]=start;
	                  arr[1]=end;
	                  break;
	            }
	            else if(sum>target){
	                start++;
	            }
	            else{
	                end--;
	            }
	        }
	        return arr;
	    }
}
	        
	        
