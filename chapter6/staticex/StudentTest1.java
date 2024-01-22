package chapter6.staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student sty1 = new Student();
		sty1.setStudentName("손흥민");
		System.out.println("Student.serialNum: " + Student.serialNum);
		Student.serialNum++;
		sty1.count++;
		
		Student sty2 = new Student();
		sty2.setStudentName("이강인");
		System.out.println("Student.serialNum: " + Student.serialNum);
		Student.serialNum++;
		sty2.count++;
		
		//스태틱 메서드 안에서는 객체 생성이 될지 안될지 판단 불가하여 인스터스 메서드 또는 필드를 사용하지 못하도록 문법으로 설계함
		Student sty3 = new Student();
		sty3.setStudentName("김민재");
		System.out.println("Student.serialNum: " + Student.serialNum);
		Student.serialNum++;
		sty3.count++;
		
		Student sty4 = new Student();
		sty4.setStudentName("황희찬");
		System.out.println("Student.serialNum: " + Student.serialNum);
		sty4.count++;

	}

}
