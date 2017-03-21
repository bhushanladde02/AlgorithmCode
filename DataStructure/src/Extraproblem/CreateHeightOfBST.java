package Extraproblem;
//Balance BST ()
import CCI.BinaryTreeNode;
import CCI.HeightOfTree;
import CCI.Util;

public class CreateHeightOfBST {

	public static boolean balanceBST(BinaryTreeNode node){
		if(node == null){
			return true;
		}else{
			int leftV=HeightOfTree.heightOfTree(node.left);
			int rightV=HeightOfTree.heightOfTree(node.right);
			if( Math.abs(leftV-rightV)>=1 && balanceBST(node.left) && balanceBST(node.right)){
				return true;
			}
			return false;
		}

	}

	public static void main(String[] args) {
		BinaryTreeNode node=Util.getBST();
		boolean result=balanceBST(node);
		System.out.println(" Result : "+ result);
	}
}
