package Extraproblem;

import CCI.Util;

//http://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/

public class PrintAGivenMatrixInSpiralForm {

	public static void spiralPrinting(int[][] matrix){
		int maxRowLength=matrix.length-1,minRowLength=0,initialStartingPoint=0;
		int maxColLength=matrix[0].length-1,minColLength=0;
		
		while(true){
			while(minColLength!=maxColLength){
				System.out.println(matrix[minRowLength][minColLength]);
				minColLength++;
			}
			while(minRowLength!=maxRowLength){
				System.out.println(matrix[minRowLength][minColLength]);
				minRowLength++;
			}
			while(minColLength!=0){
				System.out.println(matrix[minRowLength][minColLength]);
				minColLength--;
			}
			while(minRowLength!=initialStartingPoint){
				System.out.println(matrix[minRowLength][minColLength]);
				minRowLength--;
			}
			minRowLength=minRowLength+1;
			minColLength=minColLength+1;
			maxColLength=maxColLength-1;
			maxRowLength=maxRowLength-1;
			if(maxColLength==minColLength && minRowLength==maxRowLength){
				System.out.println(matrix[minRowLength][maxColLength]);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		int[][] matrix=Util.getGivenPrintMatrix();
		spiralPrinting(matrix);
	}
}
