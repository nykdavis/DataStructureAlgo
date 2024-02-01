package com.davis.piersqure.stack;

public class CustomStack {

	protected int[] data;
	protected static final int DEFAULT_SIZE = 10;
	int ptr = -1;

	public CustomStack() {
		this.data = new int[DEFAULT_SIZE];
	}

	public CustomStack(int size) {
		this.data = new int[size];
	}

	public boolean push(int item) {
		if (isFull()) {
			System.out.println("Stack is full.");
			return false;
		}
		ptr++;
		data[ptr] = item;
		return true;
	}

	public int pop() throws StackException {
		if (isEmpty()) {
			throw new StackException("Stack is Empty");
		}
		int removed = data[ptr];
		ptr--;
		return removed;
	}

	public int peak() {
		return data[ptr];
	}

	protected boolean isFull() {
		return ptr == data.length - 1;
	}

	private boolean isEmpty() {
		return ptr == -1;
	}
}
