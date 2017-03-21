package Extraproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import CCI.Util;
//this algo is specially for floating point numbers
public class BucketSort {
	public static void bucketSort(double a[]){
		ArrayList<Double> arrayResult=new ArrayList<Double>();
		LinkedList<Double>[] array=new LinkedList[a.length];
		for(int i=0;i<a.length;i++){
			int index=(int) (a.length*a[i]);
			///System.out.println(index);
			if(array[index]==null){
				array[index]=new LinkedList<Double>();
				array[index].add(a[i]);
			}else{
				//System.out.println(a[i]);
				array[index].add(a[i]);
			}
		}
		//linkedList sorting logic need to write
		for(int j=0;j<array.length;j++){
			if(array[j]!=null)
			Collections.sort(array[j]);
		}
		for(int j=0;j<array.length;j++){
			if(array[j]!=null)
			for(Double f: array[j]){
				arrayResult.add(f);
				System.out.println(f);
			}
		}
			
	}
	
	public static void main(String[] args) {
		double[] a=Util.getDoubleArray();
		bucketSort(a);
		

	}
}
