package CSC130;

import java.util.PriorityQueue;

public class Assiegnment2_part3 {
	
	class PNode implements Comparable<PNode>{
		int data;
		int arrayIndex;
		
		public PNode(int data, int arrayIndex)
		{
			this.data = data;
			this.arrayIndex = arrayIndex;
		}
		
		@Override
		public int compareTo(PNode o) {
			return Integer.compare(this.data, o.data);
		}
	}

	public int[]  threeWayMerge (int[ ] a, int [ ] b, int [ ] c){
		int i=0,j=0,k=0,s=0;
		int length=a.length+b.length+c.length;
		int result[]=new int[length];
		
		PriorityQueue<PNode> queue=new PriorityQueue<PNode>();
		PNode first=new PNode(a[i],1);
		PNode second=new PNode(b[j],2);
		PNode third=new PNode(c[k],3);
		queue.add(first);
		queue.add(second);
		queue.add(third);
		
		while(!queue.isEmpty()){			
			PNode popNode=queue.poll();
			result[s]=popNode.data;
			System.out.println(popNode.data);
			if(popNode.arrayIndex==1 && ++i<a.length){
	
				queue.add(new PNode(a[i],1));
			}
			else if(popNode.arrayIndex==2 && ++j<b.length){
				
				queue.add(new PNode(b[j],2));
			}
			else if(popNode.arrayIndex==3 && ++k<c.length){
				
				queue.add(new PNode(c[k],3));
			}
		  s++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int a[]={1,5,7,9,12,15,16};
		int b[]={2,4,7,8,10,15};
		int c[]={3,6,8,10,11,13,18};
		Assiegnment2_part3 part3=new Assiegnment2_part3();
		part3.threeWayMerge(a, b, c);
	}
}
