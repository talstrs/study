package chapter14.exception;

// 사용자 정의 예외 클래스 만들기
// 회사의 업무 기능 구현시 업무처리에 따른 다양한 예외 존재
// 그에 따른 업무 관련 기능이 동작하다 예외 발생시 처리 목적으로 사용하는 예외 클래스
// ex) 사용자의 아이디 정보가 존재하지 않을 때(null) 또는 아이디 길이가 범위 밖이었을 때 등

public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			// 사용자 정의 예외 클래스
			throw new IDFormatException("아이디는 null일 수 없습니다");
		} else if(userID.length() < 8 || userID.length() > 20 ) {
			// 사용자 정의 예외 클래스
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용 가능합니다");
		}
		
		this.userID = userID;

	}
	
	public static void main(String[] args) {
		
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
