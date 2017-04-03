package Extraproblem;
//https://www.youtube.com/watch?v=13m9ZCB8gjw - good explaination
import CCI.BinaryTreeNode;
import CCI.Util;

public class LowestCommonAncestorBinaryTree_2_Program {
	
	public static BinaryTreeNode traverse(BinaryTreeNode current,int n1, int n2){
		if(current==null){
			return null;
		}
		if(current.value==n1 || current.value==n2){
			return current;
		}
		BinaryTreeNode leftNode=traverse(current.left,n1,n2);
		BinaryTreeNode rightNode=traverse(current.right,n1,n2);
		if(leftNode!=null && rightNode!=null) return current;
		BinaryTreeNode node=(leftNode==null && rightNode!=null) ? rightNode : leftNode;
		return node;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode node=Util.getBST();
		BinaryTreeNode result=traverse(node,6,10);
		System.out.println(result.value);
	}
}
