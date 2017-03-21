package Extraproblem;

import java.util.ArrayList;
import CCI.BinaryTreeNode;
import CCI.Util;

public class PrintAllNodesInABinaryTreeHavingKLeaves {

	public static ArrayList<Integer> calCount(BinaryTreeNode node,ArrayList<Integer> list,int numberOfLeaves ){
		int count = countNumberOfLeaves(node,0);
		//System.out.println("Node : "+node.value+" Value :"+count);
		if(count==numberOfLeaves){
			list.add(node.value);
		}
		if(node.left!=null)
			calCount(node.left,list,numberOfLeaves);
		if(node.right!=null)
			calCount(node.right,list,numberOfLeaves);
		return list;
	}
	public static int countNumberOfLeaves(BinaryTreeNode node,int count){
		if(node==null){
			return 0;
		}
		if(node.left==null && node.right==null){
			return ++count ; // first increment then return
		}
		int leftSubtreeCount = countNumberOfLeaves(node.left,count);
		int rightSubTreeCount = countNumberOfLeaves(node.right,count);
		
		
		return leftSubtreeCount+rightSubTreeCount;
	}

	public static void main(String[] args) {
		BinaryTreeNode root=Util.getCompleteBinaryTrees();
		ArrayList<Integer> resultList=calCount(root,new ArrayList<Integer>(),3);
		for(Integer x:resultList){
			System.out.println(x);
		}
	}
}
