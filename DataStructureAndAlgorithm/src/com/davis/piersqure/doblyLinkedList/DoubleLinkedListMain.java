package com.davis.piersqure.doblyLinkedList;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		
		DoubleLinkedList list = new DoubleLinkedList();
		//Insert Element into LinkedList
		list.insertFirst(10);
		list.insertFirst(8);
		list.insertFirst(6);
		list.insertFirst(4);
		list.insertFirst(2);
		
		//Display the LinkedList
		list.display();
		
		//Inser element at last
		System.out.println("\n\nGoing to insert the element at last");
		list.insertLast(12);
		list.display();

	}

}
