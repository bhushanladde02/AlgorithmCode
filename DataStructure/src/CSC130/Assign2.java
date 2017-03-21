package CSC130;

import java.util.LinkedList;
import java.util.Queue;

public class Assign2 {
	public static void main(String[] args) {
		int tick=0, totalcustomer=100;
		@SuppressWarnings("unchecked")
		Queue<Customer>[] cashiers =(Queue<Customer>[]) new Queue[10];
		for(int i=0;i<cashiers.length;i++){
			cashiers[i]=new LinkedList<Customer>();
			for(int o=0;o<10;o++){
				cashiers[i].add(new Customer(10));
			}
		}

		while(totalcustomer!=0){
			for(int j=0;j<cashiers.length;j++){
				Customer cust=(Customer)cashiers[j].peek();
				cust.items--;
				if(cust.items==0){
					cashiers[j].remove();
					System.out.println("Customer id : "+ cust.id + " items : "+ cust.items);
					totalcustomer--;
				}
				tick++;
			}
			totalcustomer--;
		}
	}
}
class Customer{
	int id;
	int items;
	static int lastIdAss=1000;

	public Customer(){

	}

	public Customer(int item)  {
		this.items=item;
		lastIdAss=lastIdAss+1;
		this.id=lastIdAss;
	}

}

