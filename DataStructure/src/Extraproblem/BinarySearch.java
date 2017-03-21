package Extraproblem;

public class BinarySearch {
	public static int binarySearch(int a[],int searchValue,int startIndex,int endIndex){
		if(endIndex<startIndex){	
		return -1;
		}
		int mid=(startIndex+endIndex)/2;
		if(a[mid]==searchValue){
			return mid;
		}else if(a[mid]>searchValue){
			return binarySearch(a,searchValue,startIndex,mid-1);
		}
		else{
			return binarySearch(a,searchValue,mid+1,endIndex);
		}
	}

	public static void main(String[] args) {
		int a[]={0,1,2,3,4,5};
		int result=binarySearch(a,7,0,a.length-1);
		System.out.println(result);
	}
}