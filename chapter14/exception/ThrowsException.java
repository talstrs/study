package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 예외 전가(예외처리: 미루기)
public class ThrowsException {
	
	// 메서드
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		// 여러 예외가 발생한 경우 multi catch 사용
		// 가장 최상위 예외가 제일 마지막에 사용되어야 함
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
