package CCI;

public class CheckBalanced_4_4 {
	public static int heightOfATree(BinaryTreeNode root,int i){
		BinaryTreeNode temp=root;
		if(temp==null){
			return 0;
		}
		//System.out.println("Value of i ::::"+i);
		//System.out.println("root value:::"+root.value);
		int size=Math.max(heightOfATree(root.left,i+1),heightOfATree(root.right,i+1))+1;
		return size; 
	}
	public static int checkBalance(BinaryTreeNode root){
	
		//try to understand how to calculate height of the tree.....
		BinaryTreeNode temp=root;
		int leftSize=0;
		int rightSize=0;
		if(temp.left!=null){
			leftSize=heightOfATree(temp.left,0);
		}
		if(temp.right!=null){
			rightSize=heightOfATree(temp.right,0);
		}
		System.out.println("Left Size:"+leftSize);
		System.out.println("Right Size:"+rightSize);
		
		int calDiff=Math.abs(leftSize-rightSize);
		
		if(calDiff>1)
		return 0;
		else
		return 1;
	}
	
	public static void main(String[] args) {	
		BinaryTreeNode root=new BinaryTreeNode(9);
		BinaryTreeNode node1=new BinaryTreeNode(5);
		BinaryTreeNode node2=new BinaryTreeNode(12);
		BinaryTreeNode node3=new BinaryTreeNode(3);
		BinaryTreeNode node4=new BinaryTreeNode(6);
		BinaryTreeNode node5=new BinaryTreeNode(10);
		BinaryTreeNode node6=new BinaryTreeNode(15);

		BinaryTreeNode node7=new BinaryTreeNode(8);
		BinaryTreeNode node8=new BinaryTreeNode(2);

		
		
		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		node2.left = node5;
		node2.right = node6;
		
		//Following nodes are used to create unbalance tree
		
		node6.right = node7;
		
		node7.right = node8;
		
		int flag=checkBalance(root);
		if(flag==1)
			System.out.println("Given Tree is balance");
		else
			System.out.println("Given Tree is not balance");
		
		
	}
}
