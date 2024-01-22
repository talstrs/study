package chapter2;

public class integerVariable {

	public static void main(String[] args) {
		// ctrl + spacebar : 도움말
		
		// 정수 데이터 타입: byte(1) < short(2) < int(4) 기준 < long(8). 번외 char
		// 변수끼리 연산 발생시 변수 크기가 int형보다 작은 데이터 타입일 경우 int 데이터 타입으로 형변환
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal); // 변수가 int형으로 형변환되며 값을 읽어와 연산 작업 진행
		
		int num1 = 1234123412;
		long num2 = 12341234123l;
		
		System.out.println(num1 + num2);
	}

}
