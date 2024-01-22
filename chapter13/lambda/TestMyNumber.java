package chapter13.lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		MyNumber max = (x, y) -> (x >= y) ? x: y;
		// 추상 메서드 한 개일 때 가능
		System.out.println(max.getMax(10, 20));

	}

}
