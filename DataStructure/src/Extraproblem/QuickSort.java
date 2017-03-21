package Extraproblem;

import CCI.Util;

public class QuickSort {
	public static void quickSort(int a[],int start,int end){
		int index=helper(a,start,end);
		if(start<index-1){
			//sort the left side the array
			quickSort(a,start,index-1);
		}if(index<end){
			//sort the right side of an array
			quickSort(a,index,end);
		}
	}
	public static int helper(int a[],int start,int end){
		//let's assume pivot as mid element
		int mid=(start+end)/2;
		int pivot=a[mid];
		while(start<=end){//once they are equal then they start and end move towards to breaking loop condition
			while(a[start]<pivot) start++;
			while(a[end]>pivot)end--;
			//swap the element her
			if(start<=end){// once they are equal then they will go into negative values
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
		}
		return start;
	}
	
	
	public static void main(String[] args) {
		int a[]=Util.getIntegerArray();
		System.out.println("Before sort :");
		Util.printArray(a);
		quickSort(a,0,a.length-1);
		System.out.println("After sort  :");
		Util.printArray(a);
	}

}
