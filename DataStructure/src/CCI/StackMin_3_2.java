package CCI;

import java.util.Stack;

class NodeStack{
	int value;
	int minValue;
	public NodeStack(int value, int minValue) {
		super();
		this.value = value;
		this.minValue = minValue;
	}
}
public class StackMin_3_2 {
	public void push(NodeStack node,Stack s){
		s.add(node);
	}
	public NodeStack pop(Stack s){
		NodeStack node=(NodeStack)s.pop();
		return node;
	}
	public NodeStack peek(Stack s){
		NodeStack node=(NodeStack)s.peek();
		return node;
	}
	public int min(Stack s,int value){
		if(s.empty()){
			return Integer.MAX_VALUE;
		}else{
			NodeStack node=peek(s);
			if(node.value<value){
				return node.value;
			}
			else{
				return value;
			}
		}
	}
	public static void main(String[] args) {
		StackMin_3_2 stackVa=new StackMin_3_2();
		Stack s=new Stack();
		stackVa.push(new NodeStack(8,stackVa.min(s,8)), s);
		stackVa.push(new NodeStack(6,stackVa.min(s,6)), s);
		stackVa.push(new NodeStack(10,stackVa.min(s,10)), s);
		stackVa.push(new NodeStack(5,stackVa.min(s,5)), s);
		stackVa.push(new NodeStack(11,stackVa.min(s,11)), s);
		
		NodeStack nodeStackValue=(NodeStack)stackVa.pop(s);
		System.out.println(nodeStackValue.value +" :: "+ nodeStackValue.minValue);
	}

}
