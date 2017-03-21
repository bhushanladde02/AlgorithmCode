package CSC130;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Assignment3 {

	public static void main(String[] args) {
		Assignment3 assign3=new Assignment3();
		int tick=0, totalCustomerCount=0,maxCust=1000,removeFromQueue=0;
		Double custAvg[]=new Double[maxCust];
		@SuppressWarnings("unchecked")
		Queue<Customer1>[] cashiers =(Queue<Customer1>[]) new Queue[11];
		for(int i=0;i<cashiers.length;i++){
			cashiers[i]=new LinkedList<Customer1>();
		}
		while(removeFromQueue!=maxCust){
			//add the random customer
			int randomNumber=assign3.generateRandomNumber();
			//System.out.println("Random Number Generated : "+ randomNumber);
			if(randomNumber>20 && totalCustomerCount<maxCust){
				totalCustomerCount++;
				int randn=assign3.generateRandomNumber();
				if(randn<12){					
					cashiers[10].add(new Customer1(randn,0));
				}else{
				//if you want to check without express line then copy below line and put outside if else loop, after that remove this if else loop
				cashiers = assign3.arriveNewCustomer(new Customer1(randn,0),cashiers); 
				}
			//break;
			}
			for(int i=0;i<cashiers.length;i++){
				Customer1 cust=(Customer1)cashiers[i].peek();
				if(cust!=null){
					cust.items--;
					if(cust.items==0){
						cashiers[i].remove();
						
						//System.out.println(custAvg[i]);
						//System.out.println(" Removed Customer id : "+ cust.id +" from cashiers line : "+i);
						custAvg[removeFromQueue]=(double) (tick-cust.tick);
						removeFromQueue++;
						
						
					}
				}
				
			}
			tick++;
		}
		
		System.out.println("Summary as below :");
		System.out.println("Mean:   " + assign3.calMean(custAvg));
		System.out.println("Median: " + assign3.getMedian(custAvg));
		Double mode[]=assign3.getMode(custAvg);
		System.out.println("Mode:   ");
		for(int i=0;i<mode.length;i++){
			System.out.println(mode[i]);
		}
		
	}

	//Find Min waiting list by comparing each  cashier queue size.
	public Queue<Customer1>[] arriveNewCustomer(Customer1 cust,Queue<Customer1>[] cashiers){

		int findMin=Integer.MAX_VALUE;
		for(int i=0;i<10;i++){
			if(cashiers[i].size()<findMin){
				findMin=cashiers[i].size();
			}
		}

		for(int i=0;i<10;i++){
			if(cashiers[i].size()==findMin){
				//System.out.println("New customer is added to ith cashier row ::::"+i);
				cashiers[i].add(cust);
				break;
			}
		}
		return cashiers;

	}

	public int generateRandomNumber(){
		Random r = new Random();
		int Result = r.nextInt(100) + 1;
		return Result;
	}


	public double calMean(Double inputArray[]){
		double sum=0;
		for(int i=0;i<inputArray.length;i++){
			//System.out.println(inputArray[i]);
			sum=sum+inputArray[i];
		}
		return sum/inputArray.length;
	}

	public double getVariance(Double inputArray[],double  mean){
		Double variationArray[]=new Double[inputArray.length];
		double sum=0;
		double variance=0;
		for(int i=0;i<inputArray.length;i++){
			variationArray[i]=mean-inputArray[i];
		}
		for (int j=0;j<variationArray.length;j++){
			sum=(variationArray[j] * variationArray[j])+sum;
		}
		variance=sum/variationArray.length;
		return variance;
	}

	public Double getDeviation(double variance){
		Double devi=java.lang.Math.sqrt(variance);
		return devi;
	}

	public Double[] getMode(Double inputArray[]){
		Set list=new HashSet();
		int maximumValue=-99;
		//maximum repeated values in array - all same then no mode, if two or more are same length then two mode values are thr
		HashMap<Double,Integer> hash=new HashMap<Double,Integer>();
		for(int i=0;i<inputArray.length;i++){
			if(hash.containsKey(inputArray[i])){
				Integer fetchValue=(Integer)hash.get(inputArray[i]);
				fetchValue=fetchValue+1;
				hash.put(inputArray[i], fetchValue);
				if(maximumValue<fetchValue){
					maximumValue=fetchValue;
				}
			}else{
				hash.put(inputArray[i], 1);
			}
		}

		for(int i=0;i<inputArray.length;i++){
			Integer fetchValue=(Integer)hash.get(inputArray[i]);
			if(maximumValue==fetchValue){
				list.add(inputArray[i]);
			}
		}

		return Arrays.copyOf(list.toArray(), list.size(), Double[].class);   
	}
	public double getMedian(Double inputArray[]){
		//sort in acending order
		//get a middle value for odd length of an array and even number,In this case, the median is the mean (the usual average) of the middle two values:
		TreeSet<Double> tree=new TreeSet<Double>();
		for(double value:inputArray){
			tree.add(value);
		}
		Double sortedArray[]=Arrays.copyOf(tree.toArray(), tree.size(), Double[].class);
		int low=0;
		int high=sortedArray.length;
		int mid=0;
		double median=0;

		if((high % 2)==0){
			mid=(low+high)/2;	

			median=(inputArray[mid]+inputArray[mid-1])/2;

		}else{

			mid=(low+high+1)/2;	 
			median=inputArray[mid];
		}

		return median;	
	}
}
class Customer1{
	int id;
	int items;
	static int lastIdAss=1000;
	int tick;

	public Customer1(){

	}

	public Customer1(int item,int tick)  {
		this.items=item;
		lastIdAss=lastIdAss+1;
		this.id=lastIdAss;
		this.tick=tick;
	}

}