package CCI;

import java.util.LinkedList;

public class RouteBetweenNodes_4_1 {

	public int findMax(int vertex[]){
		int max=-99;
		for(int i=0;i<vertex.length;i++){
			if(max<vertex[i]){
				max=vertex[i];
			}
		}
		return max;
	}

	public GraphNode[] createGraph(int vertex[],int edges[][],int max){
		GraphNode graph[]=new GraphNode[max+1];
		GraphNode prev=null;
		for(int i=0;i<vertex.length;i++){
			int vertx=vertex[i];
			graph[vertx]=new GraphNode(vertx);
		}
		for(int i=0;i<edges.length;i++){
			int vertx=edges[i][0];
			GraphNode temp=graph[vertx];
			//System.out.println("---------------vertx ::"+vertx);
			//System.out.println("graph[vertx] outside :: "+graph[vertx].value);
			while(temp!=null){
			//	System.out.println("graph[vertx].value : "+temp.value);
				prev=temp;
				temp=temp.next;
			}
			prev.next=new GraphNode(edges[i][1]);
			//System.out.println("prev.next.value : "+prev.next.value);
		}
		return graph;
	}

	public boolean findRoute(int firstpoint, int lastPoint, GraphNode[] nodegr){
		boolean result=false;
		GraphNode node=nodegr[firstpoint];
		if(node!=null){
			while(node!=null){
				if(node.value==nodegr[lastPoint].value){
					System.out.println("found edge between these two points.......");
					result=true;
					break;
				}
				node=node.next;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		RouteBetweenNodes_4_1 route=new RouteBetweenNodes_4_1();
		int vertex[]={2,1,4,5,6,8,0};
		int[][] edges = {{1,2},{2,4},{6,0},{1,4},{2,6},};
		int max=route.findMax(vertex);
		GraphNode[] nodegr=route.createGraph(vertex, edges,max);
		route.findRoute(1, 2, nodegr);
	}


	/*public LinkedList[] createGraph(int vertex[],int edges[][],int max){
		LinkedList<GraphNode> graph[]=new LinkedList[max+1];
		GraphNode prev=null;
		for(int i=0;i<vertex.length;i++){
			int vertx=vertex[i];
			graph[vertx]=new LinkedList<GraphNode>();
			graph[vertx].add(new GraphNode(vertx));
		}
		for(int i=0;i<edges.length;i++){
			int vertx=edges[i][0];
			graph[vertx].add(new GraphNode(edges[i][1]));
		}
		return graph;
	}*/
}
