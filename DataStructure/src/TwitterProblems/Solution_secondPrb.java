/*package TwitterProblems;

import java.util.LinkedList;

class TNode{
	int value;
	TNode down;
	TNode right;
	TNode digo;
	public TNode(int value){
		this.value=value;
	}
}
public class Solution {
	public static int countPaths(TNode root){
		int count=0;
		LinkedList<TNode> list=new LinkedList<TNode>();
		if(root==null){
			return 0;
		}else{
			list.add(root);
			while(!list.isEmpty()){
				TNode node=list.poll();
				if(node.value==3) // multiplication m*n
					count++;
				if(node.right!=null){
					list.add(node.right);
				}
				if(node.down!=null){
					list.add(node.down);
				}
				if(node.digo!=null){
					list.add(node.digo);
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		//starting 0 , dest - 3
		// Design tree according to matrix

		TNode root=new TNode(0);
		TNode downN=new TNode(1);
		TNode digN=new TNode(3);
		TNode rightN=new TNode(2);

		root.right=rightN;
		root.down=downN;
		root.digo=digN;

		downN.right=digN;
		rightN.down=digN;

		int count=countPaths(root);
		System.out.println("Count : "+count);
	}
}
 */
package TwitterProblems;

public class Solution_secondPrb{

	static int krakenCount(int m, int n) {
		//initialize index pointers to row and column
		int i = 0,j = 0;
		// store the all result index wise in matrix
		int resultArray[][]=new int[m][n];
		while(i < m){
			resultArray[i][0] = 1;
			i++;
		}
		while(j < n){
			resultArray[0][j] = 1;
			j++;
		}
		for(i=1;i<m;i++){
			for(j=1;j<n;j++){
				resultArray[i][j] = resultArray[i-1][j] + resultArray[i-1][j-1] + resultArray[i][j-1];
			}
		} //or solution
		 
		/*
		i=1;
		j=1;
		while(i<m && j<n){
			
			int	firstindex=resultArray[i-1][j];
			int	secondIndex=resultArray[i-1][j-1];
			int	thirdIndex=resultArray[i][j-1];
			
			
			
		}*/
		/*for(i=0;i<m;i++){
			if(i!=0){
			int firstVarible=resultArray[i][i];
			int secondVariable=resultArray[i][i-1];
			int thirdVariable=resultArray[i][i+1];
			resultArray[i+1][i+1]=firstVarible+secondVariable+thirdVariable;
			}else{
				int firstVarible=resultArray[0][0];
				int secondVariable=resultArray[0][0];
				int thirdVariable=resultArray[0][0];
				resultArray[i+1][i+1]=firstVarible+secondVariable+thirdVariable;
			}
		}*/
		return resultArray[m-1][n-1];
	}
	public static void main(String[] args) {
		int result=Solution_secondPrb.krakenCount(2,3);
		System.out.println(result);
	}
}