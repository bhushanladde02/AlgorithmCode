package Extraproblem;
//http://www.programcreek.com/2014/04/leetcode-remove-linked-list-elements-java/
import CCI.LLNode;
import CCI.Util;

public class DeleteNode_P {

	/*
	public static LLNode deleteR(LLNode node,int value,LLNode pre,LLNode root){

		if(node==null){
		  	return root;
		}

		if(node!=null && node.val==value){
			System.out.println("I am in delete loop");
			pre.next=node.next;
		}
		return deleteR(node.next,value,node,root);


	}
	 */
	public static LLNode deleteLink(LLNode head,int value){
		LLNode helperNode=new LLNode(0);
		helperNode.next=head;
		LLNode p=helperNode;
		while(p.next!=null){
			if(p.next.val==value){
				LLNode temp=p.next;
				p.next=temp.next;
			}else{
				p = p.next;
			}

		}
		return helperNode.next;


	}

	/*
	 * fix this logic (next year - pradeep )
	 * public static LLNode delete(LLNode node,int value){
		LLNode root=node;
		LLNode pre=node;
		while(node!=null){
			if(root.val==value){
				root=root.next;
			}
			if(node.val==value){
				while(node.val==node.next.val){
					node=node.next;
					if(node.next==null){
						break;
					}
				}

				pre.next=node.next;

			}

			pre=node;
			node=node.next;
		}
		return root;
	}
	 */
	public static void main(String[] args) {
		LLNode node=Util.getLinkedList();
		System.out.println("BEFORE");
		Util.printLinkedList(node);

		LLNode node1=deleteLink(node,1);
		//LLNode node2=deleteR(node,10,null,node);

		System.out.println("\nAFTER");
		Util.printLinkedList(node1);
	}
}
