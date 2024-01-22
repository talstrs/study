package chapter7.basic;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.a = 10;
		p1.b = 20;
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		
		
		Person p2 = p1; // 주소가 복사(대입)되기에 동일한 기억 장소를 참조하고 있음
		System.out.println(p2.a);
		System.out.println(p2.b);
		
		p2.a = 100;
		p2.b = 200;
		
		System.out.println(p1.a);
		System.out.println(p1.b);

	}

}
