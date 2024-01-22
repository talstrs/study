package chapter5.hiding;

public class Student {

	// 필드 선언
	// 문법: 접근자 데이터타입 변수이름;
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	// private 필드를 사용하기 위하여 메서드 선언 필요
	// private 필드 기억 장소를 읽기 위한 용도, getter메서드
	public String getStudentName() {
		return studentName;
	}
	
	// private 필드 기억 장소에 저장 용도. setter 메서드
	
	public void setStudentName(String studentName) {
		// 로직 예> studentName 변수의 값은 한글만 허용
		this.studentName = studentName;
	}
		


}
