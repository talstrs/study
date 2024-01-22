package chapter2;

public class CharacterEx2 {

	public static void main(String[] args) {
		// char 데이터 타입 (2byte): 정수형, 문자 1개를 저장하는 기억 장소 생성
		// 1개의 문자를 표현하며 반드시 ' ' 안에 작성해야 함
		// 실제 기억 장소에는 코드(ascii code, uni-code) 값으로 저장
		
		char a2 = 65; // 문자로 사용, 아스키 코드
		// char b2 = -65; 해당 자료형의 범위가 아니기 때문에 오류 발생
		
		// int형 변수를 char 데이터 타입으로 형변환하여 사용하는 예제
		
		int a = 65;
		//int b = -65;
		
		// 데이터 타입 변환 = 형변환 = Castion
		// (데이터 타입) 변수
		System.out.println((char)a);
		System.out.println((char)a2);
		// System.out.println((char)b); 논리적인 에러 발생

	}

}
