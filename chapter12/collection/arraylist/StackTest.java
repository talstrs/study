package chapter12.collection.arraylist;

import java.util.Stack;

// List 인터페이스 구현: Stack 클래스
public class StackTest {
	
	public static void main(String[] args) {
		

		Stack<String> stack = new Stack<String>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		int size = stack.size();
		
		// D C B A
		for(int i=0; i<size; i++) {
			System.out.println(stack.pop());
		}
	}
}
