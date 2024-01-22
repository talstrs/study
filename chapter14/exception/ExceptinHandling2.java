package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


// 컴파일러의 의해 예외가 처리되는 경우
// 메서드가 예외
public class ExceptinHandling2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			System.out.println("예외 여부와 상관없이 항상 수행");
		}
		System.out.println("프로그램 종료");
	}
}
