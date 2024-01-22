package chapter5.constructor;

public class PersonTest {

	public static void main(String[] args) {
		// 클래스 사용 방법
		// 클래스명 변수 = new 생성자();
		
		Person p1 = new Person(); // 객체 생성 구문
		
		// 힙 영역에 생성된 기억 장소의 초기값을 확인
		System.out.println(p1.name);
		System.out.println(p1.height);
		System.out.println(p1.weight);
		
		Person p2 = new Person("홍길동");
		
		System.out.println(p2.name);
		System.out.println(p2.height);
		System.out.println(p2.weight);
		
		Person p3 = new Person("이순신",80,75);
		
		System.out.println(p3.name);
		System.out.println(p3.height);
		System.out.println(p3.weight);
		

	}

}
