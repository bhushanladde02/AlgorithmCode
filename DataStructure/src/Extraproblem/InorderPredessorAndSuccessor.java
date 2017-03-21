package Extraproblem;

import CCI.BinaryTreeNode;
import CCI.Util;

public class InorderPredessorAndSuccessor {

	public static void search(BinaryTreeNode temp,BinaryTreeNode root,int value){
		if(temp.value==value){
			int succ=calculateInorderSucc(temp,root);
			int pre=calculateInorderPre(temp,root);
			System.out.println("Successor : "+succ);
			System.out.println("Predessor : "+pre);
		}
		if(temp.value>value){
			search(temp.left,root,value);
		}
		if(temp.value<value){
			search(temp.right,root,value);
		}
	}

	public static int calculateInorderSucc(BinaryTreeNode current,BinaryTreeNode root){
		if(current.right!=null){
			while(current!=null) current=current.left;
			return current.value;
		}else{
			BinaryTreeNode succ=null;
			BinaryTreeNode ancestor=root;
			while(ancestor.value!=current.value){
				if(ancestor.value>current.value){
					succ=ancestor;
					ancestor=ancestor.left;
				}else{
					ancestor=ancestor.right;
				}
				
			}
			return succ.value;
		}

	}

	public static int calculateInorderPre(BinaryTreeNode current,BinaryTreeNode root){
		if(current.left!=null){
			while(current!=null) current=current.right;
			return current.value;
		}else{
			BinaryTreeNode predessor=null;
			BinaryTreeNode ancestor=root;
			while(ancestor.value!=current.value){
				if(ancestor.value<current.value){
					predessor=ancestor;
					ancestor=ancestor.right;
				}else{
					ancestor=ancestor.left;
				}
			}
			return predessor.value;
		}
	}

	public static void main(String[] args) {
		BinaryTreeNode node=Util.getBST();
		search(node,node,10);


	}
}
