package Code;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	
    	Scanner scan=new Scanner(System.in);
    	int a=scan.nextInt();
    	//String line=scan.next();
    	for(int i=0;i<a;i++){
    		String  line=scan.next();
    		int ad=scan.nextInt();
        	getChar(line,ad);
        	
    	}
    	
    	//scan.next
    	//System.out.println("value read is::"+a);
    	
    	
    }
    public static void getChar(String line,int ad){
    	String check=line;
    	StringBuffer finalString=new StringBuffer();
    	//System.out.println(check.substring(0,2));
    	char[] charArr=check.toCharArray();
    	List<String> list=new ArrayList<String>();
    	for( int c = 0 ; c < charArr.length ; c++ )
        {
           for( int i = 1 ; i <= charArr.length - c ; i++ )
           {
             String sub = check.substring(c, c+i);
             list.add(sub);
             //System.out.println(sub);
           }
        }
    	Collections.sort(list);
    	for(String l: list){
    		finalString.append(l);
    	}
    	System.out.println(finalString.toString());
    	//System.out.println();
    	System.out.println(finalString.toString().charAt(ad-1));
    	
    }
}