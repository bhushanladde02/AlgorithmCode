package Extraproblem;
//http://www.geeksforgeeks.org/sum-of-bit-differences-among-all-pairs/
//understand it from geekforgeeks and then implemented it!!!!
//try to dry run again and again
public class SumOfBitDifferencesAmongAllPairs {

	/*public static int countNumberOfDifferentCharacterInSet(int a,int b){
		int count=0;
		while(a!=0){
			//System.out.println(b^a);
			if((b^a)!=0)
				count++;
			a=a>>1;
		}
		return count;
	}
*/
	public static int calculate(int a[],int size){
		int ans=0;
		for(int i=0;i<32;i++){
			int count=0;
			for(int j=0;j<size;j++){
			
				if((a[j] & 1<<i)!=0){
					count++;
				}
			}
			ans=ans+(count * (size-count) * 2);
		}
		return ans;
	}
	public static void main(String[] args) {
		int a[]={1,3,5};
		int result=calculate(a,a.length);
		System.out.println(result);
		/*int a[]={1,2};
		int powerSet=(int) Math.pow(2, a.length);
		for(int i=0;i<powerSet;i++){
			System.out.print("{");
			for(int j=0;j<a.length;j++){
				if((i & (1<<j))!=0 )
					System.out.print(""+a[j]);
			}
			System.out.print("}");
		}
		
		int result=countNumberOfDifferentCharacterInSet(2,7);
		System.out.println("\n"+result);*/
		
	}
}
