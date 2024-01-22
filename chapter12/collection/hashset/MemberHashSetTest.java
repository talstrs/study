package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member mem1 = new Member(1001, "이지원");
		Member mem2 = new Member(1003, "손민국");
		Member mem3 = new Member(1002, "박서훤");
		Member mem4 = new Member(1004, "홍길동");
		
		memberHashSet.addMember(mem1);
		memberHashSet.addMember(mem2);
		memberHashSet.addMember(mem3);
		memberHashSet.addMember(mem4);
		
		memberHashSet.showAllMember();
		
		System.out.println("------------- 동일한 학생 아이디 추가 후 ----------------");
		
		
		Member mem5 = new Member(1004, "홍길동");
		memberHashSet.addMember(mem5);
		
		memberHashSet.showAllMember();

	}

}

