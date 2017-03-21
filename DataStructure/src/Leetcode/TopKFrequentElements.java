//TO DO
package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Set<Integer>[] buckets = new Set[nums.length+1];
		//Set<Integer> set=new HashSet<Integer>();

		for(int p=0;p<buckets.length;p++){
			buckets[p]=new HashSet<Integer>();
		}
		List<Integer> list=new ArrayList<Integer>(); 
		HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(hash.containsKey(nums[i])){
				Integer fetchValue=(Integer)hash.get(nums[i]);
				fetchValue=fetchValue+1;
				hash.put(nums[i], fetchValue);
			}else{
				hash.put(nums[i], 1);
			}
		}

		for(int i=0;i<nums.length;i++){
			if(hash.containsKey(nums[i])){
				Integer fetchValue=(Integer)hash.get(nums[i]);
				buckets[fetchValue].add(nums[i]);
			}
		}
		int count=0;
		for(int p=buckets.length-1;p>=0;p--){
			if(!buckets[p].isEmpty()){
				if(count==k){
					break;
				}
				list.addAll(buckets[p]);
				count=count+buckets[p].size();
			}
		}
		return list;   
	}
	public static void main(String[] args) {
		TopKFrequentElements topK=new TopKFrequentElements();
		int a[]={4,1,-1,2,-1,2,3};	
		int b=2;
		List<Integer> list=topK.topKFrequent(a, b);
		for(Integer value : list){
			System.out.println(value);
		}



	}
}
