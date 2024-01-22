package chapter14.exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObj obj = new AutoCloseObj();
		// obj.close();
		// AutoCloseable 인터페이스를 구현한 클래스 사용
		try(AutoCloseObj obj2 = obj) {
			throw new Exception(); // 실행시 예외가 발행된 효과
			
		} catch (Exception e) {
			System.out.println("예외 부분입니다.");
			
		}

	}

}
