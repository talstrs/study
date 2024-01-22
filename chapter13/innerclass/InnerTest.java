package chapter13.innerclass;

// 내부 클래스

// 외부 클래스 정의
class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass; // 내부 클래스 선언
	
	
	// 생성자
	public OutClass() {
		inClass = new InClass(); // 내부 클래스 객체 생성
	}
	
	
	// 내부 클래스 정의
	// 1) 인스턴스 내부 클래스
	
	// -------------------------------------------------------
	class InClass {
		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// 외부 클래스 필드 접근
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수");
		}
		
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	// 2) static(정적) 내부 클래스
	static class InStaticClass {
		
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스를 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		
		System.out.println();
		
		// 1) 인스턴스 내부 클래스 객체 생성
		// 외부객체.new 내부생성자();
		// 외부클래스.내부클래스 변수 = 외부객체.new 내부생성자();
		OutClass.InClass inClass = outClass.new InClass();
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass.inTest();
		
		// 2) 정적 내부 클래스
		System.out.println("정적 내부 클래스의 스태특 메서드 호출");
		//외부클래스.정적클래스.멤버()
		OutClass.InStaticClass.sTest();
	}

}
