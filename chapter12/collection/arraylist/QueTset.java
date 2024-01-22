package chapter12.collection.arraylist;

import java.util.LinkedList;
import java.util.Queue;

public class QueTset {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// 데이터 추가
		queue.add(1);
		queue.add(2);
		
		// peek(): 데이터 읽어오기, 제거 x
		System.out.println(queue.peek());

		queue.add(3);
		
		System.out.println(queue.peek());
		
		queue.add(4);
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.toString());

	}

}
