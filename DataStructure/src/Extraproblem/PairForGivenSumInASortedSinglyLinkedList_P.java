package Extraproblem;

import CCI.LLNode;
import CCI.Util;
//http://www.geeksforgeeks.org/find-pair-given-sum-sorted-singly-linked-without-extra-space/
//converted singly linkedlist into doubly linkedlist
//how to compare the reference in java - STUCK
public class PairForGivenSumInASortedSinglyLinkedList_P {

	public static LLNode createSinglyListIntoDoubly(LLNode current){
		LLNode prev=current;
		current=current.next;
		while(current!=null){
			current.prev=prev;
			prev=current;
			current=current.next;
		}
		return prev;
	}

	public static void findPairs(LLNode current,LLNode last,int sum){
		while(current!=null || last!=null){
			int firstValue=current.val;
			int secondValue=last.val;
			if((firstValue+secondValue)<sum){
				current=current.next;
			}
			else if((firstValue+secondValue)>sum){
				last=last.prev;
			}
			else{
				System.out.println("Pair are :("+firstValue+","+secondValue+")");
				current=current.next;
				last=last.prev;
			}
			if(current.hashCode()==last.hashCode()){//how to compare that both nodes are equal compare the references
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		LLNode node=Util.getSortedLinkedList();
		LLNode resultNode=createSinglyListIntoDoubly(node);
		findPairs(node,resultNode,17);
		/*while(resultNode!=null){
			System.out.println(resultNode.val);
			resultNode=resultNode.prev;
		}*/
	}

}
