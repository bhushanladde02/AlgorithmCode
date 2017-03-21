package Shobhaki;

import CCI.Util;

public class InsertionSort {
	
	public static int insertion(int a[]){
		for(int i=1;i<a.length;i++){
			int element = a[i];
			for(int j=i;j>0;j--){
				if(a[j-1]>element){
					//int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=element;
				}
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		int a[]=Util.getIntegerArray();
		System.out.println("Before sort :");
		Util.printArray(a);
		insertion(a);
		System.out.println("After sort  :");
		Util.printArray(a);
	}

}
