package chapter12.collection.map;



public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member mem1 = new Member(1001, "홍길동1");
		Member mem2 = new Member(1002, "홍길동2");
		Member mem3 = new Member(1003, "홍길동3");
		Member mem4 = new Member(1004, "홍길동4");
		
		memberHashMap.addMember(mem1);
		memberHashMap.addMember(mem2);
		memberHashMap.addMember(mem3);
		memberHashMap.addMember(mem4);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();

	}

}
