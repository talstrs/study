package chapter12.collection.treeset;

// 객체를 정렬할 경우 implements Comparable<Member> 사용 필요
public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId +"입니다.";
	}

	@Override
	public int compareTo(Member member) {
		// 기존 학번 - 신규 추가 학번 차이를 1, 0, -1 결과값으로 하여 객체 정렬
		return (this.memberId - member.memberId); // 1, 0, -1 오름차순
		// return (this.memberId - member.memberId) *(-1); // -1, 0, 1 내림차순
	} 
	
	


}
