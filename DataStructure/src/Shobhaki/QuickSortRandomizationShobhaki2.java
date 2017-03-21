package Shobhaki;

public class QuickSortRandomizationShobhaki2 {
	public static int quickSort(int a[],int start,int end,int rec){
		if(start>=end){
			return rec;
		}
		rec++;
		int wall=partition(a,start,end);		
		//wall is always go its correct location		
		return Math.max(quickSort(a,start,wall-1,rec),
		quickSort(a,wall+1,end,rec));
		
		
		//j-1 is wall
		//i is current
		//pivot is element which is going to swap with j+1
	}

	public static int partition(int a[],int start,int end){
		/*int index=start + (int)Math.random()*end;// correct this one. Math.random number should be between start and end then this algo works properly
		int temp1=a[end];
		a[end]=a[index];
		a[index]=temp1;*/
		
		int pivot=a[end];
		int wall=start;
		int traverse=start;
		while(traverse<a.length-1){
			if(a[traverse]>=pivot){
				traverse++;
			}else{
				int temp=a[traverse];
				a[traverse]=a[wall];
				a[wall]=temp;
				wall++;
				traverse++;
			}
		}
		//wall++;
		int temp=a[end];
		a[end]=a[wall];
		a[wall]=temp;
		//wall++;
		return wall;
	}
	public static void main(String[] args) {
		//int a[]={6,5,1,3,8,4,7,9,2};
		//int a[]={3,1,6,3,1};
		//int a[]={2,1,7,8,3,5,6,4};
		int a[]={5,8,11,14,17,20,23,26};
		int rec=quickSort(a,0,a.length-1,0);
		System.out.println("rec : "+rec);
		for(int i: a){
			System.out.println(i);
		}
	}
}
