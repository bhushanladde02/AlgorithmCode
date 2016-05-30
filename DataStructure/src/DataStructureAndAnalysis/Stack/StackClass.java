package DataStructureAndAnalysis.Stack;

import org.apache.commons.lang.ArrayUtils;

public class StackClass {
	int arr[]=new int[10];
	int i=0;
	public int remove(){
	    //System.out.println("i:"+i);
		//arr = ArrayUtils.remove(arr, i);
		int value=arr[i-1];
		arr = ArrayUtils.remove(arr, i-1);
		//System.out.println(arr.length);
		i--;
		return value;
	}
	public void insert(int a){
		arr[i]=a;
		i++;
	}
	public void print(){
		for(int k=0;k<i;k++){
			System.out.println(arr[k]);
		}
	}
	public static void main(String[] args) {
		//Stack Max Size Is 10
		StackClass stack=new StackClass();
		stack.insert(10);
		stack.insert(20);
		stack.insert(30);
		stack.insert(40);
		stack.insert(50);
		int p=stack.remove();
		System.out.println("Removed Value is :::"+p);
		
		stack.print();
		
	}
}
