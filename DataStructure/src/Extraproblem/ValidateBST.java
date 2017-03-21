package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;

public class ValidateBST {
	public static boolean validate(BinaryTreeNode node){
		return helper(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	public static boolean helper(BinaryTreeNode node,int min,int max){
		boolean leftSide = false;
		boolean rightSide= false;
		if(node==null){
			return true;
		}
		if(min<node.value &&  max> node.value){
			leftSide=helper(node.left,min,node.value);
			rightSide=helper(node.right,node.value,max);
		}
		else{
			leftSide=false;
			rightSide=false;
		}
		return (leftSide && rightSide);
	}

	public static void main(String[] args) {
		BinaryTreeNode btree=Util.getBST();
		boolean result=validate(btree);
		System.out.println("Result : "+ result);
	}
}
