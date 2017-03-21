package CSC130;

import java.util.Stack;

public class SameTree {
  // use DFS
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(12);
		root.left.left = new Node(1);
		
		
		Node root1 = new Node(10);
		root1.left = new Node(12);
		root1.right = new Node(5);
		root1.right.right = new Node(1);
		
		System.out.println();
		System.out.println(checkMirrorTreeRecursion(root, root1));
		
	}
	
	public static boolean checkSameTree(Node rootOne, Node rootTwo)
	{
		//In DFS code.. check whether node are same in place of syso  - use two separate stack
		return false;
	}
	
	public static boolean checkMirrorTree(Node rootOne, Node rootTWo)
	{
		//In DFS code.. during pass left of tree in stack n other tree right in other stack... an cheeck whether they are same at SYSO in dfs code
		return false;
	}
	
	public static boolean checkMirrorTreeRecursion(Node rootOne, Node rootTwo) {
	{
		
		if (rootOne == null && rootTwo ==null)
		{
			return true;
		}
		
		if (rootOne == null || rootTwo == null)
		{
			return false;
		}
		

		boolean valueLeft=false;
		boolean valueRight=false;
		
		if(rootOne.value!=rootTwo.value){
			return false;
		}
		
	
		valueLeft = checkMirrorTreeRecursion(rootOne.left,rootTwo.right);
		valueRight = checkMirrorTreeRecursion(rootOne.right,rootTwo.left);
			
		
		return (valueLeft && valueRight);
	}
		
	}
	
}
