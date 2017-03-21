package CCI;

public class FindKthLinkedList2_1 {
	public void findMin(Node node,int kthEle){
		int index=kthEle;
		int count=0;
		while(node!=null){
			if(index==count){
				System.out.println("kth Element is::::"+node.value);
				break;
			}
			count++;	
			node=node.node;
		}
	}
	public static void main(String[] args) {
		FindKthLinkedList2_1 findLink=new FindKthLinkedList2_1();
		Node first=new Node(8,new Node(6,new Node(6,null)));
		findLink.findMin(first,0);
	}
}
