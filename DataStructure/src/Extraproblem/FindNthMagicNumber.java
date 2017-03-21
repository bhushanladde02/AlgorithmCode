package Extraproblem;

public class FindNthMagicNumber {
	public static double findNthMagicNumber(int n){
		double magicNu5=1;
		int result=0;
		/*for(int i=0;i<n;i++){
			System.out.println(((1<<i)& n));
			if(((1<<i)& n) !=0)
			magicNu5=magicNu5+Math.pow(5,(1<<i)& n);
		}*/
		 	
		while(n>0){
			magicNu5=magicNu5*5;
			if((n&1)==1)
				result=(int) (result+magicNu5);
			n=n>>1;
		}

		return result;
	}
	public static void main(String[] args) {
		double result=findNthMagicNumber(4);
		System.out.println(result);
	}
}
