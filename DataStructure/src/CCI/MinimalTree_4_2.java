package CCI;

class BTreeNode{
	int value;
	BTreeNode leftChild=null;
	BTreeNode rightChild=null;
	public BTreeNode(int value){
		this.value=value;	
	}
}

public class MinimalTree_4_2 {
	
	public BTreeNode createBinarySearchTree(int array[],int start, int end){
		if(end<start){
			return null;
		}
		int mid= (start+end)/2;
		BTreeNode btree=new BTreeNode(array[mid]);
		//if(mid!=0)
		btree.leftChild=createBinarySearchTree(array,0,mid-1);
		//if(mid<array.length)
		btree.rightChild=createBinarySearchTree(array,mid+1,end-1);
		return btree;
	}
	
	public void inorderTraversal(BTreeNode node){
		if(node!=null){
			inorderTraversal(node.leftChild);
			System.out.println(node.value);
			inorderTraversal(node.rightChild);
		}
	}

/*	public void createBinarySearchTree(int array[]){
		int findMidPoint=0;
		if(array.length%2==0){
			findMidPoint=array.length/2;
		}else{
			findMidPoint=(array.length-1/2);
		}
		BTreeNode root=null;
		int i=findMidPoint;
		root=new BTreeNode(array[i]);
		traverseThrough(root,i,array);
	}
	public void traverseThrough(BTreeNode node,int index,int array[]){
		BTreeNode temp=node;
	//	int flag=2;
		while(true){
			if(temp.value>array[index]){
				while(temp.leftChild!=null){
					temp=temp.leftChild;
					traverseThrough(temp,index+1,array);
				}
				temp.leftChild=new BTreeNode(array[index]);
				index=index-1;
				//flag=1;
			}else{
				while(temp.rightChild!=null){
					temp=temp.rightChild;
					traverseThrough(temp,index+1,array);
				}
				temp.rightChild=new BTreeNode(array[index]);
				index=index+1;
				//flag=3;6
			}
		}
	}*/
	public static void main(String[] args) {
		MinimalTree_4_2 minimal = new MinimalTree_4_2();
		int array[]={1,2,3,4,5,6,7,8,9,10};
		BTreeNode tree=minimal.createBinarySearchTree(array,0,array.length);//,minimal);
		minimal.inorderTraversal(tree);
	}
}

