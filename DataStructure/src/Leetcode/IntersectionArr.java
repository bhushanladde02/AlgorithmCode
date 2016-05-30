package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionArr {

	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<nums1.length;i++){
			int value=nums1[i];
			for(int j=0;j<nums2.length;j++){
				int value2=nums2[j];
				if(value==value2){
					list.add(value);
					nums1[i]=-99999;
					nums2[j]=-88888;
				
					break;
				}
			}
		}
		Integer[] num4=null;
		Object[] o=list.toArray();
		int[] num3=null;
		if(list.size()!=0){
			num4= Arrays.copyOf(o, o.length, Integer[].class);  
			num3=new int[num4.length];
			for(int h=0;h<num4.length;h++){
				num3[h]=num4[h].intValue();
				System.out.println(num3[h]);
			}
		}
		else
			num3=new int[0];
		return num3;
	}
	public static void main(String[] args) {
		IntersectionArr inter=new IntersectionArr();
		int num1[]={6,6,4,4,0,0,8,1,2};
		int num2[]={6};
		inter.intersect(num1, num2);
	}
}
