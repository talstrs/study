package chapter12.collection.linkedlist;

import java.util.LinkedList;

// List 인터페이스를 구현한 LinkedList 클래스
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		myList.add(1, "D"); // 인덱스 1의 위치에 데이터 삽입
		
		System.out.println(myList);
		myList.addFirst("O"); // 제일 앞(인덱스 0)에 데이터 삽입
		
		System.out.println(myList);
		System.out.println(myList.removeLast()); // 맨 마지막 데이터 삭제 후 반환
		
		System.out.println(myList);
	}

}
