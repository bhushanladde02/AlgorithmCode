package DataStructureAndAnalysis.BinaryTree;

import org.apache.commons.lang.ArrayUtils;

public class StackClassNode {
	BTNode arr[]=new BTNode[10];
	int i=0;
	public BTNode remove(){
		System.out.println("Index Value i is:"+ i);
	    BTNode value=(BTNode)arr[i-1];
		arr = (BTNode[])ArrayUtils.remove(arr, i-1);
		i--;
		return value;
	}
	public void insert(BTNode a){
		arr[i]=a;
		i++;
	}
	public void print(){
		for(int k=0;k<i;k++){
			System.out.println(arr[k]);
		}
	}
	/*public static void main(String[] args) {
		//Stack Max Size Is 10
		StackClassNode stack=new StackClassNode();
		stack.insert(10);
		stack.insert(20);
		stack.insert(30);
		stack.insert(40);
		stack.insert(50);
		int p=stack.remove();
		System.out.println("Removed Value is :::"+p);
		
		stack.print();
		
	}*/
}
