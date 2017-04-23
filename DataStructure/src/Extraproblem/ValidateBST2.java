package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;

public class ValidateBST2 {
	public static boolean  validate(BinaryTreeNode btNode,int min,int max){
		boolean left=true;
		boolean right=true;
		if(btNode == null){
			return false;
		}

		if(btNode.left==null && btNode.right == null){
			return true;
		}
		if(btNode.left!=null) 
			if(btNode.left.value < btNode.value)
				left=validate(btNode.left,btNode.left.value,btNode.value);
			else
				left=false;

		if(btNode.right!=null)
			if(btNode.right.value > btNode.value)
				right=validate(btNode.right,btNode.value,btNode.right.value);
			else
				right=false;

		return left && right;
	}

	public static void main(String[] args) {
		BinaryTreeNode btree=Util.getBST();
		boolean result=validate(btree,btree.value,btree.value);
		System.out.println("Result : "+ result);
	}

}
