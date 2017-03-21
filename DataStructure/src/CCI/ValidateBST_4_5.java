package CCI;

public class ValidateBST_4_5 {
	//recursive approch
	//- infinity = integer.minvalue
	//+ infinity = integer.maxvalue
	public static boolean validateBSTRecursive(BinaryTreeNode root){
		return helperMinMax(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	public static boolean helperMinMax(BinaryTreeNode node,int min,int max){
		if(node==null){
			return true;
		}
		if(node.value>max || node.value<min){
			return false;
		}
		boolean leftCheck=helperMinMax(node.left,min,node.value);
		boolean rightCheck=helperMinMax(node.right,node.value,max);
		return (leftCheck && rightCheck);
	}

	//runtime o(n) and space o(n) : iterative
	//wrong code - Check on http://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
	/*public static int validateBST(BinaryTreeNode root){
		int flag=0;
		BinaryTreeNode temp=root;
		LinkedList<BinaryTreeNode> bList=new LinkedList<BinaryTreeNode>();
		//LinkedList<BinaryTreeNode> childList=new LinkedList<BinaryTreeNode>();
		if(temp==null){
			return 1;
		}
		bList.add(temp);
		while(!bList.isEmpty()){
			//System.out.println("BST checking");
			BinaryTreeNode popBTN=bList.poll();
			if(popBTN.left!=null){
				if(popBTN.left.value<popBTN.value){
					bList.add(popBTN.left);
				}else{
					System.out.println("Tree is not BST");
					break;
				}
			}
			if(popBTN.right!=null){
				if(popBTN.right.value>popBTN.value){
					bList.add(popBTN.right);
				}else{
					System.out.println("Tree is not BST");
					break;
				}
			}
		}
		return flag;
	}*/

	public static void main(String[] args) {
		/*BinaryTreeNode root=new BinaryTreeNode(9);
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

		 */
		BinaryTreeNode node1=new BinaryTreeNode(20);
		BinaryTreeNode node2=new BinaryTreeNode(10);
		BinaryTreeNode node3=new BinaryTreeNode(22);
		BinaryTreeNode node4=new BinaryTreeNode(5);
		BinaryTreeNode node5=new BinaryTreeNode(22);

		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;

		boolean result=validateBSTRecursive(node1);
		System.out.println(result);
	}
}
