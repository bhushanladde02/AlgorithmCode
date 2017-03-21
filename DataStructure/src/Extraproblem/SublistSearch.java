package Extraproblem;

import CCI.LLNode;
import CCI.ListOfDepths_4_3;
import CCI.Node;
import CCI.Util;

//http://www.geeksforgeeks.org/sublist-search-search-a-linked-list-in-another-list/

public class SublistSearch {

	public static boolean searchList(LLNode list1,LLNode list2)
	{
		boolean result=false;
		while(list2!=null && list1!=null){
			LLNode root=list1;
			if(list1.val==list2.val){
				while(list1!=null){
					if(list1.val!=list2.val){
						result=false;
						list1=root;
						break;
					}else{
						result=true;
						list2=list2.next;
						list1=list1.next;
					}

				}
			}else{
				result=false;
				list2=list2.next;
			}

		}
		return result;
	}
	public static void main(String[] args) {
		LLNode node=Util.getPallindromLinkedList();
		LLNode root=new LLNode(3);
		root.next=new LLNode(5);
		root.next.next=new LLNode(4);
		boolean result=searchList(root,node);
		if(result){
			System.out.println("Found");
		}else{
			System.out.println("Not found");
		}
	}
}
