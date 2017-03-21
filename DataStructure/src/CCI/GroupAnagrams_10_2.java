package CCI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_10_2 {
	public static void main(String[] args) {
		String strA[]={"eat","tea","tan","ate","nat","bat"};
		HashMap<String,ArrayList<String>> hash=new HashMap<String,ArrayList<String>>();
		for(String str:strA){
			char a[]=str.toCharArray();
			Arrays.sort(a); //Quick Sort (o(nlogn))
		    String sortedstr=new String(a);
		    if(hash.get(sortedstr)==null){
		    	ArrayList<String> arra=new ArrayList<String>();
		    	arra.add(str);
		    	hash.put(sortedstr,arra);
		    }else{
		    	ArrayList<String> arra=hash.get(sortedstr);
		    	arra.add(str);
		    };
			//System.out.println(str.toCharArray());
		}
		System.out.println(hash.size());
		for (Map.Entry<String, ArrayList<String>> entry : hash.entrySet())
		{
		    //System.out.println(entry.getKey() + "/" + entry.getValue());
		    ArrayList<String> arr= entry.getValue();
		    //System.out.println(arr.size());
		    System.out.print("[");
		    for(String strC : arr){
		    	System.out.print(strC);
		    	System.out.print(",");
		    }
		    System.out.println("]");
		}
		/*for(String str:strA){
			char a[]=str.toCharArray();
			Arrays.sort(a); //Quick Sort (o(nlogn))
		    String sortedstr=new String(a);
		    ArrayList<String> arr=hash.get(sortedstr);
		    System.out.println(arr.size());
		    for(String strC : arr){
		    	System.out.println(strC);
		    }
		}*/
	}
}
