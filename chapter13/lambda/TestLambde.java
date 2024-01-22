package chapter13.lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambde {

	public static void main(String[] args) {
		// 함수형 인터페이스를 람다식 문법으로 구현
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Hello Lambda_1");
		
		showMyString(lambdaStr);
		
		PrintString reStr = returnString();
		reStr.showString("hello Lambda_3");
	}

	// 메서드의 매개변수로 함수형 인터페이스 변수 사용 예
	public static void showMyString(PrintString p) {
		p.showString("Hello Lambda_2");
	}
	
	// 메서드의 리턴 타입으로 함수형 인터페이스 사용 예
	public static PrintString returnString() {
		// 리턴 값이 PrintString 함수형 인터페이스의 추상 메서드를 람다식으로 구현한 내용
		return s -> System.out.println(s);
	}
}
