package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;

//Note : code need to verify again.. We need to maintain the visit flag so that we cannt visit that node again
//http://www.geeksforgeeks.org/depth-n-ary-tree/


public class DepthOfAnNAryTree {

	public static int calDepth(BinaryTreeNode current,int max,int previousMax){
		if(current==null){
			if(previousMax<max){
				previousMax=max;
			}
			return previousMax;
		}else{
			return Math.max(calDepth(current.left,max+1,previousMax),calDepth(current.right,max+1,previousMax));
		}
	}

	public static void main(String[] args) {
		BinaryTreeNode root=Util.getFullBinaryTrees();
		int result=calDepth(root,0,0);
		System.out.println("Result :"+result);
	}
}
