package CCI;
//incomplete
//stuck at point where how to backtrack the tree if right node is null
public class Successor_4_6 {
	public static int checkSuccessor(BinaryTreeNode root,int key){
		BinaryTreeNode temp=root;
		if(temp.value<key && temp.right!=null){
			temp=temp.right;
			while(temp.left!=null){
				temp=temp.left;
			}
			return temp.value;
		}
		BinaryTreeNode succ=null;
		temp=root;
	//	System.out.println(temp.value);
		while(temp!=null){
		 if(temp.value>key){
			 succ=temp;
			 temp=temp.left;
		 }else{
			 temp=temp.right;
		 }
		}
		return succ.value;
	}

	/*public static int checkSuccessor(BinaryTreeNode root,int key,BinaryTreeNode prev){
		BinaryTreeNode temp=root;
		BinaryTreeNode prevs=prev;
		if(temp==null)
			return prevs.value;

		prevs=temp;
		if(prevs.value<=key){
			temp=temp.right;
			//left is null then parent and right is null stop i.e. no Successor
			//if temp.right then go to leftmost element which is greater than root
			return checkSuccessor(temp,key,prevs);
		}else{

			if (temp.left == null && temp.value == key)
			{
				return prevs.value;
			}

			temp=temp.left;
			//left is null then parent and right is null the root
			//go to rightmost element - grater is root
			return checkSuccessor(temp, key,prevs);
		}
	}*/

	public static void main(String[] args) {
		BinaryTreeNode root=Util.getBST();
		int output=checkSuccessor(root,3);
		System.out.println(output);

	}
}
