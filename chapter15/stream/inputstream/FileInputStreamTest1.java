package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		// 데이터 소스: 파일
		FileInputStream fis = null;
		
		
		try {
			// input.txt 파일이 존재하지 않으면 예외 발생
			// fis = new FileInputStream("C:\\Dev\\workspace\\java_basic\\study\\bin\\chapter15\\stream\\inputstream\\input.txt"); 
			fis = new FileInputStream("input.txt");
			
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());			
			//System.out.println((char)fis.read());
			
			// fis 입력 스트림을 통하여 파일 데이터 읽기 작업
			

		} catch (IOException e) { // 예외 관련 클래스
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if( fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
