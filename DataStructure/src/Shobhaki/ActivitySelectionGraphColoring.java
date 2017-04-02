//complete tomorrow
package Shobhaki;

import java.util.LinkedList;

class Event{
	String assign;
}

class Activity{
	Room room;
}

class Room{
	Activity activity;
	String used;
}

public class ActivitySelectionGraphColoring{

	public static void main(String[] args) {
		LinkedList<Room> freeList=new LinkedList<Room>();
		Room room1=new Room();
		Room room2=new Room();
		Room room3=new Room();
		Room room4=new Room();
		freeList.add(room1);
		freeList.add(room2);
		freeList.add(room3);
		freeList.add(room4);
	}	
}
