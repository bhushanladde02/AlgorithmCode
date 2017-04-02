package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;

//https://www.youtube.com/watch?v=Jg4E4KZstFE
public class RootToLeafSumBinaryTree {

	public static boolean  checkSum(BinaryTreeNode traverse,int sum){
		if(traverse==null){
			return false;
		}
		if(traverse.left==null && traverse.right==null){
			if(traverse.value==sum)
			return true;
			else
			return false;
		}
		return checkSum(traverse.left,sum-traverse.value)||
		checkSum(traverse.right,sum-traverse.value);
	}
	
	public static void main(String[] args) {
		BinaryTreeNode root=Util.findMaximumPathSumInABinaryTree();
		boolean result=checkSum(root,-2);
		System.out.println(result);
	}
}
