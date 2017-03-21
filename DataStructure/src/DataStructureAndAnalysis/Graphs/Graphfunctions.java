package DataStructureAndAnalysis.Graphs;

class NodeGraph{
	int value;
	NodeGraph next;
	public NodeGraph(int value){
		this.value=value;
		this.next=null;
	}
}
public class Graphfunctions {
	public static void main(String[] args) {
		Graphfunctions graphObj=new Graphfunctions();
		int vertex[]={2,1,4,5,6,8,0};
		int[][] edges = {{1,2},{2,4},{1,4},{2,6},{6,0}};
		int max=graphObj.findMax(vertex);
		NodeGraph[] nodegr=graphObj.createGraph(vertex, edges,max);
		int startPoint=2;
		int endPoint=4;
		System.out.println("Result : "+graphObj.findEdge(nodegr,startPoint,endPoint,max));
		
	}
	public boolean findEdge(NodeGraph[] nodegr,int startPoint,int endPoint,int max){
		boolean result=false;
		if(startPoint<max){
			while(nodegr[startPoint]!=null){
				if(nodegr[startPoint].value==endPoint){
					result=true;
					break;
				}
			}
		}
		return result;
	}
	public NodeGraph[] createGraph(int vertex[],int[][] graph,int max){
	
		
		NodeGraph prev=null;
		NodeGraph[] node=new NodeGraph[max];
		
		for(int i=0;i<graph.length;i++){
			int firstPointEdge=graph[i][0];
			for(int j=0;j<vertex.length;j++){
				if(vertex[j]==firstPointEdge){
					if(node[firstPointEdge]==null){
					node[firstPointEdge]=new NodeGraph(graph[i][1]);
					}else{
						while(node[firstPointEdge]!=null){
							
							prev=node[firstPointEdge];
							node[firstPointEdge]=node[firstPointEdge].next;
						}
						prev.next=new NodeGraph(graph[i][1]);
					}
				}
			}
		}
		return node;
	}
	public int findMax(int vertex[]){
		int max=-99;
		for(int i=0;i<vertex.length;i++){
			if(max<vertex[i]){
				max=vertex[i];
			}
		}
		return max;
		
	}
}
