package Extraproblem;
//http://www.geeksforgeeks.org/sum-diagonals-spiral-odd-order-square-matrix/
import CCI.Util;

public class SumOfBothDiagonalsOfASpiralOddOrderSquareMatrix {
	
	public static int sumOfBoth(int matrix[][]){
		int sum=0;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(j==matrix[0].length-1 && i!=(j-i)){
					sum=sum+matrix[i][j-i];
				}
				if(i==j){
					sum=sum+matrix[i][j];
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[][] matrix=Util.getMatrix();
		int result=sumOfBoth(matrix);
		System.out.println(result);
	}
}
