package Extraproblem;

public class QuickFindAlgo {
	static int[] resultEdgeMap;
	public static void initialize(int maxIndex){
		resultEdgeMap=new int[maxIndex];
		for(int i=0;i<resultEdgeMap.length;i++){
			resultEdgeMap[i]=i;
		}
	}

	public static boolean quickFind(int i,int j){
		return resultEdgeMap[i]==resultEdgeMap[j];
	}
	
	public static void union(int i,int j){
		int pi=resultEdgeMap[i];
		int pj=resultEdgeMap[j];
		for(int k=0;k<resultEdgeMap.length;k++){
			if(resultEdgeMap[k]==pi) resultEdgeMap[k]=pj;
		}
	}
	
	public static void main(String[] args) {

		int max=9;
		initialize(max);
		System.out.println(quickFind(1,3));
		union(1,3);
		System.out.println(quickFind(1,3));
		
		/*
		NodeGraph node1=new NodeGraph(1);
		NodeGraph node2=new NodeGraph(2);
		NodeGraph node3=new NodeGraph(3);
		NodeGraph node4=new NodeGraph(4);
		NodeGraph node5=new NodeGraph(5);
		NodeGraph node6=new NodeGraph(6);
		NodeGraph node7=new NodeGraph(7);
		NodeGraph node8=new NodeGraph(8);
		node1.edges[0]=node2;
		node1.edges[1]=node3;
		node2.edges[0]=node5;
		node4.edges[0]=node6;
		node7.edges[0]=node8;
		*/
	}
}
