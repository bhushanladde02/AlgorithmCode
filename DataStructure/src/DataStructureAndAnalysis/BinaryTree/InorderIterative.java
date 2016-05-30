/*package DataStructureAndAnalysis.BinaryTree;


import java.util.*;
public class InorderIterative {

	public static void main(String[] args) {


		Node N1=new Node(1);
		Node N2=new Node(2);
		Node N3=new Node(3);
		Node N4=new Node(4);
		Node N5=new Node(5);
		Node N6=new Node(6);
		Node N7=new Node(7);

		Node N8=new Node(8);
		Node N9=new Node(9);

		N1.left=N2;
		N1.right=N3;
		N2.left=N4;
		N2.right=N5;
		N3.left=N6;
		N3.right=N7;


		N4.right=N8;
		N7.right=N9;

		inorder(N1);



	}

	private static void inorder(Node n1) {


		Stack<Node> s=new Stack<Node>();

       boolean flag=true;
		while(flag)

		{
			
			while(n1!=null)

			{
				s.push(n1);
				n1=n1.left;
			}
			
			if(s.size()==0)
				break;
		
			Node temp=s.pop();
			System.out.println(temp.data);
			
			if(temp.right!=null)
				n1=temp.right;
			
		}
		
		
	}

}
*/