//array with sorting
//code copied  : http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
//Code used for preorder : http://www.geeksforgeeks.org/iterative-preorder-traversal/

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

	/*
	 public void inorderTraversal(){

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
				}//push the value into the stack
			}
		}//end of while loop to empty the stack
	}

	void preorder() {
		if (root == null) {
			return;
		}

		//keep the nodes in the path that are waiting to be visited
		Stack<BTNode> stack = new Stack<BTNode>();
		BTNode node = root;

		stack.push(node);
		//System.out.println(stack.isEmpty());
		while(stack.isEmpty()==false){
			BTNode popNode=stack.peek();
			System.out.println(popNode.data);
			stack.pop();
			if(popNode.right!=null){
				stack.push(popNode.right);
			}
			if(popNode.left!=null){
				stack.push(popNode.left);
			}


		}

		//BTNode focusNode=null;
		//while(node!=null){
		//stack.push(node);
		//focusNode=node;
		//	System.out.println(node.data);



		/*while(focusNode.left!=null){
				node=focusNode;
				System.out.println(node.left.data);
				if(focusNode.right!=null){
					node=focusNode;
					System.out.println(node.right.data);
					//focusNode=focusNode.right;

				}
				focusNode=focusNode.left;

			}*/
		/*focusNode=node;

			while(focusNode.right!=null){
				node=focusNode;
				System.out.println(node.right.data);
				if(focusNode.left!=null){
					node=focusNode;
					System.out.println(node.left.data);
					//focusNode=focusNode.right;

				}
				focusNode=focusNode.right;

			}*/
		//while(focusNode.right!=null){

		//}
		/*while(focusNode.right!=null){
				System.out.println(focusNode.right.data);
				if(focusNode.left!=null){
					System.out.println(focusNode.left.data);	
				}
				focusNode=focusNode.right;				
			}*/


		//}
		//first node to be visited will be the left one
		/*while (node != null) {
			stack.push(node);
			node = node.left;
		}*/

		// traverse the tree
		/*	while (stack.size() > 0) {
			// visit the top node
			node = stack.pop();
			System.out.print(node.data + "  ,  ");
			if (node.right != null) {
				node = node.right;

				// the next node to be visited is the leftmost
				while (node != null) {
					stack.push(node);
					node = node.left;
				}//push the value into the stack
			}
		}*///end of while loop to empty the stack
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
						//System.out.println("Parent::"+parent.data); //IMP
						parent.left=node;
						//System.out.println("Left Child::"+parent.left.data);//IMP
						return;
					}
				}else{
					focusNode=focusNode.right;
					if(focusNode==null){
						//System.out.println("Parent::"+parent.data);//IMP
						parent.right=node;
						//System.out.println("Right Child:"+parent.right.data);//IMP
						return;
					}
				}
				i++;
			}
		}
	}

	public void postOrder(){
		/*
		 	1.1 Create an empty stack
			2.1 Do following while root is not NULL
			    a) Push root's right child and then root to stack.
			    b) Set root as root's left child.
			2.2 Pop an item from stack and set it as root.
			    a) If the popped item has a right child and the right child 
			       is at top of stack, then remove the right child from stack,
			       push the root back and set root as root's right child.
			    b) Else print root's data and set root as NULL.
			2.3 Repeat steps 2.1 and 2.2 while stack is not empty.
		 */

		Stack<BTNode> stack=new Stack<BTNode>();
		BTNode node=root;
		BTNode prevNode=null;
		while(node!=null){
			if(node.right!=null){
				stack.push(node.right);
				stack.push(node);
			}
			prevNode=node;
			node=node.left;
		}
		node=prevNode;
		while(stack.isEmpty()==false){
			//System.out.println(node.data);
			if(node.right!=null){
				//push right and that node in to the stack
				System.out.println("I am pushing into stack again");
				stack.push(node.right);
				stack.push(node);
				node=node.left;
			}else{
				//else print
				System.out.println(node.data);//left node is printed who don't have right child
				BTNode rootNodePeek=stack.pop();//node pop
				//System.out.println(nodePeek.data);
				BTNode checkRightChild=stack.pop(); //right node pop
				if(rootNodePeek.right!=null && rootNodePeek.right.data==checkRightChild.data){
					stack.push(rootNodePeek);
					System.out.println(checkRightChild.data);
				}else if(rootNodePeek.right.data!=checkRightChild.data){
					System.out.println(rootNodePeek.data);
				}	
			}
		}
	}

	public static void main(String[] args) {
		BinaryTree_B bTree=new BinaryTree_B();
		//int a[]={1,3,7,2,5,4,7,6};
		int a[]={2,3,4,5,6,1,4,2};
		//a=bTree.arraySort(a);
		for(int i=0;i<a.length;i++){
			bTree.createBinaryTree(a[i]);
		}
		//bTree.inorderTraversal();
		//bTree.inorder();
		//bTree.preorder();
		bTree.postOrder();
	}
}
