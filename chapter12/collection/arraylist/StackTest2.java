package chapter12.collection.arraylist;

import java.util.ArrayList;

// ArrayList로 Stack 성격 구현하기
class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비어있습니다");
			return null;
		}
		return(arrayStack.remove(len-1));
	}
	
	
}

public class StackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
