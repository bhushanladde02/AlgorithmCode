package CCI;

public class Insertion_5_1 {
	public static int shiftedNumber(int N,int M,int i,int j){
		//i is for N and j is for M
		int makeAllOnce=~0;
		int leftShiftedNumber=makeAllOnce<<(j+1);
		int rightShiftedNumber=((1<<i)-1);
		int maskNumber=leftShiftedNumber|rightShiftedNumber;
		int clearBitsOfIToJRangeInN= N & maskNumber;
		int shiftMByI=M<<i;
		int result=clearBitsOfIToJRangeInN | shiftMByI;
		return result;
	}
	public static void main(String[] args) {
		int a[]=new int[32];
		int N=0b10000000000;
		int M=0b10011;
		//System.out.println(N);
		/*for(int i=0;i<Integer.toBinaryString(N).length();i++){
			a[i]=(((1<<i) & N)==1) ? 1 : 0 ;
			System.out.println(i+" : "+a[i]);
		}*/
		//int lengthOfN=Integer.toBinaryString(M).length();
		System.out.println(Integer.toBinaryString(shiftedNumber(N,M,2,4)));
		
		
		
	}
}
