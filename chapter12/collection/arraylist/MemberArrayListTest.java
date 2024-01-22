package chapter12.collection.arraylist;

import java.util.ArrayList;

import chapter12.collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Member> a1 = new ArrayList<Member>();
		
		// 데이터 추가. add()
		a1.add(new Member(1001, "이지원"));
		a1.add(new Member(1002, "손민국"));
		a1.add(new Member(1003, "박서훤"));
		a1.add(new Member(1004, "홍길동"));
		
		// 모든 데이터 읽기. get(인덱스)
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("------------------------");
		
		// 제거. remove(인덱스)
		a1.remove(2);
		
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}

	}

}
