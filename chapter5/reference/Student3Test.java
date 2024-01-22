package chapter5.reference;

public class Student3Test {

	public static void main(String[] args) {
		Student3 stu = new Student3();
		stu.korean.subjectName = "국어";
		stu.korean.scorePoint = 90;
		
		System.out.println(stu.korean.subjectName);
		System.out.println(stu.korean.scorePoint);
	}

}
