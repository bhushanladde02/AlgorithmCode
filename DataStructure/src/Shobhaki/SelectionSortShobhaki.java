package Shobhaki;

public class SelectionSortShobhaki {

	public static void selectionSort(int a[],int swap){
		int minIndx=0;
		int swapIndx=swap;
		int minEle=Integer.MAX_VALUE;
		while(swap<a.length){
			swap=helper(a,swap,minEle);
		}
	}
	public static int helper(int a[],int swap,int min){
		int minIndex=0;
		for (int i = swap; i < a.length; i++) {
			if(min>=a[i]){
				min=a[i];
				minIndex=i;
			}
		}
		int temp=a[swap];
		a[swap]=a[minIndex];
		a[minIndex]=temp;
		swap++;
		return swap;
	}
	public static void main(String[] args) {
		int a[]={2,1,0,2,4,5,2};
		selectionSort(a,0);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
