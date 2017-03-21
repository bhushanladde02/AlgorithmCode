package CSC130;

public class BST {
	
	public Node insert(Node root,Node insert){
		
		if(root==null){
			root=insert;
			return root;
		}
		else if(root.compareTo(insert)==1){
			//prevNodeRight=root;
			return insert(root.right,insert);
		}
		else//(root.compareTo(search)==-1)
		{   //prevNodeLeft=root;
			return insert(root.left,insert);
		}
		
	}
	
	public  Node searchValue(Node root,Node search){
		if(root!=null && root.compareTo(search)==0){
			return root;
		}
		else if(root.compareTo(search)==1){
			return searchValue(root.right,search);
		}
		else//(root.compareTo(search)==-1)
		{
			return searchValue(root.left,search);
		}
		
	}
	
	public static void main(String[] args) {
	
		BST bst=new BST();
		Node root =new Node(4);
		root.left=new Node(3);
		root.right=new Node(7);
		
		root.left.left=new Node(2);
		root.left.left.left=new Node(1);
		
		root.right.left=new Node(6);
		root.right.left.left=new Node(5);
		root.right.right=new Node(8);
		
		Node fetch=bst.searchValue(root,new Node(5));
		
		System.out.println(fetch.value);
	
		bst.insert(root,new Node(10));
		
		
		Node fetch1=bst.searchValue(root,new Node(10));
		
		System.out.println("After the insertion of that value::"+fetch1.value);
	
		
	}
}
