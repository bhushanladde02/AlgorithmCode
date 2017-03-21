package Extraproblem;
//http://www.geeksforgeeks.org/swap-all-odd-and-even-bits/

public class SwapAllOddAndEvenBits {

	public static int getOutput(int input){
		int valueright=10;
		int valueleft=5;
		int right=valueright & input;
		right = right >> 1; // right shift
		
		int left= input & valueleft;
		left= left << 1;  //left shift
		//System.out.println(left);
		
		return right | left;
	}
	
	public static void main(String[] args) {
		int x=13 ;//(1101);
		int out=getOutput(13);
		System.out.println(out);
		//require output(1110)
	
		
	}
}
