package chapter12.collection.treeset;

import chapter12.collection.Member;

public class MemberTreeSetTest {


	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member mem1 = new Member(1001, "이지원");
		Member mem2 = new Member(1002, "손민국");
		Member mem3 = new Member(1003, "박서훤");
		Member mem4 = new Member(1004, "홍길동");
		
		memberTreeSet.addMember(mem1);
		memberTreeSet.addMember(mem2);
		memberTreeSet.addMember(mem3);
		memberTreeSet.addMember(mem4);
		
		memberTreeSet.showAllMember();
		
		System.out.println("------------- 동일한 학생 아이디 추가 후 ----------------");
		
		
		Member mem5 = new Member(1004, "홍길동");
		memberTreeSet.addMember(mem5);
		
		memberTreeSet.showAllMember();

	}

}

