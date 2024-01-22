package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


// 컴파일러의 의해 예외가 처리되는 경우
// 메서드가 예외
public class ExceptinHandling1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 정보 출력 기능
		}
		System.out.println("프로그램 종료");
	}
}
