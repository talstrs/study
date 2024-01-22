package chapter14.exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5]; // 힙 영역에 int형 기억장소 5개 생성(20 byte)되고 주소 생성
		// arr[0] ~ arr[4] 힙 영역에 생성된 기억 장소를 가리키는 이름
		
		// 예외 처리: 실행시 예외 발생되면 강제적인 종료를 막고 실행이 정상적으로 종료하기 위한 문법
		
			try{
				for(int i=0; i<=5; i++) {
			
				System.out.println(arr[i]);
			}
		}catch(Exception e) {
	}
			System.out.println("테스트");

}
}