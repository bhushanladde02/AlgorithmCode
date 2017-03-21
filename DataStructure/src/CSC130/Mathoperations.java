//mean, median, mode, variance and standard deviation 
package CSC130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Mathoperations {

	public double calMean(Double inputArray[]){
		double sum=0;
		for(int i=0;i<inputArray.length;i++){
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

	public static void main(String[] args) {
		try{
			Mathoperations math=new Mathoperations();
			System.out.println("How many values you have to enter :");
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
			String input=br.readLine();
			Double inputArray[]=new Double[Integer.parseInt(input)];
			for(int i=0;i<Integer.parseInt(input);i++){
				System.out.println("Enter the "+(i+1)+"th value :");
				inputArray[i]=Double.parseDouble(br.readLine());
			}
			
			System.out.println("\n\nThe output as below :");
			
			System.out.println("Mean :"+math.calMean(inputArray));
			System.out.println("variance :"+math.getVariance(inputArray,math.calMean(inputArray)));
			System.out.println("Deviation :"+math.getDeviation(math.getVariance(inputArray,math.calMean(inputArray))));
			System.out.println("Median :"+math.getMedian(inputArray));
			System.out.println("Mode :");
			
			Double[] arr=math.getMode(inputArray);
			for(Double va : arr){
				System.out.println(va);
			}
			/*for(int j=0;j<a.length;j++){
				System.out.println(inputArray[j]);
			}*/
		}catch(IOException io){
			io.printStackTrace();
		}	
	}

}
