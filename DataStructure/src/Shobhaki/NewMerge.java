package Shobhaki;

public class NewMerge {
	static void MergeSort(int data[], int lo, int hi)
	{
		System.out.println(); 
		if(lo == hi)
			return;
		
		int center = (lo+hi)/2;
		
		MergeSort(data, lo, center);
		
		MergeSort(data,center+1,hi);
		
		Merge(data,lo,center,hi);
	}
	
	static void Merge(int data[],int lo,int center,int hi)
	{
		int nOne = center - lo +1;
		
		int nTwo = hi - center;
		
		int leftHalfArray[] = new int[nOne+1];
		
		int rightHalfArray[] = new int[nTwo+1];
		
		System.arraycopy(data, lo,leftHalfArray,0,nOne);
		
		System.arraycopy(data,(center+1),rightHalfArray,0,nTwo);
		
		int large = Math.max(leftHalfArray[(nOne-1)], rightHalfArray[(nTwo-1)])+1;
		
		leftHalfArray[nOne] = large;
		rightHalfArray[nTwo] = large;
		
		int i=0,j=0;
		
		int k=lo;
		
		while(k<=hi)
		{
			if (leftHalfArray[i] < rightHalfArray[j])
	        {
	            data[k] = leftHalfArray[i];
	            i++;
	        }
	        else
	        {
	            data[k] = rightHalfArray[j];
	            j++;
	        }
			k++;
		}
	}
	
	public static void main(String[] args) {
		int a[]={7,6,9,6};
		int result[]=new int[a.length];
		MergeSort(a,0,a.length-1);
		for(int i=0;i<result.length;i++){
			System.out.println(a[i]);	
		}
	}
}
