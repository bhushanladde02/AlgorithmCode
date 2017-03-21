package Shobhaki;

public class ActivitySelectionProblem {
	public static void mergeSort(int a[],int start,int end,int[] result){
		if(start==end){
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

		int left[]=new int[size1];
		int right[]=new int[size2];

		int leftIndex[]=new int[size1];
		int rightIndex[]=new int[size2];

		for(int k=0;k<size1;k++){
			left[k]=a[start+k];
			leftIndex[k]=result[start+k];
		}

		for(int s=0;s<size2;s++){
			right[s]=a[mid+1+s];
			rightIndex[s]=result[mid+1+s];
		}

		int index=start,i=0,j=0;

		while(i<size1 && j<size2){
			if(left[i]<right[j]){
				a[index]=left[i];
				result[index]=leftIndex[i];
				i++;
			}else{
				a[index]=right[j];
				result[index]=rightIndex[j];
				j++;
			}
			index++;
		}

		while(i<size1){
			a[index]=left[i];
			result[index]=leftIndex[i];
			index++;
			i++;
		}
		while(j<size2){
			a[index]=right[j];
			result[index]=rightIndex[j];
			index++;
			j++;
		}
	}


	public static void activitySelection(int s[],int f[]){
		int result[]=new int[f.length];
		for(int i=0;i<f.length;i++){
			result[i]=i;
		}
		mergeSort(f,0,f.length-1,result);
		for(int i=0;i<f.length;i++){
		//	System.out.println(result[i]);
		}
		int startIndex=result[0];
		int finish=f[startIndex];
		System.out.println(startIndex+1);
		for(int i=1;i<f.length;i++){
			int index=result[i];
			if(s[index]>finish){
				System.out.println(index+1);
				finish=f[index];
			}

		}
	}

	public static void main(String[] args) {
		int s[]={2,2,4,1,5,8,9,11,13};
		int f[]={3,5,7,8,9,10,11,14,16};
		activitySelection(s,f);



	}
}
