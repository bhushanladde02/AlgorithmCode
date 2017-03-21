package Leetcode;

public class ReverseNumber {
	public int reverse(int x) {
		int sum=0;
		int count=0;
		while(x!=0){
		  count++;
		  int lastDigit=x%10;
		  System.out.println(lastDigit);
		  sum=sum*10+lastDigit;
		  x=x/10;
		}
		Long chk=new Long(x);
		System.out.println(chk.compareTo(new Long(0)));
		if(count>9 && x>0)
		return 0;	
		else
		return sum;
	}

	public static void main(String[] args) {
		ReverseNumber reverse=new ReverseNumber();
		int pValue=reverse.reverse(1534236469);
		//int pValue=reverse.reverse(-2147483412);
		System.out.println(pValue);
	}
}
