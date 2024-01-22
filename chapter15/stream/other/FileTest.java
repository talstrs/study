package chapter15.stream.other;

import java.io.File;
import java.io.IOException;

// File 클래스: 운영체제에서 관리해 주는 파일이나 폴더 관련 기능을 제공하는 클래스
public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Dev\\workspace\\java_basic\\study\\src\\chapter15\\stream\\other\\newfile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile()); // file 객체가 참조하는 대상이 파일인지 체크(확인), true 파일, false 폴더
		System.out.println(file.isDirectory()); // file 객체가 참조하는 대상이 폴더인지 체크(확인), true 폴더, false 파일 
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete(); // 파일 삭제
	}

}
