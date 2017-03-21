package Shobhaki;

public class GetMedian {
	public static int getMedian(int a, int b , int c) {
	    int x = a-b;
	    int y = b-c;
	    int z = a-c;
	    if(x*y > 0) return b;
	    if(x*z > 0) return c;
	    return a;
	}
	public static void main(String[] args) {
		int result=getMedian(33,1,2);
		System.out.println(result);
	}
}
