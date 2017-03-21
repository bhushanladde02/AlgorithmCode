package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;
//https://www.youtube.com/watch?v=5cPbNCrdotA&vl=en  -- Use this 
public class BSTSuccessor {
	//						   9
	//					5           12
	//				3      6   10        15
	public static BinaryTreeNode findNode(BinaryTreeNode root, int value){
		if(root.value==value){
			return root;
		}
		if(root.value>value){
			return findNode(root.left,value);
		}else{
			return findNode(root.right,value);
		}
	}
	public static BinaryTreeNode findSuccessor(BinaryTreeNode root,int value){
		/*if(value<current.value){
			  findSuccessor(current.left,current,value);
		}else if(value>current.value){
			  findSuccessor(current.right,current,value);
		}else{
			return prev; 
		}*/
		BinaryTreeNode prev=null;
		BinaryTreeNode current=findNode(root,value);
		if(current.right!=null){
			return calMinValueInRightSubTree(current.right);
		}
		while(current!=null){	
			if(current.value>value){
				prev=current;
				current=current.left;
			}else if(current.value<value){
				current=current.right;
			}else{
				break;
			}
		}
		return prev;
	}
	public static BinaryTreeNode calMinValueInRightSubTree(BinaryTreeNode node){
		if(node.left!=null){
			 calMinValueInRightSubTree(node.left);
		}
		if(node.left!=null)
		return node.left;
		else
		return node;
	}
	public static void main(String[] args) {
		BinaryTreeNode node=Util.getBST();
		BinaryTreeNode result=findSuccessor(node,5);
		System.out.println(result.value);
	}
}
