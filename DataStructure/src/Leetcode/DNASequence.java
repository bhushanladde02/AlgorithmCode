//charcter comparision expension
package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DNASequence {
	public List<String> findRepeatedDnaSequences(String s) {
		HashMap hash=new HashMap();
		List<String> stringList=new ArrayList<String>();
		for(int i=0;i<s.length()-9;i++){
			String subString=s.substring(i, i+10);
			if(hash.containsKey(subString)){
				int value=(int)hash.get(subString);
				value=value+1;
				System.out.println("I am comming here");
				stringList.add(subString);
			}else{
				hash.put(subString, 1);	
			}
		}
		return stringList;
    }
	public static void main(String[] args) {
		//String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		String s = "AAAAAAAAAAAA"; //creating problem
		DNASequence dna=new DNASequence();
		List<String> stringList=dna.findRepeatedDnaSequences(s);
		for(String str:stringList){
			System.out.println(str);			
		}
	}

}
