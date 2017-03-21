package testDS;
import java.util.LinkedList;
import java.util.Queue;


public class Assignment2_part1 {

	public static void main(String[] args) {
		
		// Create array of cashier queues
		Queue<Customer>[] cashiersQueue = new Queue[10];
		
		for(int i = 0; i < cashiersQueue.length; i++) {
			cashiersQueue[i] = new LinkedList<Customer>();
			for (int j = 0; j < 10; j++) {
				cashiersQueue[i].add(new Customer());
			}
		}

		Customer customer = new Customer();
		int tick = 0;
		int totalCust = 100;
		
		while (totalCust != 0) {
			for(int i = 0; i < cashiersQueue.length; i++) {
				Queue<Customer> q = cashiersQueue[i];
				if(!q.isEmpty()) {
					customer = q.peek();
					if (customer.items != 0) {
						System.out.println(customer.toString());
						customer.removeItem();
						if (customer.items == 0) {
							q.remove();
							System.out.println("Customer #" + customer.id + " has been removed from cashier queue #" + i);
							totalCust--;
						}
					} //end remove cust items	
				}
			}//end for loop
			tick++;

		}// end while loop
	} // End main
	
	static class Customer {
		private int id;
		int items;
		static int lastIdAssigned = 1000;
		
		public Customer() {
			this.id = ++lastIdAssigned;
			this.items = 10;
		}
		
		public Customer(int items) {
			this.id = ++lastIdAssigned;
			this.items = items;
		}
		
		
		public void removeItem() {
			--this.items;
		}
		
		public String toString() {
			return "Customer #" + this.id + ": " + this.items + " items";
		}
	}
	
}
