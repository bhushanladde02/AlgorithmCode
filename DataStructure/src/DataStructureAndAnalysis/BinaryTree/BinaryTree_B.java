//array with sorting
//code copied  : http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
package DataStructureAndAnalysis.BinaryTree;

import java.util.Stack;

import DataStructureAndAnalysis.Stack.StackClass;

public class BinaryTree_B {
	BTNode root;
	int i=0;
	public int[] arraySort(int a[]){
		//best solution to sort in a single array
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				a[i] = a[i] + a[i - 1];
				a[i - 1] = a[i] - a[i - 1];
				a[i] = a[i] - a[i - 1];
				i = 0;
			}
		}
		System.out.print("Sorted Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		return a;
	}

	/*public void inorderTraversal(){

		StackClassNode stack=new StackClassNode();
		BTNode traversal=root;
		//System.out.println("Root Data is :"+root.data);
		boolean done=false;
		int k=0;
		while(!done){
			k++;
			if(traversal.left!=null){
				stack.insert(traversal);
				traversal=traversal.left;
			}
			else{
				traversal=(BTNode)stack.remove();
				System.out.println(traversal.data);
				traversal=traversal.right;
				if(k==i){
					done=true;
				}
			}
		}
	}
	 */

	void inorder() {
		if (root == null) {
			return;
		}

		//keep the nodes in the path that are waiting to be visited
		Stack<BTNode> stack = new Stack<BTNode>();
		BTNode node = root;

		//first node to be visited will be the left one
		while (node != null) {
			stack.push(node);
			node = node.left;
		}

		// traverse the tree
		while (stack.size() > 0) {
			// visit the top node
			node = stack.pop();
			System.out.print(node.data + "  ,  ");
			if (node.right != null) {
				node = node.right;

				// the next node to be visited is the leftmost
				while (node != null) {
					stack.push(node);
					node = node.left;
				}
			}
		}
	}

	
	public void createBinaryTree(int a){

		//int i=1;
		//BTNode b=new BTNode();
		//b.data=a[0]; //root
		//int low=0;
		//int high=a.length-1;
		//int mid =(low+high)/2;
		/*
		while(true){
			if(b.data<a[i]){
			}else if(b.data>a[i]){
			}
		}
		//while(b.data<)
		 */
		//BTNode node=null;
		//BST Create Function
		BTNode node=new BTNode(a);
		if(root==null){
			root=node;
		}else {
			BTNode focusNode=root;
			BTNode parent;
			while(true){
				//Two separate points where focus node is traversing by comparing with current value
				parent=focusNode;
				if(node.data<focusNode.data){
					focusNode=focusNode.left;
					if(focusNode==null){
						System.out.println("Parent::"+parent.data);
						parent.left=node;
						System.out.println("Left Child::"+parent.left.data);
						return;
					}
				}else{
					focusNode=focusNode.right;
					if(focusNode==null){
						System.out.println("Parent::"+parent.data);
						parent.right=node;
						System.out.println("Right Child:"+parent.right.data);
						return;
					}
				}
				i++;
			}
		}
	}

	public static void main(String[] args) {
		BinaryTree_B bTree=new BinaryTree_B();
		int a[]={2,3,4,5,6,1,4,2};
		//a=bTree.arraySort(a);
		for(int i=0;i<a.length;i++){
			bTree.createBinaryTree(a[i]);
		}
		//bTree.inorderTraversal();
		//bTree.inorder();
	}
}
