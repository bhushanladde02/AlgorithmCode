package Extraproblem;

import CCI.LLNode;
import CCI.Util;

public class LinkedListReverseProblem {
	public static LLNode reverse(LLNode node){
		LLNode current=node;
		LLNode pre=null;
		LLNode temp=node;
		while(current!=null){
			temp=current.next;
			current.next=pre;
			pre=current;
			current=temp;
		}
		//System.out.println(pre.val);
		return pre;
	}

	public static void main(String[] args) {
		LLNode node=Util.getLinkedList();
		System.out.println("BEFORE");
		Util.printLinkedList(node);
		
		LLNode node1=reverse(node);

		System.out.println("\nAFTER");
		Util.printLinkedList(node1);

	}
}
