package CCI;

import java.util.LinkedList;

public class SumList2_5 {
	public int listLength(Node listPointer){
		int count=1;
		while(listPointer!=null){
			count++;
			listPointer=listPointer.node;
		}
		return count;
	}
	public LinkedList<Integer> addNumbrs(Node list1, Node list2,int carry,LinkedList<Integer> resultList){
		int val1=0,val2=0,carry1=0,separatedDigit=0;
		if(list1!=null){
			val1=list1.value;
			list1=list1.node;
		}
		if(list2!=null){
			val2=list2.value;
			list2=list2.node;	
		}
		int sumva=val1+val2;
		if(carry!=0){
			sumva=sumva+carry;
		}
		if(sumva>=10){
			carry1=sumva/10;
			separatedDigit=sumva%10;
		}
		else{
			separatedDigit=sumva;
		}
		resultList.add(separatedDigit);
		if(list1!=null && list2!=null){
			resultList=addNumbrs(list1,list2,carry1,resultList);
		}
		return 	resultList;
	}
	public static void main(String[] args) {
		SumList2_5 sum=new SumList2_5();
		LinkedList<Integer> resultList=new LinkedList<Integer>();
		Node list1=new Node(7,new Node(1,new Node(6,null)));
		Node list2=new Node(5,new Node(9,null));
		int length1=sum.listLength(list1);
		int length2=sum.listLength(list2);
		System.out.println(" length1: "+ length1 +" length2: "+ length2);
		if(length1!=length2){
			if(length1<length2){
				Node firstTemp=list1;
				while(firstTemp!=null){
					firstTemp=firstTemp.node;
				}
				for(int i=0;i<length2-length1;i++){
					firstTemp=new Node(0,null);
					firstTemp=firstTemp.node;
				}
				//list1=firstTemp;
			}else{
				System.out.println("I am in else loop");
				Node secondTemp=list2;
				while(secondTemp!=null){
					secondTemp=secondTemp.node;
				}
				System.out.println(secondTemp);
				for(int i=0;i<length1-length2;i++){
					//System.out.println("I am in for loop");
					secondTemp=new Node(0,null);
					secondTemp=secondTemp.node;
				}
				//list2=secondTemp;
				//length2=sum.listLength(list2);
				//System.out.println(" length2: "+ length2);
			}
		} 
		length1=sum.listLength(list1);
		length2=sum.listLength(list2);
		System.out.println("length1: "+length1 +" length2: "+ length2);

		resultList=sum.addNumbrs(list1,list2,0,resultList);
		for(int I : resultList){
			System.out.println(I);
		}
	}
}
