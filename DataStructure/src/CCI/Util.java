package CCI;

import java.util.List;

public class Util {

	public static LLNode getPallindromLinkedList(){
		LLNode root =new LLNode(2);
		root.next=new LLNode(3);
		root.next.next=new LLNode(4);
		root.next.next.next=new LLNode(5);
		root.next.next.next.next=new LLNode(3);
		root.next.next.next.next.next=new LLNode(2);
		return root;
	}
	
	
	public static LLNode getLoopLinkedList(){
		LLNode root =new LLNode(3);
		root.next=new LLNode(6);
		root.next.next=new LLNode(7);
		root.next.next.next=new LLNode(8);
		root.next.next.next.next=new LLNode(9);
		root.next.next.next.next.next=root.next.next.next;
		return root;
	}
	
	public static LLNode getSortedLinkedList(){
		LLNode root =new LLNode(3);
		root.next=new LLNode(6);
		root.next.next=new LLNode(7);
		root.next.next.next=new LLNode(8);
		root.next.next.next.next=new LLNode(9);
		root.next.next.next.next.next=new LLNode(10);
		root.next.next.next.next.next.next=new LLNode(11);
		return root;
	}
	
	public static int[] getIntegerArray(){
		int a[]={8,2,4,3,1,7};
		return a;
	}

