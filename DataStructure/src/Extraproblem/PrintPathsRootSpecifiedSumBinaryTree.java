package Extraproblem;

import java.util.ArrayList;

import CCI.BinaryTreeNode;
import CCI.Util;

//http://www.geeksforgeeks.org/print-paths-root-specified-sum-binary-tree/

public class PrintPathsRootSpecifiedSumBinaryTree {

	public static void traverse(BinaryTreeNode root,int sum,int traverseSum,ArrayList<BinaryTreeNode> list){
		
		list.add(root);
		
		//System.out.println("-------------------------------:"+(traverseSum+root.left.value));
		
		if(traverseSum==sum ){
			Util.printBinaryTreeNodeValueList(list);
			System.out.println("-----------------");
		}
		
		if(root.left!=null && (traverseSum+root.left.value)<=sum){
			traverse(root.left,sum,traverseSum+root.left.value,list);
			list.remove(list.size()-1);//during recursion this will do the backtracking - after the recursive call
		}

		if(root.right!=null && (traverseSum+root.right.value)<=sum){
			traverse(root.right,sum,traverseSum+root.right.value,list);
			list.remove(list.size()-1);//during recursion this will do the backtracking - after the recursive call
		}
	}

	public static void main(String[] args){
		BinaryTreeNode root=Util.getFullBinaryTrees();
		traverse(root,38,root.value,new ArrayList<BinaryTreeNode>());
	}
}
