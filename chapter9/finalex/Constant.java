package chapter9.finalex;

public class Constant {
	int num = 10;
	final int NUM = 100;
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50; // 변수는 새로운 값으로 변경 가능
		// cons.num = 200; 상수는 값 변경 불가
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}

}