	public static double[] getDoubleArray(){
		double a[]={0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434};
		return a;
	}
	public static BinaryTreeNode getBT() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode node1=new BinaryTreeNode(2);
		BinaryTreeNode node2=new BinaryTreeNode(3);
		BinaryTreeNode node3=new BinaryTreeNode(4);
		BinaryTreeNode node4=new BinaryTreeNode(5);
		BinaryTreeNode node5=new BinaryTreeNode(6);
		BinaryTreeNode node6=new BinaryTreeNode(7);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		return root;
	}

	public static BinaryTreeNode getBST() {
		BinaryTreeNode root=new BinaryTreeNode(9);
		BinaryTreeNode node1=new BinaryTreeNode(5);
		BinaryTreeNode node2=new BinaryTreeNode(12);
		BinaryTreeNode node3=new BinaryTreeNode(3);
		BinaryTreeNode node4=new BinaryTreeNode(6);
		BinaryTreeNode node5=new BinaryTreeNode(10);
		BinaryTreeNode node6=new BinaryTreeNode(15);

		//BinaryTreeNode node7=new BinaryTreeNode(16);
		//BinaryTreeNode node8=new BinaryTreeNode(17);

		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		node2.left = node5;
		node2.right = node6;
		//node6.right=node7;
		//node7.right=node8;
		return root;
	}
	
	public static BinaryTreeNode findMaximumPathSumInABinaryTree(){
	
		BinaryTreeNode root=new BinaryTreeNode(10);
		BinaryTreeNode node2=new BinaryTreeNode(2);
		BinaryTreeNode node10=new BinaryTreeNode(10);
		BinaryTreeNode node20=new BinaryTreeNode(20);
		BinaryTreeNode node1=new BinaryTreeNode(1);
		BinaryTreeNode node_25=new BinaryTreeNode(-25);
		BinaryTreeNode node3=new BinaryTreeNode(3);
		BinaryTreeNode node4=new BinaryTreeNode(4);
		root.left=node2;
		root.right=node10;
		node2.left=node20;
		node2.right=node1;
		node10.right=node_25;
		node_25.left=node3;
		node_25.right=node4;
		return root;
	}

	public static BinaryTreeNode getCompleteBinaryTrees(){
		//every level of tree is fully filled expect the last level
		BinaryTreeNode root=new BinaryTreeNode(10);
		BinaryTreeNode node5=new BinaryTreeNode(5);
		BinaryTreeNode node20=new BinaryTreeNode(20);
		BinaryTreeNode node3=new BinaryTreeNode(3);
		BinaryTreeNode node7=new BinaryTreeNode(7);
		BinaryTreeNode node15=new BinaryTreeNode(15);

		root.left=node5;
		root.right=node20;

		node5.left=node3;
		node5.right=node7;

		node20.left=node15;
		return root;
	}

	public static void printBinaryTreeNodeValueList(List<BinaryTreeNode> list){
		for(BinaryTreeNode bin:list){
			System.out.println(bin.value);
		}
	}
	
	public static BinaryTreeNode getOddLevelBinaryTree(){
		BinaryTreeNode root=new BinaryTreeNode(5);
		BinaryTreeNode node10=new BinaryTreeNode(10);
		BinaryTreeNode node2=new BinaryTreeNode(2);
		BinaryTreeNode node3=new BinaryTreeNode(3);
		BinaryTreeNode node4=new BinaryTreeNode(4);
		BinaryTreeNode node44=new BinaryTreeNode(44);
		BinaryTreeNode node12=new BinaryTreeNode(12);
		BinaryTreeNode node15=new BinaryTreeNode(15);
		BinaryTreeNode node9=new BinaryTreeNode(9);
		BinaryTreeNode node8=new BinaryTreeNode(8);
		
		root.left=node10;
		root.right=node2;
		node10.left=node3;
		node10.right=node4;
		node4.left=node44;
		node44.right=node12;
		node2.right=node15;
		node15.left=node9;
		node15.right=node8;
		return root;
	}

	public static BinaryTreeNode getFullBinaryTrees(){
		//every node has zero or two children. No node have only one child
		/*// CCI Example
		 * 
		BinaryTreeNode root=new BinaryTreeNode(10);
		BinaryTreeNode node5=new BinaryTreeNode(5);
		BinaryTreeNode node20=new BinaryTreeNode(20);
		BinaryTreeNode node3=new BinaryTreeNode(3);
		BinaryTreeNode node7=new BinaryTreeNode(7);
		BinaryTreeNode node9=new BinaryTreeNode(9);
		BinaryTreeNode node18=new BinaryTreeNode(18);

		root.left=node5;
		root.right=node20;

		node20.left=node3;
		node20.right=node7;

		node3.left=node9;
		node3.right=node18;

		return root; */

		BinaryTreeNode root=new BinaryTreeNode(10);
		BinaryTreeNode node28=new BinaryTreeNode(28);
		BinaryTreeNode node13=new BinaryTreeNode(13);
		BinaryTreeNode node14=new BinaryTreeNode(14);
		BinaryTreeNode node15=new BinaryTreeNode(15);
		BinaryTreeNode node21=new BinaryTreeNode(21);
		BinaryTreeNode node22=new BinaryTreeNode(22);
		BinaryTreeNode node23=new BinaryTreeNode(23);
		BinaryTreeNode node24=new BinaryTreeNode(24);

		root.left=node28;
		root.right=node13;

		node13.left=node14;
		node13.right=node15;

		node14.left=node21;
		node14.right=node22;

		node15.left=node23;
		node15.right=node24;

		return root;
	}

	public static BinaryTreeNode perfectBinaryTrees(){
		BinaryTreeNode root=new BinaryTreeNode(10);
		BinaryTreeNode node5=new BinaryTreeNode(5);
		BinaryTreeNode node20=new BinaryTreeNode(20);
		BinaryTreeNode node3=new BinaryTreeNode(3);
		BinaryTreeNode node7=new BinaryTreeNode(7);
		BinaryTreeNode node9=new BinaryTreeNode(9);
		BinaryTreeNode node18=new BinaryTreeNode(18);

		root.left=node5;
		root.right=node20;

		node5.left=node9;
		node5.right=node18;

		node20.left=node3;
		node20.right=node7;

		return root;
	}
	public static BinaryTreeNode subTreeOfPerfectBinaryTree(){
		BinaryTreeNode node5=new BinaryTreeNode(5);
		BinaryTreeNode node9=new BinaryTreeNode(9);
		BinaryTreeNode node18=new BinaryTreeNode(18);
		node5.left=node9;
		node5.right=node18;
		return node5;
	}

	public static LLNode getLinkedList() {
		LLNode head = new LLNode(1);
		head.next=new LLNode(1);
		head.next.next = new LLNode(1);
		head.next.next.next = new LLNode(1);
		head.next.next.next.next = new LLNode(1);
		head.next.next.next.next.next = new LLNode(1);
		return head;
	}

	public static void printLinkedList(LLNode head) {
		if(head != null){		
			System.out.print(head.val + "->");
			printLinkedList(head.next); 
		}
	}
	public static void printArray(int a[]){
		for (int  i: a){
			System.out.println(i);
		}
	}
	public static void printTreeInorder(BinaryTreeNode node){
		if(node==null){
			return;
		}
		System.out.println(node.value);
		printTreeInorder(node.left);
		printTreeInorder(node.right);
	}
	public static int[][] getMatrix(){
		 int[][] mtrix={{7,8,9},{6,1,2},{5,4,3}};
		 return mtrix;
	}
	public static int[][] getGivenPrintMatrix(){
		 int[][] mtrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		 return mtrix;
	}
}
