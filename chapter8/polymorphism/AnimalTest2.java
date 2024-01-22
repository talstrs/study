package chapter8.polymorphism;

public class AnimalTest2 {

	public static void main(String[] args) {
	
		// 필드 다형성 예제
		Animal animal = new Human();
		animal.move();
		
		animal = new Tiger();
		animal.move();
		
		animal = new Eagle();
		animal.move();

	}

}
