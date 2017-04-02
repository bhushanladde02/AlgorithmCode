package Extraproblem;
//http://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/   need to discuss and then solve it
//not understood
import CCI.BinaryTreeNode;
import CCI.Util;

public class FindMaximumPathSumInABinaryTree {
	public static int max=0;
	public static int traverseTree(BinaryTreeNode traverse){//,int leftSum,int rightSum,int leftMax,int rightMax,int max){
		/*if(traverse==null){
			if(leftSum > leftMax)
				leftMax=leftSum;
			if(rightSum > rightMax)
				rightMax=rightSum;
			if((leftMax+rightMax)>max){
				max=leftMax+rightMax;
			}
		}else{	
			if(leftSum > leftMax)
				leftMax=leftSum;
			if(rightSum > rightMax)
				rightMax=rightSum;

			traverseTree(traverse.left,traverse.value+leftSum,rightSum,leftMax,rightMax,max);
			traverseTree(traverse.right,leftSum,traverse.value+rightSum,leftMax,rightMax,max);
		}
		return max;*/
		
		/*
		if(traverse.left==null && traverse.right==null){
			return traverse.value;
		}
		traverseTree(traverse.left,leftMax+traverse.value,rightMax);
		traverseTree(traverse.right,leftMax,rightMax+traverse.value);
		return leftMax+rightMax;
		*/
		
		if(traverse==null){
			return 0;
		}
		
		int left=traverseTree(traverse.left);
		
		int right=traverseTree(traverse.right);
		
		int max_single=Math.max(Math.max(left,right)+traverse.value, traverse.value);
		
		int max_top=Math.max(max_single,left+right+traverse.value);
		
		max=Math.max(max_top,max);
		
		return max_single;
		
	}

	public static void main(String[] args) {
		BinaryTreeNode node=Util.perfectBinaryTrees();
		int max=traverseTree(node);//,0,0,0,0,0);
		System.out.println(max);
	}
}
