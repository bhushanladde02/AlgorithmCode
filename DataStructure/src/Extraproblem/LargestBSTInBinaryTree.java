package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;

//https://www.youtube.com/watch?v=4fiDs7CCxkc
public class LargestBSTInBinaryTree {

	/*public static BinaryTreeNode largestBSTInBinaryTree(BinaryTreeNode btNode,boolean flag,int size,int min,int max){
	    if(btNode==null){
	    	return null;
	    }
	    if(btNode.value>left.value && btNode.value<right.value)	  {
	    	flag=true;
	    }else{
	    	flag=false;
	    }
	    if(flag==true){
	    	size=size+1;
	    }

	    if(min<btNode.value){
	    	min=btNode.value;
	    }
	    if(max>btNode.value){
	    	max=btNode.value;
	    }

	    BinaryTreeNode leftNode=largestBSTInBinaryTree(btNode.left,flag,size,min,max);
	    BinaryTreeNode rightNode=largestBSTInBinaryTree(btNode.right,flag,size,min,max);


		//return 0;
	    //return leftNode;

	    //largestBSTInBinaryTree(btNode,flag,size,min,max);
	    //largestBSTInBinaryTree(btNode,flag,size,min,max);

	    return null;
	}*/

	public static int largestBSTInBinaryTree(BinaryTreeNode btNode){
		if(btNode == null){
			return -1;
		}

		if(btNode != null && btNode.left == null && btNode.right == null){
			System.out.println("Node value : " + btNode.value +" Node size : "+ 1);
			btNode.flag=true;
			return 1;
		}
		int leftCount = largestBSTInBinaryTree(btNode.left);
		int rightCount = largestBSTInBinaryTree(btNode.right);
		//btNode

		if(leftCount > 0 && rightCount > 0){
			if((btNode.value > btNode.left.value) && (btNode.value < btNode.right.value) && btNode.right.flag==true && btNode.left.flag==true){		
				btNode.size = leftCount + rightCount + 1;
				btNode.flag=true;
			}else{
				btNode.size=Math.max(leftCount, rightCount);
			}
			System.out.println("Node value : " + btNode.value +" Node size : "+ btNode.size);

			return btNode.size;
		}else if(leftCount>0 && (btNode.left!=null && btNode.right==null)){
			if(btNode.value > btNode.left.value) {
				btNode.size=leftCount+1;
				btNode.flag=true;
			}
			else{
				btNode.size=leftCount;
				btNode.flag=false;
			System.out.println("Node value : " + btNode.value +" Node size : "+ btNode.size);
			}
			return btNode.size;
		}
		else if(rightCount>0 && (btNode.right!=null && btNode.left==null)){
			if((btNode.value < btNode.right.value)){
				btNode.size=rightCount+1;
				btNode.flag=true;
				}
			else{
				btNode.size=rightCount;
				btNode.flag=false;
			}
			System.out.println("Node value : " + btNode.value +" Node size : "+ btNode.size);
			return btNode.size;
		}
		else{
			System.out.println("Node value : " + btNode.value +" Node size : "+ btNode.size);
			return 0;
		}

	}

	public static void main(String[] args) {
		BinaryTreeNode root=Util.largestBSTInBinaryTree();
		int result=largestBSTInBinaryTree(root);
		System.out.println(result);
	}
}
