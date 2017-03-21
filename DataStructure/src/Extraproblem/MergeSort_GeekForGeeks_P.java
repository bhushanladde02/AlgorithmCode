package Extraproblem;

import CCI.Util;

public class MergeSort_GeekForGeeks_P {

	public static void sort(int a[],int startIndex,int endIndex){
		if(startIndex<endIndex){
			int mid=(startIndex+endIndex)/2;
			sort(a,startIndex,mid);
			sort(a,mid+1,endIndex);
			merge(a,startIndex,mid,endIndex);
		}
	}
	public static void merge(int a[],int startIndex,int mid,int endIndex){
		int m=0,n=0;
		m=mid-startIndex+1;
		n=endIndex-mid;
		int left[]=new int[m];
		int right[]=new int[n];

		int k=startIndex;

		for (int i=0; i<m; ++i)
			left[i] = a[startIndex + i];
		
		for (int j=0; j<n; ++j)
			right[j] = a[mid + 1+ j];
		int i=0,j=0	;
		while(i<m && j<n){
			if(left[i]<=right[j]){
				a[k]=left[i];
				i++;
				k++;
			}else {
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while (i < m)
		{
			a[k] = left[i];
			i++;
			k++;
		}

		while (j < n)
		{
			a[k] = right[j];
			j++;
			k++;
		}

	}



	/*	public static int[] sort(int a[],int startIndex,int endIndex){

		if(startIndex>endIndex){
		}

		int mid=(startIndex+endIndex)/2;
		int left[]=sort(a,startIndex,mid-1);
		int right[]=sort(a,mid,endIndex);
		return merge(left,right);
	}
	public static int[] merge(int startIndex[],int endIndex[]){
		//System.out.println(a[startIndex]);
		int i=0,j=0,count=0;
		int[] resultArray=new int[startIndex.length+endIndex.length];
		while(i<startIndex.length && j<endIndex.length){
			if(startIndex[i]<endIndex[j]){
				resultArray[count]=startIndex[i];
				i++;
				count++;
			}else{
				resultArray[count]=endIndex[j];
				j++;
				count++;
			}
		}

		while(i<startIndex.length){
			resultArray[count]=startIndex[i];
			i++;
			count++;
		}

		while(j<startIndex.length){
			resultArray[count]=endIndex[j];
			j++;
			count++;
		}
		return resultArray;
	}
	 */	
	public static void main(String[] args) {
		int a[]={2,1,6,2,5,2,7};
		sort(a,0,a.length-1);
		Util.printArray(a);
	}
}
