package testDS;

import java.util.PriorityQueue;

public class MeargeKsorted {

	
		public static void main(String[] args) {
			PriorityQueue<Integer> minPriorityQueue = new PriorityQueue<Integer>();
			
			minPriorityQueue.add(20); //log n
			minPriorityQueue.add(10);
			minPriorityQueue.add(30);
			
			System.out.println(minPriorityQueue.peek()); //O(1)s
		}
}
