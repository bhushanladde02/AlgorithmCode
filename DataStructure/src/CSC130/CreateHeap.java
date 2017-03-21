package CSC130;

class HeapNode{
	int value;
	HeapNode left;
	HeapNode right;
}

public class CreateHeap {
	HeapNode root=null;
	public void createHeap(HeapNode node){
		if(root==null){
			root = node;
		}else{
			HeapNode traverseNode=root;
			while(traverseNode.value < node.value && traverseNode!=null){
				
				/*traverseNode=traverseNode.left;
				if(traverseNode!=null){
				}*/
				
			}
			while(traverseNode.value > node.value && traverseNode!=null){
				
				
				
				
			}
		}
		
	}
	public static void main(String[] args) {
		
	}
}
