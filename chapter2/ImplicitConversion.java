package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// 형변환(Casting)
		// 정수형 데이터 타입보다는 실수형 데이터 타입이 더 큰 개념
		// 묵시적 형변환 예제
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = 10.0f;
		
		double dNum;
		dNum = iNum2 + fNum;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		System.out.println(dNum);

	}

}
