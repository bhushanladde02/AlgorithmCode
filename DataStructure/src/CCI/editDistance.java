package CCI;

public class editDistance {

	public static int editDistDp(String str1,String str2){
		int[][] table=new int[str1.length()+1][str2.length()+1];
		//table[]
		int i=0,j=0;
		for(i=0;i<=str1.length();i++){
			for(j=0;j<=str2.length();j++){
				if(i==0){
					table[i][j]=j;
				}
				else if(j==0){
					table[i][j]=i;
				}
				else{
					char str1Char=str1.charAt(i-1);
					char str2Char=str2.charAt(j-1);
					if(str1Char==str2Char){
						table[i][j]=table[i-1][j-1];
					}
					else{
						if(i!=0 && j!=0){
							//find minimum from last three nearest cells
							table[i][j]=1+findMin(table[i-1][j],table[i-1][j-1],table[i][j-1]);
						}
						
					}
				}
			}
		}
		return table[i-1][j-1];
	}
	public static int findMin(int a,int b,int c){
		if(a<b && a<c)
			return a;
		else if (b<a && b<c)
			return b;
		else if (b==a && b<c)
			return b;
		else if (b==c && b<a)
			return b;
		else
			return c;
		//return Math.min(a,Math.min(b,c));
	}

	/*public static int editDist(String str1, String str2){

		int length1s=str1.length();
		int length2s=str2.length();
		return helper(str1,str2,length1s,length2s);

	}
	public static int helper(String str1,String str2,int length1,int length2){
		if(length2<=0){
			return length1;
		}
		if(length1<=0){
			return length2;
		}
		if(str1.charAt(length1-1)==str2.charAt(length2-1)){
			return helper(str1,str2,length1-1,length2-1);
		}
		//No matter what we wil have cost 1
		return 1 +
				Math.min(helper(str1,str2,length1,length2-1), // insert
						Math.min(helper(str1,str2,length1-1,length2), // delete 
								 helper(str1,str2,length1-1,length2-1))); // replace
	}
	 */	
	public static void main(String[] args) {
		String str1="cat";
		String str2="cut";
		int result=editDistDp(str1,str2);
		System.out.println(result);
	}

}
