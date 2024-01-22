package chapter8.polymorphism;

class Animal {

	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}
	
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
	}
	
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}
	
}

public class AnimailTest1 {
	
	// main() 메서드는 클래스의 멤버가 아니라
	// JVM에 의하여 독립적으로 관리되는 실행 기능을 담당하는 메서드
	public static void main(String[] args) {
		AnimailTest1 aTest = new AnimailTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}