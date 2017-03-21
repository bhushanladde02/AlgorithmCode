package CCI;

public class HeightOfTree {
	public static int heightOfTree(BinaryTreeNode root){
		if(root==null)
			return -1;
		int left=heightOfTree(root.left);
		int right=heightOfTree(root.right);
		return Math.max(left,right)+1;
	}
	
	public static void main(String[] args) {
		
	 BinaryTreeNode root=Util.getBST();
	 int p=heightOfTree(root);
	 System.out.println(p);
	}

}
