package CCI;
//implement ourself - try to dry run this program and then again implement it by our self
public class FlipBitToWin_5_3 {

	public static int flipBit(int a){
		int b=~a;
		if(b==0) // Remain to understand this condition
			return Integer.BYTES*8;
		/*if((b&1)==0){
			return Integer.BYTES*8; // this is base condition, i.e. return all 111 .. upto 32 bits
		}*/
		int currentLength=0;
		int previousLength=0;
		int maxLength=0;
		int previousMax=0;
		while(a!=0){
			if((a & 1)==1){
				currentLength++;
			}else if((a & 1)==0){
				//currentLength++;//and with 2 give us 2 in this case.
				previousLength=((a&2)==2 ? currentLength : 0); 
				currentLength=0;
			}
			maxLength=Math.max(currentLength+previousLength+1,maxLength);
			
			/*if(previousMax<maxLength){
				previousMax=maxLength;
			}*/
			
			a>>>=1;
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int result=flipBit(4);
		System.out.println(result);
		
		/*int a=15;
		System.out.println(~a);*/
		
		
		
	}
}
