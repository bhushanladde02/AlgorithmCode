package Extraproblem;

import java.util.HashMap;

import CCI.LLNode;
import CCI.Util;

public class DetectLoopLinkedList {

	public static LLNode detectLoop(LLNode current){
		LLNode root=current;
		HashMap  map=new HashMap();
		while(current!=null){
			if(!map.containsKey(current.hashCode())){
				map.put(current.hashCode(),current.val);
			}
			else{
				current.next=null;
			}
			current=current.next;
		}
		return root;

	}

	public static void main(String[] args) {
		LLNode root=Util.getLoopLinkedList();
		LLNode result=detectLoop(root);
		while(result!=null){
			System.out.println(result.val);
			result=result.next;
		}
	}
}
