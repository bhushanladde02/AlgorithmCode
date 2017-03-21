package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;
//http://www.geeksforgeeks.org/remove-nodes-root-leaf-paths-length-k/
public class RemoveNodesOnRootToLeafPathsOfLengthLessThanK {

	public static BinaryTreeNode calHeight(BinaryTreeNode node,int k,int i,BinaryTreeNode root){
		if(node == null || i>k){
			return null;
		}
		System.out.println(node.value);
		calHeight(node.left,k,++i,root);
		calHeight(node.right,k,++i,root);
		return root;
	}

	public static void main(String[] args) {
		BinaryTreeNode root=Util.getOddLevelBinaryTree();
		int k=3;
		BinaryTreeNode bTree=calHeight(root,k,0,root);
		//Util.printTreeInorder(bTree);
	}
}
