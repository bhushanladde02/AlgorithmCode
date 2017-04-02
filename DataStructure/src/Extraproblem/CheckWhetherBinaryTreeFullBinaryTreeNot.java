package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;

//http://www.geeksforgeeks.org/check-whether-binary-tree-full-binary-tree-not/

public class CheckWhetherBinaryTreeFullBinaryTreeNot {

	public static boolean checkEveryNodeHasTwoChild(BinaryTreeNode traverse){
		if(traverse==null){
			return false;
		}
		else if(traverse.left==null && traverse.right==null){ //not click this condition
			return true;
		}else if((traverse.left==null && traverse.right!=null) || (traverse.left!=null && traverse.right==null)  ){
			return false;
		}
		boolean result1=checkEveryNodeHasTwoChild(traverse.left);
		boolean result2=checkEveryNodeHasTwoChild(traverse.right);
		return  result1 && result2;

		//	checkEveryNodeHasTwoChild(traverse.left); 
		//	checkEveryNodeHasTwoChild(traverse.right);

	}

	public static void main(String[] args) {
		BinaryTreeNode root=Util.getFullBinaryTrees();
		boolean result=checkEveryNodeHasTwoChild(root);
		System.out.println(result);
	}
}
