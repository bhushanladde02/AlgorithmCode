package CCI;

public class Threeinone_3_1 {
	//divide the array into three parts
	//in this case main size of total array is always even number
	int stackCapacity=0;
	int mainArray[];
	int sizes[];
	public void declareArrays(int totalNumberOfStack, int sizeOfEachStack){
		mainArray=new int[totalNumberOfStack*sizeOfEachStack];
		sizes=new int[totalNumberOfStack+1];
		for(int i=0;i<totalNumberOfStack+1;i++){
			sizes[i]=sizeOfEachStack;
		}
	}
	/*public int getTopIndex(int stackNumber){
		int size=sizes[stackNumber];
		return size;
	}*/
	public void adjustSizes(int stackNumber, String operation){
		if(operation.equals("push")){
			sizes[stackNumber]--;
		}else{ 
			sizes[stackNumber]++;
		}
	}
	public void push(int actualSizeOfEachStack, int stackNumber, int valueToBePush){
		/*int remainSize=calculateOffset(actualSizeOfEachStack,stackNumber);
		if(remainSize==0){
			System.out.println("Stack Is full");
		}else{*/
		int actualIndexInMainArray=(actualSizeOfEachStack*stackNumber)-sizes[stackNumber];
		mainArray[actualIndexInMainArray]=valueToBePush;
		adjustSizes(stackNumber,"push");
		//}
	}
	public int pop(int actualSizeOfEachStack, int stackNumber){
		int remainSize=calculateOffset(actualSizeOfEachStack,stackNumber);
		//System.out.println("remainSize:::"+remainSize);
		int popValue=0;
		if(remainSize==-1){
			System.out.println("Stack is empty : " + stackNumber);
		}else{
			popValue=mainArray[remainSize];
			mainArray[remainSize]=0;
			adjustSizes(stackNumber,"pop");
		}
		return popValue;
	}
	public int peek(int actualSizeOfEachStack, int stackNumber){
		int remainSize=calculateOffset(actualSizeOfEachStack,stackNumber);
		int popValue=0;
		if(remainSize==-1){
			System.out.println("Stack is empty : "+stackNumber);
		}else{
			popValue=mainArray[remainSize];
		}
		return popValue;
	}

	public int calculateOffset(int actualSizeOfEachStack, int stackNumber){
		if(actualSizeOfEachStack!=sizes[stackNumber]){
		int offset=(actualSizeOfEachStack*stackNumber)-sizes[stackNumber]-1;
		//System.out.println("Offsets:::"+offset);
		return offset;
		}else{
			return -1;
		}
	}

	public static void main(String[] args) {
		int totalNumberOfStacks=3;//1,2,3
		int actualSizeOfEachStack=4;
		Threeinone_3_1 threein=new Threeinone_3_1();

		threein.declareArrays(totalNumberOfStacks,actualSizeOfEachStack);

		threein.push(actualSizeOfEachStack, 1, 1);
		threein.push(actualSizeOfEachStack, 1, 2);
		threein.push(actualSizeOfEachStack, 1, 3);
		threein.push(actualSizeOfEachStack, 1, 4);

		threein.push(actualSizeOfEachStack, 2, 5);
		threein.push(actualSizeOfEachStack, 2, 6);
		threein.push(actualSizeOfEachStack, 2, 7);
		threein.push(actualSizeOfEachStack, 2, 8);

		threein.push(actualSizeOfEachStack, 3, 9);
		threein.push(actualSizeOfEachStack, 3, 10);
		threein.push(actualSizeOfEachStack, 3, 11);
		threein.push(actualSizeOfEachStack, 3, 12);

		//int value=threein.pop(actualSizeOfEachStack,1);
		//System.out.println(value);
		
		int value1=threein.pop(actualSizeOfEachStack,3);
		System.out.println(value1);
		
		int value2=threein.pop(actualSizeOfEachStack,3);
		System.out.println(value2);
		
		int value3=threein.pop(actualSizeOfEachStack,3);
		System.out.println(value3);
		
		int value4=threein.pop(actualSizeOfEachStack,3);
		System.out.println(value4);
		
		int value5=threein.pop(actualSizeOfEachStack,3);
		
		int value6=threein.peek(actualSizeOfEachStack,3);
		/*
		int value6=threein.pop(actualSizeOfEachStack,3);
		System.out.println(value6);*/
		
		//pop(int actualSizeOfEachStack, int stackNumber);
		//peek(int actualSizeOfEachStack, int stackNumber);
		//0 to n/3 - stack1
		//n/3 to 2n/3 - stack2
		//2n/3 to n - stack3
	}
}
