package CSC130;
class Node implements Comparable<Node>{
	int value;
	Node left;
	Node right;
	public Node(int value){
		this.value=value;
		left=null;
		right=null;
	}
	@Override
	public int compareTo(Node arg0) {
		// TODO Auto-generated method stub
		if(this.value<arg0.value){ //right node
			return 1;
		}
		else if(this.value>arg0.value){ //left Node
			return -1;
		}else{
			return 0;
		}
	}
	
}
