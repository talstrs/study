package chapter13.stream;

import java.util.jar.Attributes.Name;

public class TravelCustomer {
	
	private String name;
	private int age;
	private int price;

	
	// 3개의 피라미터를 이용한 생성자

	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
		
	}
	
	// 3개의 getter 메서드
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getPrice() {
		return price;
	}
	
	// toString() 재정의
	
	@Override
	public String toString() {
		
		return "이름은 : " + name + "나이는 : " + age + "가격은 :" + price;
	}
	

}


