package testDS;
import java.util.*;


public class Assignment3 {

	public static void main(String[] args) {

		Random rand = new Random();
		// Create array of cashier queues
		Queue<Customer>[] cashiers = new Queue[10];
		// Array of customers who checked out all of their items
		int[] custProcessed = new int[1000];

		for (int i = 0; i < cashiers.length; i ++) {
			cashiers[i] = new LinkedList<Customer>();
		}

		Customer cust = new Customer();
		int tick = 0;
		int finishedCustomers = 0;
		int createdCustomers = 0;

		// For each cashier, remove the items from each customer
		while (finishedCustomers < custProcessed.length) {
			tick++;

			// There's an 80% chance that a new customer will be added to 
			int newCustomerProb = rand.nextInt(100) + 1;
			int shortestLine = 0;

			if (newCustomerProb > 20 && createdCustomers < custProcessed.length) {
				for (int i = 0; i < cashiers.length; i++) {
					if (!cashiers[i].isEmpty()) {
						if(cashiers[i].size() < cashiers[shortestLine].size()) {
							shortestLine = i;
						}
					} else {
						cashiers[i].add(new Customer(tick, rand.nextInt(100) + 1));
						createdCustomers++;
						break;
					}
				}
			}

			for(int i = 0; i < cashiers.length; i++) {
				// Initialize each cashier's queue
				Queue<Customer> q = cashiers[i];

				// If cashier still has customers in it, remove an item from the customer
				if(!q.isEmpty()) {
					cust = q.peek();
					// If the customer still has items, remove one item
					if (cust.items != 0) {
						cust.removeItem();
						// If the customer has no items left, remove them from the queue
						if (cust.items == 0) {
							cust.tickEnd = tick;
							custProcessed[finishedCustomers] = cust.tickEnd - cust.tickStart;
							System.out.println("Customer #" + cust.id + " has been removed from cashier #" + i);
							q.remove();
							finishedCustomers++;
						}
					} //end remove cust items	
				}
			}//end for loop

		}// end while loop
		System.out.println(tick);
		custSummary(custProcessed);
	} // End main

	public static void custSummary(int[] custList) {
		System.out.println("Mean:   " + mean(custList));
		System.out.println("Median: " + median(custList));
		System.out.println("Mode:   " + mode(custList));
	}


	// Loop through the given array, add the numbers, and return the sum
	public static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	// Return the mean (average) by dividing the sum by the length of the array
	public static int mean(int[] a) {
		int sum = sum(a);
		return sum / a.length;
	}

	// Sort the array then find, and return, the median (middle number of set)
	public static int median(int[] a) {
		Arrays.sort(a);
		int middle = a.length/2;

		// If the array is odd, return the middle
		if (a.length%2 == 1) {
			return a[middle];
			// Else, return the average of the two middle numbers
		} else {
			return (a[middle-1] + a[middle]) / 2;
		}
	}

	// Originally created an inefficient method, but then I scrapped it
	// and took a method from StackOverflow that utilizes HashMaps.
	public static int mode(int[] values) {
		HashMap<Integer,Integer> freqs = new HashMap<Integer,Integer>();

		for (int val : values) {
			Integer freq = freqs.get(val);
			freqs.put(val, (freq == null ? 1 : freq+1));
		}

		int mode = 0;
		int maxFreq = 0;

		for (Map.Entry<Integer,Integer> entry : freqs.entrySet()) {
			int freq = entry.getValue();
			if (freq > maxFreq) {
				maxFreq = freq;
				mode = entry.getKey();
			}
		}

		return mode;
	}	

	static class Customer {
		private int id;
		int items, tickStart, tickEnd;
		static int lastIdAssigned = 1000;

		public Customer() {
			this.id = ++lastIdAssigned;
			this.items = 10;
		}

		public Customer(int tickStart, int items) {
			this.id = ++lastIdAssigned;
			this.items = items;
			this.tickStart = tickStart;
		}


		public void removeItem() {
			--this.items;
		}

		public String toString() {
			return "Customer #" + this.id + ": " + this.items + " items";
		}
	}

}
