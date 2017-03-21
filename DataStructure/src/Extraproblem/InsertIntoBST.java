package Extraproblem;

import CCI.BinaryTreeNode;

public class InsertIntoBST {
	BinaryTreeNode root;
	BinaryTreeNode prev;
	BinaryTreeNode sample;
	public void insert(int a){
		if(root==null){
			System.out.println("Inserting at root : "+a);
			root=new BinaryTreeNode(a);
		}else{
			sample=root;
			while(sample!=null){
				prev=sample;
				if(sample.value>a){
					sample=sample.left;
				}else{
					sample=sample.right;
				}
			}
			if(prev.value>a){
				System.out.println("Inserting at left : "+ a);
				prev.left=new BinaryTreeNode(a);}
			else{
				System.out.println("Inserting at right : "+ a );
				prev.right=new BinaryTreeNode(a);
			}
		}
	}

	public static void main(String[] args) {
		int a[]={2,4,1,5,2,5,6,7};
		InsertIntoBST delete=new InsertIntoBST();
		for(int i: a){
			delete.insert(i);
		}
	}
}
