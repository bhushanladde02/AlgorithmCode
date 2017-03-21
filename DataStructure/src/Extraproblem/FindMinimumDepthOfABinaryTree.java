package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;

public class FindMinimumDepthOfABinaryTree {
	public static int calDepth(BinaryTreeNode current,int max){
		if(current==null){
			return max;
		}
		return Math.min(calDepth(current.left, max+1),calDepth(current.right,max+1));
	}
	
	public static void main(String[] args) {
		BinaryTreeNode btNode=Util.getFullBinaryTrees();
		int result=calDepth(btNode,0);
		System.out.println(result);
	}
}
