package Leetcode;
/*
nums1 = [1, 2]
nums2 = [3, 4]
The median is (2 + 3)/2 = 2.5 
 */

public class CalculateMedian {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double medianValue;
		double[] numsresult=new double[nums1.length+nums2.length];	 
		CalculateMedian cal=new CalculateMedian();
		numsresult=cal.mearge(nums1,nums2);
		if(numsresult.length%2!=0){
			int medianIndex=(0+numsresult.length)/2;
			medianValue=numsresult[medianIndex];
		}else{
			int medianIndex=(0+numsresult.length)/2;
			double value1=numsresult[medianIndex];
			double value2=numsresult[medianIndex-1];
			medianValue=(value1+value2)/2;
		}
		return medianValue;      
	}	

	public double[] mearge(int nums1[],int nums2[]){
		double resultArray[]=new double[nums1.length+nums2.length];
		int i=0,j=0;
		int count=0;
		
		while((i<nums1.length && nums1.length!=0) && (j<nums2.length && nums2.length!=0)){
			if(nums1[i]<nums2[j]){ 
				resultArray[count]=nums1[i];
				count++;
				i++;
			}else{
				resultArray[count]=nums2[j];
				count++;
				j++;
			}
		}
		while(i<nums1.length && nums1.length!=0){
			resultArray[count]=nums1[i];
			count++;
			i++;
		}
		
		while(j<nums2.length && nums2.length!=0){
			resultArray[count]=nums2[j];
			count++;
			j++;
		}
		
		return resultArray;

	}


	public static void main(String[] args) {
		int arra[]={3};
		int arrb[]={};
		CalculateMedian cal=new CalculateMedian();
		double out=cal.findMedianSortedArrays(arra, arrb);
		System.out.println(out);
	}
}
