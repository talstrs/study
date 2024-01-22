package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// 명시적 형변환 예제
		// 변수 = (데이터 타입) 변수     타입 일치가 되게 함
		
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum3 = (int) (dNum1 + fNum2) ;
		int iNum4 = (int)dNum1 + (int)fNum2;
		
		System.out.println(iNum3);
		System.out.println(iNum4);

	}

}
