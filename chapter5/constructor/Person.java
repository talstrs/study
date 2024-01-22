package chapter5.constructor;

// 개인정보를 관리하는 클래스
// Person 클래스가 컴파일되면 기본 생성자가 자동 생성된다
// Person 클래스 이름으로 만들어진 Person()

public class Person {
	
	String name;
	float height;
	float weight;
	
	// 컴파일 과정에서 자동으로 생성되는 기본 생성자
	// 힙 영역에 생성된 기억 장소를 기본 세팅
	public Person() {} // 생성자는 리턴 타입이 없으며 메서드에 해당된다
	
	// 생성자 정의
	// 생성자 추가시 컴파일 과정에서 기본 생성자는 자동 생성되지 않는다
	// 따라서 기본 생성자 사용하기 위해서는 수동으로 기본 생성자를 생성해야 한다(규칙)
	public Person(String pname) { name = pname; }
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
