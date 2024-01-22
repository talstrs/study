package chapter12.collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberTreeSet {
	
	private TreeSet<Member> treeSet; 
	
	public MemberTreeSet() {
		// super();
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		// 삭제 방법 1: for문을 이용한 방식

		
		// 삭제 방법 2: Iterator(반복자)를 이용한 방식
		// Iterator(반복자)를 사용하여 데이터 읽어오기 
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) { // 커서(포인트)가 가리키는 위치에 데이터가 존재할시 true, 데이터의 유무 체크
			Member member = ir.next(); // 커서(포인트)가 가리키는 위치의 데이터 반환
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member); // 멤버를 객체로 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember() {
		// 향상된 for문
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
