//https://leetcode.com/problems/find-peak-element/
package Leetcode;

public class FindPickInOneDimentionArray {

	public int findPeakElement(int[] nums) {
		int low=0;
		int high=nums.length-1;
		return getPick(nums,low,high);
	} 

	public int getPick(int nums[],int low,int high){
		// Find index of middle element
		int value=-99;
		int mid =0;
		System.out.println("I am calling my self");
		
		if((nums.length%2) == 0 ){
			mid = low + (high - low + 1)/2;				
		}
		else{
			 mid = low + (high - low)/2;
		}
		if(nums[mid] > nums[mid+1] &&  nums[mid] > nums[mid-1]){
			value=mid;
		}
		if(nums[mid] < nums[mid-1]){
			low=0;
			high=mid;
			getPick(nums,low,high);
		}
		if(nums[mid] < nums[mid+1]){
			low=mid;
			high=nums.length;
			getPick(nums,low,high);
		}
		return value;
	}
	public static void main(String[] args) {
		FindPickInOneDimentionArray find=new FindPickInOneDimentionArray();
		int nums[]={1, 2, 3, 1};
		int midValue=find.findPeakElement(nums);
		System.out.println("index is :"+midValue);
		System.out.println("value is :"+nums[midValue]);
	}
}

