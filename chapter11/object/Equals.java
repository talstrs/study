package chapter11.object;

import java.util.Objects;

class Student {
	int studentID;
	String studentName;
	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentID, studentName);
	}

	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(studentID == std.studentID)
				return true;
			else
				return false;
		}
		return false;
	}
	
	
	
}

public class Equals {
// 객체가 동일한 데이터를 가지고 있다면 equals()와 hashCode()를 사용하여 재정의 해야 함	
	public static void main(String[] args) {
		Student st1 = new Student(100,"손흥민");
		Student st2 = st1; // 힙 영역의 주소 대입(주소 복사)
		Student st3 = new Student(100,"손흥민");
		
		if(st1 == st2) {
			System.out.println("st1과 st1은 같습니다");
		} else {
			System.out.println("st1과 st1은 같지 않습니다");
		}
		
		if(st1.equals(st2)) {
			System.out.println("st1과 st1은 같습니다");
		} else {
			System.out.println("st1과 st1은 같지 않습니다");
		}
		
		if(st1 == st3) {
			System.out.println("st1과 st3은 같습니다");
		} else {
			System.out.println("st1과 st3은 같지 않습니다");
		}
		
		if(st1.equals(st3)) {
			System.out.println("st1과 st3은 같습니다");
		} else {
			System.out.println("st1과 st3은 같지 않습니다");
		}
	}

}
