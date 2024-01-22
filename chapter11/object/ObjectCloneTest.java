package chapter11.object;

class Point {
	int x;
	int y;
	
	public Point () {}
	
	public Point(int x,int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}

// 클래스명을 이용하여 객체 생성하고 해당 객체를 복사하고 싶을 경우
// 반드시 'Cloneable' 인터페이스를 상속받아야 함(문법 규칙)
class Circle implements Cloneable {
	Point point; // 참조 타입
	int radius; // 기본 데이터 타입
	
	public Circle(int x, int y, int radius) {
		super();
		point = new Point(x,y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 = " + radius + "입니다.";
	}

	// throws CloneNotSupportedException 예외 문법
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		
		// 참조 타입은 주소만 복사되며, 힙 영역에서의 기억 장소 공유(얕은 복사)
		// 기본 데이터 타입은 하나씩 복사되는 메모리에 각각 새로 생성
		Circle cloned = (Circle)super.clone();
		
		// 객체를 새로 생성(깊은 복사)
		// 밑에 내용이 없다면 위 내용만 가지고는 얕은 복사임
		cloned.point = new Point();
		
		return super.clone();
	}
	
	
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		
		// 객체 복사 작업
		Circle copyCircle = (Circle) circle.clone();
		
		System.out.println(circle); // 원본 객체
		System.out.println(copyCircle); // 사본 객체
		
		circle.point.x = 100;
		circle.point.y = 100;
		
		System.out.println(circle); // 원본 객체
		System.out.println(copyCircle); // 사본 객체

	}

}
