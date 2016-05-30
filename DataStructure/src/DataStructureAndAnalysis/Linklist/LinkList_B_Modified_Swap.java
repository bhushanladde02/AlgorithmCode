package DataStructureAndAnalysis.Linklist;

public class LinkList_B_Modified_Swap {

	public void createList(Node head,String[] input){ // Create and LinkedList
		Node traverse = head;
		for(int i=1;i<input.length;i++){
			traverse.next=new Node(input[i],null);
			/*		if(traverse.next.next==null){ }		*/
			traverse=traverse.next;
		}
	}
	public void printOutput(Node head){ //Print an LinkedList
		Node traverse=head;
		while(traverse!=null){
			System.out.println(traverse.data);
			traverse=traverse.next;
		}
	}
	public void insertNode(Node head,Node insertNode,int index){
		int count=0;
		Node traverse=head;
		while(traverse!=null){
			count++;
			if(count==index){
				insertNode.next=traverse.next;
				traverse.next=insertNode;
				traverse=traverse.next;
			}
			traverse=traverse.next;
		}
	}
	public void delete(Node node){// delete at exact location
		Node prev=null;
		while(node.next!=null){
			node.data=node.next.data;
			prev=node;
			node=node.next;
		}
		node=prev;
		//System.out.println(prev.data);
		node.next=null;
	}
	public Node getNode(Node head,String name){
		Node traverse=head;
		while(traverse!=null){
			if(traverse.data.equals(name)){
				return traverse;
			}
			traverse=traverse.next;
		}
		return null;
	}

	/*
	 //pradeep code
	 public void swapListOther(Node first, Node secondNode, Node head)
	{
		Node prevFirst = null;
		Node prevSecond = null;

		Node current = head;
	 	Node prev = null;

		while (current != null)
		{
			if (current.equals(first))
			{
				prevFirst = prev;
			}
			else if (current.equals(secondNode))
			{
				prevSecond = prev;
			}
			prev = current;
			prev = prev.next;

			if (prevFirst != null || prevSecond != null ) break;
		}

		if (prevFirst == null && prevSecond == null) return; //If there are  two head-not possible

		//10 -> 20 -> 30 -> 40 -> 50 -> 60
		//first = 20,  second = 50
		//prevFirst - 10, prevSecond = 40
		prevFirst.next = secondNode;
		Node temp = secondNode.next;
		secondNode.next = first.next;
		prevSecond.next = first;
		first.next = temp;

	}*/
	//Using swapping nodes

	public Node swapListOther(Node first, Node secondNode, Node head)
	{
		Node firstPre=null;
		Node secondPre=null;
		Node traverse=head;

		Node pre=null;
		//Find all previous nodes of current nodes....
		while(traverse!=null){
			if(traverse.data.equals(first.data)){
				//System.out.println("1");
				firstPre=pre;
			}
			else if(traverse.data.equals(secondNode.data)){
				//System.out.println("2");
				secondPre=pre;
			}

			/*if(firstPre==null && secondPre==null){
				System.out.println("I am getting previous values as null");
				return null;
			}*/

			pre=traverse;
			traverse=traverse.next;
		}
		//Actual swapping below....
		if(firstPre!=null && secondPre!=null){
			firstPre.next=secondNode;
			Node temp=secondNode.next;
			secondNode.next=first.next;

			secondPre.next=first;
			first.next=temp;
			
		}else if(firstPre==null){
			//System.out.println("firstPre Null");
			Node temp=secondNode.next;
			secondNode.next=first.next;
			head=secondNode;
			
			secondPre.next=first;
			first.next=temp;

		}else if(secondPre==null){
			System.out.println("SecondPre Null");
			/*Node temp=first.next;
			first.next=head.next;
			head=first;
			firstPre.next=secondNode;
			secondNode.next=temp;
			*/
			Node temp=first.next;
			first.next=secondNode.next;
			head=first;
			
			firstPre.next=secondNode;
			secondNode.next=temp;


		}

		return head;
	}


	//Using swapping data
	public Node swapList(Node first, Node secondNode,Node head){
		Node traverse=head;
		int i=1;
		String temp=secondNode.data;
		// Node prevNode=null;
		if(first!=null && secondNode!=null){
			while(traverse!=null){
				/*if(traverse.data.equals(first.data)){
					System.out.println("I am in first comparision" + traverse.data);
					//System.out.println(traverse.next);
					//System.out.println(secondNode.next);
					secondNode.next=traverse.next;
					//System.out.println(secondNode.next);
					traverse=secondNode;
				}
				else if(traverse.data.equals(secondNode.data)){
					first.next=traverse.next;
					traverse=first;
					System.out.println(traverse.data);
				}*/
				if(traverse.data.equals(first.data)){
					//System.out.println(first.data+ " - I am in First comparision function - " + secondNode.data);//pending
					traverse.data=temp;
				}
				else if(traverse.data.equals(secondNode.data)){
					//System.out.println("I am in second comparision");
					traverse.data=first.data;
				}

				//System.out.println("Value of i ::"+i);
				//i++;


				traverse=traverse.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		String[] input={"Bhushan","Pradeep","Godson","Sachin"};
		LinkList_B_Modified_Swap listObj=new LinkList_B_Modified_Swap();

		Node head=new Node(input[0],null); // Creating Head
		//creating list
		listObj.createList(head,input);
		//printing output
		System.out.println("\nList are below::");
		listObj.printOutput(head);
		//insertNode Value
		System.out.println("\nList after the Inserting Node:::");
		Node insertNode=new Node("Kiran",null);
		listObj.insertNode(head,insertNode, 1);
		listObj.printOutput(head);
		//deleting from the list
		//System.out.println("\nList After The Delete::");
		//listObj.delete(listObj.getNode(head,"Pradeep"));
		//listObj.printOutput(head);

		System.out.println("\nList After The swapping::");
		Node first=listObj.getNode(head,"Kiran");//new Node("Pradeep",null);//listObj.getNode(head,"Pradeep");
		Node second=listObj.getNode(head,"Godson");//new Node("Bhushan",null);//listObj.getNode(head,"Bhushan");
		//System.out.println("Second Node is: "+second.data);
		//listObj.swapList(first,second,head);
		head=listObj.swapListOther(first, second, head);
		listObj.printOutput(head);
	}
}
