package Shobhaki;

public class QuickSortShobhaki {
	public static void quickSort(int a[],int start,int end){
		System.out.println("Sorting array between index "+start +" and index "+end);
		if(start>=end){
			return;
		}
		
		int wall=partition(a,start,end);		
		//wall is always go its correct location		
		quickSort(a,start,wall-1);
		//System.out.println("wall:::::"+wall);
		quickSort(a,wall+1,end);
		//j-1 is wall
		//i is current
		//pivot is element which is going to swap with j+1
	}
	
	public static int partition(int a[],int start,int end){
		int v=a[end];
		System.out.println("Pivot is "+v);
		int x=start-1;
		for(int y=start;y<=end-1;y++){
			if(a[y]<=v){
				System.out.println("swap at 7 : "+a[y]+" with "+a[x+1]);
				int temp=a[y];
				a[y]=a[x+1];
				a[x+1]=temp;
				x++;
			}
		}
		System.out.println("swap at 10 : "+a[end]+" with "+a[x+1]);
		int temp=a[end];
		a[end]=a[x+1];
		a[x+1]=temp;
		
		return x+1;
	}
	/*
	 //my implementation
	  public static int partition(int a[],int start,int end,int pivot){
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
	}*/
	public static void main(String[] args) {
		//int a[]={6,5,1,3,8,4,7,9,2};
		//int a[]={3,1,6,3,1};
		//int a[]={2,1,7,8,3,5,6,4};
		//int a[]={6,8,7,2};
		int a[]={5,4,1,4};
		quickSort(a,0,a.length-1);
		for(int i: a){
			System.out.println(i);
		}
	}
}
