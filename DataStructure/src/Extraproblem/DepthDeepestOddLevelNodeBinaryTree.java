package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;

//http://www.geeksforgeeks.org/depth-deepest-odd-level-node-binary-tree/
//Note : code need to verify again.. We need to maintain the visit flag so that we cannt visit that node again

public class DepthDeepestOddLevelNodeBinaryTree {

	public static int getOddLevelNodeBinary(BinaryTreeNode current, int max,int prevMax, BinaryTreeNode pre){
		if(current==null){
			if(prevMax<max && (pre.value%2)!=0){
				prevMax=max;
			}
			return prevMax;
		}
		
		return Math.max(getOddLevelNodeBinary(current.left,max+1,prevMax,current),getOddLevelNodeBinary(current.right,max+1,prevMax,current));
		
	}

	public static void main(String[] args) {

		BinaryTreeNode root=Util.getOddLevelBinaryTree();	
		int results=getOddLevelNodeBinary(root,0,0,root);
		System.out.println("Output:::"+ results);
	}
}
