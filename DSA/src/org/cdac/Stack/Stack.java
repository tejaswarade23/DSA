package org.cdac.stack;

public interface Stack {
	void push(int element);
	int pop() throws Exception;
	boolean isEmpty();
	boolean isFull();
	int peek();
}
