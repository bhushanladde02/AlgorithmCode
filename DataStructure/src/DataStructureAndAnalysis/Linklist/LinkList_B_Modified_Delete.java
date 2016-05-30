package DataStructureAndAnalysis.Linklist;

/*class Node{
	String data;
	Node next;
	public Node(String data,Node next){
		this.data=data;
		this.next=next;
	}
}*/

public class LinkList_B_Modified_Delete {

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
	public static void main(String[] args) {
		String[] input={"Bhushan","Pradeep","Godson","Sachin"};
		LinkList_B_Modified_Delete listObj=new LinkList_B_Modified_Delete();
		
		Node head=new Node(input[0],null); // Creating Head
		//creating list
		listObj.createList(head,input);
		//printing output
		System.out.println("\nList are below::");
		listObj.printOutput(head);
		//insertNode Value
		System.out.println("\nList after the Inserting Node:::");
		Node insertNode=new Node("Kiran",null);
		listObj.insertNode(head,insertNode, 2);
		listObj.printOutput(head);
		//deleting from the list
		System.out.println("\nList After The Delete::");
		listObj.delete(listObj.getNode(head,"Pradeep"));
		listObj.printOutput(head);
	}
}
