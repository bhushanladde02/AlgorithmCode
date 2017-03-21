package CCI;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepths_4_3 {
	public static void BFSTraverse(BinaryTreeNode root){
		ArrayList<LinkedList<BinaryTreeNode>> levelViseList=new ArrayList<LinkedList<BinaryTreeNode>>();
		LinkedList<BinaryTreeNode> current=new LinkedList<BinaryTreeNode>();
		BinaryTreeNode temp=root;
		if(temp==null){
			return;
		}
		current.add(temp);
		while(!current.isEmpty()){
			levelViseList.add(current);
			LinkedList<BinaryTreeNode> parent=current;
			current=new LinkedList<BinaryTreeNode>(); 
			for(BinaryTreeNode dequeNode : parent){
				dequeNode.visit=true;
				if(dequeNode.left!=null &&  dequeNode.left.visit==false){
					current.add(dequeNode.left);
				}
				if(dequeNode.right!=null && dequeNode.right.visit==false){
					current.add(dequeNode.right);
				}
			}
		}
		System.out.println(levelViseList.size());
	}

	public static void main(String[] args) {	
		BinaryTreeNode root=new BinaryTreeNode(9);
		BinaryTreeNode node1=new BinaryTreeNode(5);
		BinaryTreeNode node2=new BinaryTreeNode(12);
		BinaryTreeNode node3=new BinaryTreeNode(3);
		BinaryTreeNode node4=new BinaryTreeNode(6);
		BinaryTreeNode node5=new BinaryTreeNode(10);
		BinaryTreeNode node6=new BinaryTreeNode(15);

		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		node2.left = node5;
		node2.right = node6;

		BFSTraverse(root);
	}
}
