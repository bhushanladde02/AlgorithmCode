package Shobhaki;

public class NodeKnapsack {
	public int weight;
	public int value;
	NodeKnapsack left;   //Don't take
	NodeKnapsack right;  //Take
	public NodeKnapsack(int weight,int value){
		this.weight=weight;
		this.value=value;
	}
}
