package com.davis.piersqure.doblyLinkedList;

public class DoubleLinkedList {
	
	private int size;
	private Node head;
	private Node tail;

	public DoubleLinkedList() {
		this.size = 0;
	}

	private class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

	}
	
	//Display Element
		public void display() {
			System.out.print("START -> ");
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.value+" -> ");
				temp = temp.next;
			}
			System.out.println("END");
			
		}
	
	//Insert Element First
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		 
		if(head !=null ) {
			head.prev= node;
		}
		head = node;	
		size = size+1;
	}
	
	//Insert Element last
	public void insertLast(int value) {
		
		Node temp = head;
		System.out.println("Head :"+head.value);
		if(head == null) {
			insertFirst(value);
			return;
		}
		
		for(int i = 1 ; i < size; i++ ) {
			temp = temp.next;
		}
		System.out.println("temp"+temp.value);
		Node node = new Node(value);
		node.prev = temp;
		temp.next = node;
		node.next = null;
		size++;
	}
	

}
