package chapter6.thisex;

class Person {
	String name;
	int age;
	
	Person(){
		this("이름 없음", 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}


public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person no1 = new Person("김이름",14);
		System.out.println(no1.name);
		System.out.println(no1.age);

	}

}
