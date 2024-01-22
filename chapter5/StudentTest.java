package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		// 
		
		Student stu1 = new Student();
		
		stu1.studentName = "홍길동";
		stu1.studentID = 1;
		stu1.grade = 1;
		stu1.address = "노원구";
		
		String name1 = stu1.getStudentName();
		
		Student stu2; // 스텍 영역에 메모리 생성. 기본값 null(참조하는 것이 없다)
		stu2 = new Student();
		
		stu2.studentID = 2;
		stu2.studentName = "이순신";
		stu2.grade = 3;
		stu2.address = "전라도";
		
		String name2 = stu2.getStudentName();
		
		System.out.println(name1);
		System.out.println(name2);
		
		// stu1, stu2 힙 영역에 생선된 주소를 참조하는 값
		System.out.println(stu1);
		System.out.println(stu2);

	}

}
