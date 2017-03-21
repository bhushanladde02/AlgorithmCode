package CCI;

public class PallindromePermutations1_4 {

	public static void calPerm(String input){
		int length=input.length();
		//total length is 2
		String sub=input.substring(1, length-1);
		System.out.println(sub);
	}
	public static void main(String[] args) {
		String name="abc";
		calPerm(name);
	}
}
