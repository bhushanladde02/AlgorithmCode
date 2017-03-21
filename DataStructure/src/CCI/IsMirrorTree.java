package CCI;
// runtime - o(n) and space is o(1)
public class IsMirrorTree {

	public static boolean isMirror(BinaryTreeNode node){
		if(node == null){
			return true;
		}
		return helper(node.left,node.right);
	}
	public static boolean helper(BinaryTreeNode node1, BinaryTreeNode node2){
		if(node1 ==null || node2==null){
			return true;
		}
		if(node1.value != node2.value){
			return false;
		}
		boolean checkLeft=helper(node1.left,node2.right);
		boolean checkRight=helper(node2.left,node1.right);
		return (checkLeft && checkRight);
	}
	public static void main(String[] args) {	
		BinaryTreeNode root=new BinaryTreeNode(20);
		BinaryTreeNode node1=new BinaryTreeNode(10);
		BinaryTreeNode node2=new BinaryTreeNode(10);
		BinaryTreeNode node3=new BinaryTreeNode(2);
		BinaryTreeNode node4=new BinaryTreeNode(5);
		BinaryTreeNode node5=new BinaryTreeNode(5);
		BinaryTreeNode node6=new BinaryTreeNode(2);

		root.left = node1;
		root.right = node2;

		node1.left = node3;
		node1.right = node4;

		node2.left = node5;
		node2.right = node6;
		
		boolean result=isMirror(root);
		System.out.println(result);
		
	}
	
}
