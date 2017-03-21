package Leetcode;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/?tab=Submission

import java.util.HashMap;

public class LongestSubstring {

	public static int lengthOfLongestSubstring(String s){
		if(s.isEmpty()){
			return 0;
		}
		int startIndex=0;
		int endIndex=0;
		int stringLengh=0;
		HashMap map=new HashMap();
		char prev=' ',ch=' ';
		for(int i=0;i<s.length();i++){
			ch=s.charAt(i);
			if(map.containsKey(ch)){
				startIndex=(int)map.get(ch)+1;
				map.put(ch, i);
				endIndex=0;
			}else{
				map.put(ch, i);
				endIndex=i;
			}

			if((endIndex-startIndex)>stringLengh){
				stringLengh=endIndex-startIndex;
			}
		}
		return stringLengh+1;   
	}

	public static void main(String[] args) {
		String input="tmmzuxt";
		int result=lengthOfLongestSubstring(input);
		System.out.println(result);
	}
}
