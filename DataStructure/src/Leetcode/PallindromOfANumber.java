package Leetcode;

public class PallindromOfANumber {
	public static boolean isPalindrome(int x) {
		if(x==0){
			return true;
		}else{
			String str=new Integer(x).toString();
			if(str.equals(new StringBuilder(str).reverse().toString())){
				return true;
			}else{
				return false;
			}
			
		}
	}
	public static void main(String[] args) {
		boolean result=isPalindrome(12321);
		System.out.println("finalize result value is : "+ result);
	}
}
