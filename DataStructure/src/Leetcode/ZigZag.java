package Leetcode;
/*
P   A   H   N
A P L S I I G
Y   I   R 
*/
public class ZigZag {
	
	
	public String convert(String s, int numRows) {
		char[] str=s.toCharArray();
		int count=0;
		String valu="";
		
		//System.out.println(s.length()%numRows);
		int outsideCount=(s.length()/numRows)+((s.length()%numRows)-1);
		char[][] array=new char[numRows][outsideCount];
		for(int j=0;j<outsideCount && count<str.length;j++){
			for(int i=0;(i<numRows && count<str.length);i++){
				
				if(j%2==0){
					array[i][j]=str[count];
				}
				else{
					if(numRows%2==0){
						int mid=numRows/2;
						if(mid==i)
							array[i][j]=str[count];
						else
							array[i][j]=' ';
					}else if(numRows%2!=0 ){
						int mid=(numRows/2);
						if(mid==i){
							array[i][j]=str[count];
						}
						else{
							array[i][j]=' ';
						}
					}
				}
				count++;
				//System.out.print(str[i]);
			}
		}
		for(int i=0;i<numRows;i++){
			for(int j=0;j<outsideCount;j++){
				
					System.out.print(array[i][j] +" ");
					
			}
			System.out.println("\n");
		}
		return "";
	}
	public static void main(String[] args) {
		String value="PAYPALISHIRING";
		int numberOfRows=3;
		ZigZag zing=new ZigZag();
		zing.convert(value,numberOfRows);
	}
}
