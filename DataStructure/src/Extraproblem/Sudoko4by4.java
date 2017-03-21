package Extraproblem;
//solving using backtracking
///https://www.youtube.com/watch?v=NuodN41aK3g
public class Sudoko4by4 {

	public static int sizeOfRow=4;
	public static int sizeOfColumn=4;
	public static int halfSizeRow=2;
	public static int halfSizeCol=2;

	//handle the base condition
	public static boolean isFull(int[][] input){
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input[0].length;j++){
				if(input[i][j]==0){
					return false;
				}
			}
		}
		return true;
	}
	//return the array of possibility values
	public static int[] possibleArr(int[][] input,int x,int y){

		int possible[] =new int[sizeOfRow];

		//fill the possible array with values 1 to 4 because we will require values between 1 to 4
		for(int i=0;i<sizeOfRow;i++){
			possible[i]=0;
		}

		//mark all one for fixed element
		//mark all the elements which are present in a row
		for(int j=0;j<sizeOfColumn;j++){
			if(input[x][j]!=0) possible[input[x][j]-1]=Integer.MAX_VALUE;
		}

		//mark all the elements which are present in a column
		for(int i=0;i<sizeOfRow;i++){
			if(input[i][y]!=0) {
				possible[input[i][y]-1]=Integer.MAX_VALUE;
			}
		}

		int l=0;
		int k=0;
		if(x>=0 && x<2)
			l=0;
		if(x>=2 && x<sizeOfRow)
			l=2;
		if(y>=0 && y<2)
			k=0;
		if(y>=2 && y<sizeOfColumn)
			k=2;

		for(int i=l;i<l+halfSizeRow;i++){
			for(int j=k;j<k+halfSizeCol;j++){
				if(input[i][j]!=0){
					possible[input[i][j]-1]=Integer.MAX_VALUE;
				}
			}
		}
		for(int i=0;i<possible.length;i++){
			if(possible[i]==0){
				possible[i]=i+1;
			}
		}

		return possible; // Handle All Three Cases
	}

	public static int[][] calSudoko(int input[][]){
		//base condition for recursive call
		if(isFull(input)){
			return input;
		}
		int x=0,y=0,i=0,j=0,breakOutSideLoop=0;
		//search for empty space
		for(i=0;i<input.length;i++){
			breakOutSideLoop=0;
			for(j=0;j<input[0].length;j++){
				if(input[i][j]==0){
					x=i;
					y=j;
					breakOutSideLoop=1;
					break;
				}
			}
			if(breakOutSideLoop==1){break;}
		}	
		int[] possibleResultsForOneCell=possibleArr(input, x, y);
		int backTrack=0;
		for(i=0;i<possibleResultsForOneCell.length;i++){
			if(possibleResultsForOneCell[i]!=Integer.MAX_VALUE){
				input[x][y]=possibleResultsForOneCell[i];
				calSudoko(input);
				backTrack=1;
			}
		}
		if(i==possibleResultsForOneCell.length-1 && backTrack==0)
			input[x][y]=0; // after recursion this will make all backtrack to zero - Awesome Concept

		return input;
	}
	//main function
	public static void main(String[] args) {
		int[][] input=new int[sizeOfRow][sizeOfColumn];
		input[0][0]=3;
		input[0][1]=4;
		input[0][2]=1;
		input[0][3]=0;
		input[1][0]=0;
		input[1][1]=2;
		input[1][2]=0;
		input[1][3]=0;
		input[2][0]=0;
		input[2][1]=0;
		input[2][2]=2;
		input[2][3]=0;
		input[3][0]=0;
		input[3][1]=1;
		input[3][2]=4;
		input[3][3]=3;

		for(int i=0;i<input.length;i++){
			System.out.println("");
			for(int j=0;j<input[0].length;j++){
				System.out.print(input[i][j]+" ");
			}
		}
		int[][] result=calSudoko(input);

		System.out.println("\n\nResult Array is ::");
		for(int i=0;i<result.length;i++){
			System.out.println("");
			for(int j=0;j<result[0].length;j++){
				System.out.print(result[i][j]+" ");
			}
		}
	}
}
