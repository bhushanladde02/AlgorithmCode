package CCI;

public class SparseSearch_10_5 {

	//below is in o(logn)
	public static int binarySe(String[] str,int start,int end, String search){

		//		int count=0;
		//		for(int i=0;i<str.length;i++){
		//			if(str[i]==null || str[i].equals("")){
		//				count++;
		//			}else if(str[i].equals(search)){
		//				System.out.println(count);
		//				break;
		//			}else{
		//				count++;
		//			}
		//		}
		if(start>end)
		{
			return -1;
		}
		int mid=(start+end)/2;
		//System.out.println(str[mid]);
		//System.out.println(" Value : "+str[mid].compareTo(search));
		if(!str[mid].isEmpty()){
			
			if(str[mid].compareTo(search)==0){
				return mid;
			}
			else if(str[mid].compareTo(search)==1){
				return binarySe(str,start,mid-1,search);
			}else
			{
				return binarySe(str,mid+1,end,search);
			}
		}else{
			int leftEnd=mid-1;
			int rightStart=mid+1;
			int leftResult = binarySe(str,start,leftEnd,search);
		    int rightResult = binarySe(str,rightStart,end,search);
		   
		   return Math.max(leftResult, rightResult);
		}
	}

	//below is in O(n)
	public static void find(String[] str,String search){
		int count=0;
		for(int i=0;i<str.length;i++){
			if(str[i]==null || str[i].equals("")){
				count++;
			}else if(str[i].equals(search)){
				System.out.println(count);
				break;
			}else{
				count++;
			}
		}

	}

	public static void main(String[] args) {
		String[] str={"at","","","","ball","","","car","","","dad","",""};
		//find(str,"ball");
		int a=binarySe(str,0,str.length-1,"ball");
		System.out.println(a);
	}
}
