package Extraproblem;

import java.util.Stack;

import CCI.LLNode;
import CCI.Util;

public class LinkedListCheckPallindrom {

	public static boolean checkPallindrom(LLNode node){ //using stack o(n) and space o(n)
		boolean result=true;
		Stack<LLNode> stack=new Stack<LLNode>();
		LLNode root=node;
		while(node!=null){
			stack.push(node);
			node=node.next;
		}
		while(root!=null){
			LLNode popV=stack.pop();
		//	System.out.println(popV.val);
			if(root.val!=popV.val)
			{
				result=false;
			}
			root=root.next;
		}
		return result;
	}
	/*public static boolean checkPallindrom(LLNode node){ //o(n) and o(1) - calculate mid and give the ans
		LLNode root=node;
		boolean result=true;
		LLNode reverseLinkedListRoot=LinkedListReverseProblem.reverse(node);
		while(root!= null && reverseLinkedListRoot!=null){
			System.out.println(root.val);
			System.out.println(reverseLinkedListRoot.val);
			if(root.val!=reverseLinkedListRoot.val){
				result=false;
				break;
			}
			root=root.next;
			reverseLinkedListRoot=reverseLinkedListRoot.next;
		}
		return result;
	}*/
	public static void main(String[] args) {
		LLNode root=Util.getPallindromLinkedList();	
		boolean result=checkPallindrom(root);
		System.out.println("Result (if true then pallindrom):" + result);
	}


}
