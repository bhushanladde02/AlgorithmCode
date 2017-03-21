package CCI;

public class FibRecursive {
	/*public static int getFibo(int n){
		return helper(0,1,n);
	}
	public static int helper(int first,int second,int n){
		if(n<=0){
			return first+second;
		}
		return helper(second,first+second,n-2);
		
	}
	public static void main(String[] args) {
		System.out.println(getFibo(7));
	}*/
	//2^n time complexity
	public static int getFibRecursive(int n){
		if(n==2)
			return 1;
		if(n==1)
			return 0;
		
		return getFibRecursive(n-1)+getFibRecursive(n-2);
	}
		
	
	public static int getFiboIter(int n){
		int first=0;
		int second=1;
		
		while(n!=2){
			int result=first+second;
			first=second;
			second=result;
			n--;
		}
		return second;
	}
	
	public static void main(String[] args) {
		System.out.println(getFiboIter(100));
		System.out.println(getFibRecursive(100));
	}
	
}
