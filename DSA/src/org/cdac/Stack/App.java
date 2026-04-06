package org.cdac.stack;

public class App {
	public static void main(String[]args) {
		testPushSilentFail();
		
	}
	
	public static void testPushSilentFail() {
		Stack s1 = new FixedSizeStack(5);
		for(int i=0;i<100;i++) {
			s1.push(i);
		}
		
		while(!s1.isEmpty()) {
			try {
				System.out.println("Popped - "+s1.pop());
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
 