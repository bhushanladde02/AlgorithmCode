package testDS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q9_Answer {
   public static void main(String[] args) {
      
   // create an empty array list with an initial capacity
  List<Integer> arrlist = new ArrayList<Integer>(5);
   List<Integer> positions = new ArrayList<Integer>(5);

   // use add() method to add elements in the list
   arrlist.add(15);
   arrlist.add(22);
   arrlist.add(30);
   arrlist.add(40);
   
   //sort
   Collections.sort(arrlist);
   // let us print all the elements available in list
   
   //add the position to get the data
   
   positions.add(2);
   positions.add(1);
   
   
   arrlist=getSelected(arrlist,positions);
   
   for (Integer number : arrlist) {
   System.out.println("Number = " + number);
   } 
	
   
   // retrieves element at 4th postion
  	   
   }
   public static<E> List<E> getSelected(List<E> items,  List<Integer> positions){
	   
	   List<E> finalList = new ArrayList<E>();
	   for (Integer number : positions) {
		   finalList.add((E) items.get(number));
		   //System.out.println("Number = " + number);
		   } 
	   
	   return finalList;
   }
}   