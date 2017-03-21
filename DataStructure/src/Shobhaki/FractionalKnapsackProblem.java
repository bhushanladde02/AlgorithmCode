package Shobhaki;

public class FractionalKnapsackProblem {
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
			if(left[i]>right[j]){
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

	public void fractionalKnap(int value[],int weight[],double bagCapacity){
		int density[]=new int[value.length];
		int result[]=new int[value.length];
		for(int i=0;i<value.length;i++){
			result[i]=i;
			density[i]=value[i]/weight[i];
		}
		mergeSort(density,0,density.length-1,result);
		/*for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}*/
		double optimalSol=0;
		for (int i = 0; i < result.length; i++) {
			int index=result[i];
			int weightS=weight[index];
			int valueS=value[index];
			if(weightS<bagCapacity){
				bagCapacity-=weightS;
			//	System.out.println(bagCapacity);
				optimalSol=optimalSol+valueS;
			}else{
				//System.out.println(bagCapacity/weightS);
				optimalSol=optimalSol+((bagCapacity/weightS)*valueS);
				break;
			}
		}
		System.out.println(optimalSol);
	}
	
	public static void main(String[] args) {
		int weight[]={20,10,30};
		int value[]={100,60,120};
	    double bagCapacity=50;
	    FractionalKnapsackProblem knap=new FractionalKnapsackProblem();
		knap.fractionalKnap(value, weight, bagCapacity);
	}
	
}
