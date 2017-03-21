package CSC130;

import java.util.Stack;

public class DFS{
	public static void dfsTraversal(Node node){
		//Queue for BFS
		Stack<Node> stack=new Stack<Node>();
		stack.add(node);
			while(!stack.isEmpty()){
				Node removeNode=stack.pop();
				System.out.println(removeNode.value);
				if(removeNode.left!=null){
					stack.add(removeNode.left);
				}
				if(removeNode.right!=null){
					stack.add(removeNode.right);
				}
				
			}
		
	}
	
	public static void main(String[] args) {
		Node root=new Node(9);
		Node node1=new Node(5);
		Node node2=new Node(12);
		Node node3=new Node(3);
		Node node4=new Node(6);
		Node node5=new Node(10);
		Node node6=new Node(15);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		dfsTraversal(root);
		
	}
}
