package Extraproblem;
//discuss with pradeep and then implement it!!!!!
import java.util.LinkedList;
import java.util.TreeMap;

import CCI.NodeGraph;
//how to put edge
public class DijkstraAlgo_P {
	public static void calMinWeight(NodeGraph[] graph,NodeGraph startNode,NodeGraph endNode){
		TreeMap<String,Integer> minHeap=new TreeMap<String,Integer>();
		
		
		
		
		/*LinkedList<NodeGraph> list=new LinkedList<NodeGraph>();
		list.add(startNode);
		while(!list.isEmpty()){
			NodeGraph popNode=list.poll();
			for(int i=0;i<popNode.edges.length;i++){
				
			}
		}*/
		/*Stack stack=
		while(!startNode.index.equals(endNode.index)){
			
		}*/
	}
	
	public static void main(String[] args) {
		NodeGraph[]  graph=new NodeGraph[5];
		
		graph[0]=new NodeGraph("A");
		graph[0].weight=Integer.MAX_VALUE;
		graph[1]=new NodeGraph("B");
		graph[1].weight=Integer.MAX_VALUE;
		graph[2]=new NodeGraph("C");
		graph[2].weight=Integer.MAX_VALUE;
		graph[3]=new NodeGraph("D");
		graph[3].weight=Integer.MAX_VALUE;
		graph[4]=new NodeGraph("E");
		graph[4].weight=Integer.MAX_VALUE;
	
		graph[0].edges[0]=graph[1];
		graph[0].edges[0].weight=4;
		graph[0].edges[1]=graph[2];
		graph[0].edges[1].weight=8;

		graph[1].edges[0]=graph[3];
		graph[1].edges[0].weight=3;
		graph[1].edges[1]=graph[0];
		graph[1].edges[1].weight=4;

		graph[2].edges[0]=graph[0];
		graph[2].edges[0].weight=8;
		graph[2].edges[1]=graph[3];
		graph[2].edges[1].weight=4;
		graph[2].edges[2]=graph[4];
		graph[2].edges[2].weight=8;

		graph[3].edges[0]=graph[1];
		graph[3].edges[0].weight=3;
		graph[3].edges[1]=graph[2];
		graph[3].edges[1].weight=4;
		
		graph[4].edges[0]=graph[2];
		graph[4].edges[0].weight=7;

		
		calMinWeight(graph,graph[1],graph[4]);
	}
}
