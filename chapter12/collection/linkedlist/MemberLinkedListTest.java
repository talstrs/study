package chapter12.collection.linkedlist;

import chapter12.collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {

		MemberLinkedList memberArrayList = new MemberLinkedList();
		
		Member memberLee = new Member(1001, "홍길동");
		Member memberSon = new Member(1002, "김유신");
		Member memberPark = new Member(1003, "강감찬");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember();
	}

}
