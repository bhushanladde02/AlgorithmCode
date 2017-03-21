package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;

//http://www.geeksforgeeks.org/check-binary-tree-subtree-another-binary-tree-set-2/

public class BinaryTreeIsSubtreeOfAnotherBinaryTree {

	public static boolean getSubTree(BinaryTreeNode mainTree,BinaryTreeNode subTreeRootNode){
		if(mainTree==null || subTreeRootNode==null){
			return false;
		}
		if(mainTree.value==subTreeRootNode.value){
			return helperFunction(mainTree,subTreeRootNode);
		}
		return (getSubTree(mainTree.left,subTreeRootNode) || getSubTree(mainTree.right,subTreeRootNode));
	}

	public static boolean helperFunction(BinaryTreeNode mainTree,BinaryTreeNode subTreeRootNode){
		if(mainTree==null  || subTreeRootNode==null){
			return true;
		}
		if(mainTree.value!=subTreeRootNode.value){
			return false;
		}
		return (helperFunction(mainTree.left,subTreeRootNode.left) && helperFunction(mainTree.right,subTreeRootNode.right));
	}

	public static void main(String[] args) {
		BinaryTreeNode root=Util.perfectBinaryTrees();
		BinaryTreeNode subTreeRoot=Util.subTreeOfPerfectBinaryTree();
		boolean result=getSubTree(root,subTreeRoot);
		
		if(result)
		System.out.println("It is subtree of given binary tree");
		else
		System.out.println("It is not subtree of given binary tree");
	}
}
