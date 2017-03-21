package Extraproblem;

public class QuickUnion {

	static int[] resultEdgeMap;

	public static void initialize(int maxIndex){
		resultEdgeMap=new int[maxIndex];
		for(int i=0;i<resultEdgeMap.length;i++){
			resultEdgeMap[i]=i;
		}
	}

	public static int calRoot(int i){
		if(resultEdgeMap[i]==i) return i;

		return calRoot(resultEdgeMap[i]);
	}

	public static boolean quickFind(int i,int j){
		return calRoot(i)==calRoot(j);
	}

	public static void union(int i,int j){
		int pi=calRoot(i);
		int pj=calRoot(j);
		if(pi!=pj)
		resultEdgeMap[i]=pj;
		//or resultEdgeMap[j]=pi;
	}

	public static void main(String[] args) {

		int max=9;
		initialize(max);
		System.out.println(quickFind(1,3));
		union(1,3);
		union(1,5);
		System.out.println(quickFind(1,5));
		
	}
}
