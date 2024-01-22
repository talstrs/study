package chapter13.lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		// 1)StringConCat 인터페이스를 구현한 클래스 객체 생성
		StringConcatImpl stringConcatImpl = new StringConcatImpl();
		stringConcatImpl.makeString(s1, s2);
		
		int i = 100;
		
		// 2) 함수형 인터페이스이므로 람다 문법 적용하여 사용
		// 함수형인터페이스 변수 = 람다식;
		StringConcat concat2 = (s,v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
		i = 300;
		
		// 익명 구현 객체: 파일(클래스) 안에서 일회성 사용시 사용
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println( s1 + "," + s2);
				
			}
		};
		
		// 익명 구현 객체 사용
		concat3.makeString(s1, s2);
	}

}
