package chapter15.stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTestex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		
		try(fos) {
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i=0; i< bs.length; i++) {
				bs[i] = data;
				data++;
			}
			
			//파일에 출력 작업
			fos.write(bs); // A~Z, 인덱스 3번째부터 10개
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("출력 완료");
	}

}
