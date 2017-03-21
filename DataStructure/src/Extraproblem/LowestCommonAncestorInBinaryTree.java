package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;

public class LowestCommonAncestorInBinaryTree {

	public static BinaryTreeNode lowestCommonAnc(BinaryTreeNode node,BinaryTreeNode prev,int a, int b){
		if(node==null){
			return null;
		}
		if(node.value==a || node.value==b){
			return node;
		}
		BinaryTreeNode nodeLeft =  lowestCommonAnc(node.left,node,a,b);
		BinaryTreeNode nodeRight = lowestCommonAnc(node.right,node,a,b);
		
		if(nodeLeft != null && nodeRight != null ) return node;
		if(nodeLeft == null && nodeRight == null ) return null;
		
		return nodeLeft!=null ? nodeLeft : nodeRight;
	}
	public static void main(String[] args) {
		BinaryTreeNode tree=Util.getBST();
		BinaryTreeNode result=lowestCommonAnc(tree,tree,3,6);
		System.out.println(result.value);
		
	}
}
