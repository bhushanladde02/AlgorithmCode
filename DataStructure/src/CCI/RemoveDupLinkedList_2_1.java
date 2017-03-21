package CCI;

public class RemoveDupLinkedList_2_1 {
	public static int findMax(Node node){
		int temp=0;
		while(node!=null){
			if(temp<node.value){
				temp=node.value;
			}
			node=node.node;
		}
		return temp;
	}

	public boolean checkDuplicates(Node node){
		int val=RemoveDupLinkedList_2_1.findMax(node);
		System.out.println(val);
		boolean a[]=new boolean[val+1];

		while(node!=null){
			if(a[node.value]==true){
				return false;
			}
			a[node.value]=true;
			node=node.node;
		}
		return true;
	}

	public static void main(String[] args) {
		RemoveDupLinkedList_2_1 removeDup=new RemoveDupLinkedList_2_1();
		Node first=new Node(8,new Node(6,new Node(6,null)));
		boolean val=removeDup.checkDuplicates(first);
		if(val){
			System.out.println("no duplicates");
		}else{
			System.out.println("duplicates");
		}
	}
}
