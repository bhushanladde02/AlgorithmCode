package Leetcode;
//130 / 988 test cases passed.
//Divide two integers without using multiplication, division and mod operator.
//https://discuss.leetcode.com/topic/23968/clean-java-solution-with-some-comment : Correct Solution Tough Problem
public class DivideTwoInteger {
	public static int divide(int dividend, int divisor){

		return helper(dividend, divisor,0,0);

	}
	public static int helper(int dividend, int divisor,int count,int i){

		if((dividend>=0 && divisor>0) && divisor> dividend){
			return i;
		}else if(count>=Math.abs(dividend) ){
			if((dividend>=0 && divisor>0) || (dividend<0 && divisor<0))
				return i;
			else
				return 0-i;
		}
		if(dividend>=Integer.MAX_VALUE || divisor<=Integer.MIN_VALUE){
			return Integer.MAX_VALUE;
		}

		i++;

		if(divisor>=0)
			count=count+divisor;
		else
			count=count-divisor;

		return helper(dividend,divisor,count,i);

	}

	public static void main(String[] args) {
		int result=divide(5,2);
		System.out.println(result);
		//System.out.println(Integer.MIN_VALUE);
	}
}
