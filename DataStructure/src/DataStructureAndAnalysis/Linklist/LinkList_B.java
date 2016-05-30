package DataStructureAndAnalysis.Linklist;

/*class Node{
	String data;
	Node next;
	public Node(String data,Node next){
		this.data=data;
		this.next=next;
	}
}*/

public class LinkList_B {

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
	public Node delete(Node head,String valueToBeDelete){
		Node traverse=head;
		Node pointerBehindTraverse=null;
		while(traverse!=null){
			if(valueToBeDelete.equals(traverse.data) && !head.data.equals(valueToBeDelete)){
				pointerBehindTraverse.next=traverse.next;
				traverse.next=null;
				traverse=null;
				traverse=pointerBehindTraverse;
			}else if(head.data.equals(valueToBeDelete)){
				pointerBehindTraverse=traverse.next;
				traverse=pointerBehindTraverse;
				return traverse;
			}
			else{
				pointerBehindTraverse=traverse;
			}
			traverse=traverse.next;
		}
		return head;
	}
	public static void main(String[] args) {
		String[] input={"Bhushan","Pradeep","Godson","Sachin"};
		LinkList_B listObj=new LinkList_B();
		
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
		//deleteing from the list
		System.out.println("\nList After The Delete::");
		Node headAfterDelete=listObj.delete(head,"Pradeep");
		listObj.printOutput(headAfterDelete);
	}

}
