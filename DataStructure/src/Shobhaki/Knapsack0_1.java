package Shobhaki;

public class Knapsack0_1 {
	
	public static void printSol(int arr[][],int w[]){
		int i=arr.length-1, j=arr[0].length-1;
	
		/*while(arr[i][j]!=0){
			if(arr[i][j]!=arr[i-1][j]){
				System.out.print(i+" ");
				
			}
			if(arr[i-1][j]< arr[i][j-1]){
				j--;
			}else{
				i--;
			}
		}*/
		 while(i!=1){
			 if(arr[i][j]!=arr[i-1][j]){
				 System.out.print(i + " ");
				 j=j-w[i-1];
			 }
			 i--;
		 }
		
	}
	
	public static int[][] knapsk(int w[],int v[],int capacity){
		int matri[][]=new int[w.length+1][capacity+1];
		for(int i=0;i<matri.length;i++)
			matri[i][0]=0;

		for(int i=0;i<matri[0].length;i++)
			matri[0][i]=0;

		for(int i=1;i<matri.length;i++){
			//System.out.println(i);
			for(int j=1;j<matri[0].length;j++){
				if(j<w[i-1]){
					matri[i][j]=matri[i-1][j];
				}else{
					matri[i][j]=Math.max(matri[i-1][j-w[i-1]] + v[i-1], matri[i-1][j]);
				}
			}
		}
		
		for(int i=0;i<matri.length;i++){
			for(int j=0;j<matri[0].length;j++){
				System.out.print(matri[i][j] + " ");
			}
			System.out.println();
		}
		return matri;
	}

	public static void main(String[] args) {
		//items assign index wise
		int w[]={2,3,5};
		int v[]={3,4,6};
		int capacity=8;
		int matri[][]=knapsk(w, v, capacity);
		System.out.print("Output : ");printSol(matri,w);
	}
}
