package CCI;

import java.util.Stack;

public class MyQueueUsingTwoStacks_3_4 {
	Stack<Integer> s1=new Stack<Integer>();
	Stack<Integer> s2=new Stack<Integer>();
	public void pushS1(int value){
		s1.push(value);
	}
	public int popS1(){
		return s1.pop();
	}

	public void pushS2(int value){
		s2.push(value);
	}

	public int popS2(){
		return s2.pop();
	}

	public static void main(String[] args) {
		MyQueueUsingTwoStacks_3_4 queue=new MyQueueUsingTwoStacks_3_4();
		int a[]={2,3,1,4,5,6,9};
		for(int i:a){
			queue.pushS1(i);
		}
		while(!queue.s1.isEmpty()){
			queue.pushS2(queue.popS1());
		}
		while(!queue.s2.isEmpty()) {
			System.out.println(queue.popS2());
		}
		
		
		
	}
}
