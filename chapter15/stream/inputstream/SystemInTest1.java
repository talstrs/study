package chapter15.stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 입력 후 [Enter]를 누르세요");
		
		int i;
		
		try {
			i = System.in.read(); // 콘솔 응용 프로그램 개발
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
