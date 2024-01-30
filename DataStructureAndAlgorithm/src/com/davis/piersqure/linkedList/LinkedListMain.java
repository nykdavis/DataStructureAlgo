package com.davis.piersqure.linkedList;

public class LinkedListMain {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		//Insert Element into LinkedList
		list.insertFirst(10);
		list.insertFirst(8);
		list.insertFirst(6);
		list.insertFirst(4);
		list.insertFirst(2);
		
		//Display the LinkedList
		list.display();
		
		//Goin to insert at last
		System.out.println("\n\nGoin to insert at last.");
		list.insertLast(12);
		list.display();
		
		//Going to insert at 3rd position
		System.out.println("\n\nGoin to insert at a given position.");
		list.insertAtIndex(7, 3);
		list.display();
		
		//Going to delete the 1st Element
		System.out.println("\n\nGoing to delete 1st");
		System.out.println("Deleted element is :"+list.deleteFirst());
		list.display();
		
		//Going to delete last element
		System.out.println("\n\nGoing to delete the last element.");
		System.out.println("Deleted element is :"+list.deleteLast());
		list.display();
		
		//going to delete at mentioned position
		System.out.println("\n\nGoing to delete at given position");
		System.out.println("Deleted element is :"+list.deleteAtIndex(2));
		list.display();
	}

}
