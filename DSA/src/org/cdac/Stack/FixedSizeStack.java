package org.cdac.stack;

public class FixedSizeStack implements Stack{
	private int top;
	private int[] stackData;
	
	public FixedSizeStack(int n) {
		stackData = new int[n];
		top = -1;
	}
	
	private void resize() {
		int arr[] = new int[stackData.length*2];
		for(int i=0;i<stackData.length;i++) {
			arr[i] = stackData[i];
		}
		stackData = arr;
	}
	
	@Override
	public void push(int element) {
		if(isFull()) {
			resize();
		}
		top = top+1;
		stackData[top] = element;
		
	}

	@Override
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("stack is empty...");
		}
		int result = stackData[top];
		top = top-1;
		return result;
	}

	@Override
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(top == stackData.length-1) {
			return true;
		}
		return false;
	}
	
	@Override
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return stackData[top];
	}
}
