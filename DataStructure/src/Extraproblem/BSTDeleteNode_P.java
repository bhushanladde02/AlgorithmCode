package Extraproblem;
//https://www.youtube.com/watch?v=gcULXE7ViZw  
//Pending - Give up
import CCI.BinaryTreeNode;
import CCI.Util;
//BST Deletion
public class BSTDeleteNode_P {
	/*public static BinaryTreeNode delete(BinaryTreeNode root,BinaryTreeNode temp1,BinaryTreeNode prev,int value){
		BinaryTreeNode node=temp1;
		if(node==null){
			return node;
		}
		if(node.left!=null && node.value!=value){
			 delete(root,node.left,node,value);
		}
		if(node.right!=null && node.value!=value){
			 delete(root,node.right,node,value);
		}
		if(node.value==value){
			if(node.right==null && node.left==null){
				if(prev.left.value==value)
					prev.left=null;
				else
					prev.right=null;
			}
			else if(node.right!=null && node.left==null){
				prev=node.right;
			}
			else if(node.right==null && node.left!=null){
				prev=node.left;
			}else{
				root= helper(root,node,prev,value);
			}
		}
		return root;
	}
	public static BinaryTreeNode helper(BinaryTreeNode root,BinaryTreeNode current,BinaryTreeNode prev,int value){
		root=BSTSuccessor.findNode(root, value);
		current=BSTSuccessor.findSuccessor(root, value);
		//System.out.println(current.value);
		BinaryTreeNode rootSave=root;
		root=current;
		root.left=rootSave;
		return root;
	}*/

	public static BinaryTreeNode delete(BinaryTreeNode treeNo,int value){
		if(treeNo==null){
			return treeNo;
		}	
		else if(value<treeNo.value) treeNo.left=delete(treeNo.left,value);
		else if(value>treeNo.value) treeNo.right=delete(treeNo.right,value);
		else{
			if(treeNo.left==null && treeNo.right==null){
				/*BinaryTreeNode temp=treeNo;
				treeNo=treeNo.right;
				 */			
				//delete leaf node

			}else if(treeNo.left==null){
				BinaryTreeNode temp=treeNo;
				treeNo=treeNo.left;
				//delete temp
			}else if(treeNo.right==null){
				BinaryTreeNode temp=treeNo;
				treeNo=treeNo.right;
				//delete temp
			}else{
		//		BinaryTreeNode minNode=findMin(treeNo.right);
				treeNo.value=value;
				treeNo.right=delete(treeNo.right,treeNo.value);
			}
		}
		return treeNo;
	}

	public static void main(String[] args) {
		//						   9
		//					5           12
		//				3      6   10        15
		BinaryTreeNode node=Util.getBST();
		System.out.println("Before Deletion :");
		//Util.printTreeInorder(node);
		BinaryTreeNode btree=delete(node,5);
		System.out.println("After Deletion : ");

		//Util.printTreeInorder(btree);
		//delete(node);
	}
}
