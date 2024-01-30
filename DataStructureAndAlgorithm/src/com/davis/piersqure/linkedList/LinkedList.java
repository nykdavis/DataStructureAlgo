package com.davis.piersqure.linkedList;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		this.size = 0;
	}

	// Node class with int value and Node next dat member
	// Also No Arg and All Arg constructor
	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}

	// Display Element
	public void display() {

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ->");
			temp = temp.next;
		}
		System.out.print("END");
	}

	// Insert 1st element
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}
		size = size + 1;
	}

	// insert into last position
	public void insertLast(int value) {
		// If the node is empty
		if (tail == null) {
			insertFirst(value);
			return;
		}

		Node node = new Node(value);
		tail.next = node;
		node.next = null;
		size = size + 1;
	}

	// insert the value at particular index
	public void insertAtIndex(int value, int position) {
		// 0 position
		if (position == 0) {
			insertFirst(value);
			return;
		}
		// last position
		if (position == size) {
			insertLast(value);
			return;
		}

		Node temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;
		}

		Node node = new Node(value, temp.next);
		temp.next = node;
		size++;
	}

	// Delete First
	public int deleteFirst() {
		int value = head.value;
		head = head.next;

		if (head == null) {
			tail = null;
		}
		size--;
		return value;
	}

	// Delete Last
	public int deleteLast() {
		int value = tail.value;
		Node temp = head;
		for (int i = 1; i < size - 1; i++) {
			temp = temp.next;
		}

		tail = temp;
		tail.next = null;
		size--;
		return value;
	}
	
	//Delete the Element at the particular Position
	public int deleteAtIndex(int position) {
		
		if(position == 0) {
			return deleteFirst();
		}
		
		if(position == size) {
			return deleteLast();
		}
		
		Node temp = head;
		for(int i = 0; i < position-1; i++) {
			temp = temp.next;
		}
		
		int value = temp.next.value;
		temp.next = temp.next.next;
		return value;
		
	}

}
