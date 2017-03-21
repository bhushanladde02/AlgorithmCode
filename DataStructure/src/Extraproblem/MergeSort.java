package Extraproblem;
//incomplete
//understan the cal stack
//get clarified from pradeep
import CCI.Util;

public class MergeSort {
	public static void sort(int a[],int helper[],int startIndex,int endIndex){
		if(startIndex<endIndex){
			int mid=(startIndex+endIndex)/2;
			sort(a,helper,startIndex,mid);
			sort(a,helper,mid+1,endIndex);
			merge(a,helper,startIndex,mid,endIndex);
		}
	}
	public static void merge(int a[],int helper[],int startIndex,int mid,int endIndex){
		
		for(int h=startIndex;h<=endIndex;h++){
			helper[h]=a[h];//put the content in an helper array and they copy them into final array from start index
		}
		int i=startIndex;
		int j=mid+1;
		int k=startIndex;
		while(i<=mid && j<=endIndex){
			if(helper[i]<=helper[j]){
				a[k]=helper[i];
				i++;
			}else{
				a[k]=helper[j];
				j++;
			}
			k++;
		}
		int remaining=mid-i;
		int p=0;
		while(p<=remaining){
			a[k+p]=helper[i+p];
			p++;
		}
	}
	public static void main(String[] args) {
		int a[]=Util.getIntegerArray();
		System.out.println("Before : ");
		Util.printArray(a);
		sort(a,new int[a.length],0,a.length-1);
		System.out.println("After  : ");
		Util.printArray(a);
	}
}
