package chapter8.Casting;

class Shape {
	public void draw() {
		System.out.println("drawing start");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("draw Circle");
	}
	
	void circle() {
		System.out.println("원형입니다.");
	}
	
}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("draw Square");
	}
	
	void square() {
		System.out.println("사각형입니다.");
	}
	
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("draw Triangle");
	}
	
	void triangle() {
		System.out.println("삼각형입니다.");
	}
	
}

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape shape1 = new Circle();
		if(shape1 instanceof Circle) { // shape1 변수가 Circle 클래스
			// 부모 클래스 객체로 자식 클래스 객체에 대입: 다운캐스팅
			Circle c = (Circle) shape1;
			c.circle();
			
			Circle c2 = new Circle();
			c2.circle();
		}

	}

}
