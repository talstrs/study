package chapter12.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		// super();
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		// 삭제 방법 1: for문을 이용한 방식
		for(int i=0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		
		// 삭제 방법 2: Iterator(반복자)를 이용한 방식
		// Iterator(반복자)를 사용하여 데이터 읽어오기 
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) { // 커서(포인트)가 가리키는 위치에 데이터가 존재할시 true, 데이터의 유무 체크
			Member member = ir.next(); // 커서(포인트)가 가리키는 위치의 데이터 반환
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(member); // 멤버를 객체로 삭제
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		// 향상된 for문
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
