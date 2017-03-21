package Extraproblem;

import java.util.LinkedList;
import java.util.Stack;

import CCI.BinaryTreeNode;
import CCI.Util;

public class InorderIterativeTranversal {

	//inorder traversal means dfs
	
	public static void iterativeInOrder(BinaryTreeNode node){
		LinkedList<BinaryTreeNode> btree=new LinkedList<BinaryTreeNode>();
		btree.push(node);
		while(!btree.isEmpty()){
				BinaryTreeNode popNode=btree.pop();
				System.out.println(popNode.value);
				if(popNode.left!=null){
					btree.push(popNode.left);
				}
				if(popNode.right!=null){
					btree.push(popNode.right);
				}
		}
	}
	public static void main(String[] args) {
		BinaryTreeNode node=Util.getBST();
		iterativeInOrder(node);

	}
}
