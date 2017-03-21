//need to redo...
package Shobhaki;

public class MergeSortShobakiExplain {

	public static void mergeSort(int a[],int start,int end,int[] result){
		if(start>=end){
			return;
		}
		int mid=(start+end)/2;
		mergeSort(a,start,mid,result);
		mergeSort(a,mid+1,end,result);
		merge(a,start,end,mid,result);
	}
	public static void merge(int a[], int start,int end, int mid,int[] result){
		
		int size1=mid-start+1;
		int size2=end-mid;
		int left[]=new int[size1+1];
		int right[]=new int[size2+1];
		int large=Math.max(left[size1-1], right[size2-1]);
		for(int k=0;k<size1;k++){
			left[k]=a[start+k];
		}
		for(int s=0;s<size2;s++){
			right[s]=a[mid+1+s];
		}
		
		left[size1]=large;
		right[size2]=large;
		int i=0,j=0;
		for(int k=start;k<end;k++){
			if(left[i]<right[j]){
				result[k]=left[i];
				i++;
			}else{
				a[k]=right[j];
				j++;
			}
		}
		
		
	/*	
	 //it is correct code
	 	for(int k=0;k<size1;k++){
			left[k]=a[start+k];
		}
		for(int s=0;s<size2;s++){
			right[s]=a[mid+1+s];
		}
		
		int index=start,i=0,j=0;

		while(i<size1 && j<size2){
			if(left[i]<right[j]){
				a[index]=left[i];
				i++;
			}else{
				a[index]=right[j];
				j++;
			}
			index++;
		}
	
		while(i<size1){
			a[index]=left[i];
			index++;
			i++;
		}
		while(j<size2){
			result[index]=right[j];
			index++;
			j++;
		}
		*/
		/*
		//from below it is wrong 
		System.out.println("Size1 :"+size1);
		System.out.println("Size2 :"+size2);
		System.out.println("i :"+i);
		System.out.println("j :"+j);
		System.out.println("-----------------------------------------");
		*/
		/*
		while(i<size1 && j<size2){
			if(a[i]<=a[j]){
				result[count]=a[i];
				i++;
			}
			else{
				result[count]=a[j];
				j++;
			}
			count++;
		}
		while(i<size1){
			result[count]=a[i];
			count++;
			i++;
		}
		while(j<size2){
			result[count]=a[j];
			count++;
			j++;
		}*/
		
	}

	public static void main(String[] args) {
		int a[]={7,6,9,6};
		int result[]=new int[a.length];
		mergeSort(a,0,a.length-1,result);
		for(int i=0;i<result.length;i++){
			System.out.println(a[i]);	
		}
	}
}
