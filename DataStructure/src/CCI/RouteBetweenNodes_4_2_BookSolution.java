package CCI;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class BookGraphNode{
	int value;
	BookGraphNode[] next;
	boolean visited=false;
	public BookGraphNode(int value){
		this.value=value;
	}
}

public class RouteBetweenNodes_4_2_BookSolution {

	public void bfsFindMinRoute(BookGraphNode rootNode, BookGraphNode secondNode){
		Queue<BookGraphNode> queue =new LinkedList<BookGraphNode>();
		queue.add(rootNode);
		while(!queue.isEmpty()){
			BookGraphNode nodeG=queue.poll();
			nodeG.visited=true;
			if(nodeG.value==secondNode.value){
				System.out.println("Valid Route is present");
				break;
			}
			System.out.println("Graph Node : "+ nodeG.value);
			for(int i=0;nodeG.next!=null && i<nodeG.next.length;i++){
				if(nodeG.next[i].visited==false){
					queue.add(nodeG.next[i]);
					nodeG.next[i].visited=true;
				}
			}
			
		}
	}

	public static void main(String[] args) {

		RouteBetweenNodes_4_2_BookSolution route=new RouteBetweenNodes_4_2_BookSolution();

		BookGraphNode ver1=new BookGraphNode(1);
		BookGraphNode ver2=new BookGraphNode(2);
		BookGraphNode ver3=new BookGraphNode(3);
		BookGraphNode ver4=new BookGraphNode(4);
		BookGraphNode ver5=new BookGraphNode(5);
		BookGraphNode ver6=new BookGraphNode(6);
		BookGraphNode ver7=new BookGraphNode(7);
		BookGraphNode ver8=new BookGraphNode(8);
		BookGraphNode ver9=new BookGraphNode(9);

		ver1.next=new BookGraphNode[2];
		ver1.next[0]=ver2;
		ver1.next[1]=ver3;

		ver2.next=new BookGraphNode[3];
		ver2.next[0]=ver5;
		ver2.next[1]=ver4;
		ver2.next[2]=ver6;

		ver3.next=new BookGraphNode[1];
		ver3.next[0]=ver4;

		ver4.next=new BookGraphNode[1];
		ver4.next[0]=ver7;

		ver5.next=new BookGraphNode[1];
		ver5.next[0]=ver7;

		ver6.next=new BookGraphNode[1];
		ver6.next[0]=ver7;

		ver7.next=new BookGraphNode[2];
		ver7.next[0]=ver8;
		ver7.next[1]=ver9;

		route.bfsFindMinRoute(ver2,ver7);

		//int vertex[]={2,1,4,5,6,8,0};
		//int[][] edges = {{1,2},{2,4},{6,0},{1,4},{2,6},};
		/*int max=route.findMax(vertex);
		GraphNode[] nodegr=route.createGraph(vertex, edges,max);
		route.findRoute(1, 2, nodegr);*/
	}
}
