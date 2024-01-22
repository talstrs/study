package chapter7.array;


// 얕은 복사: 주소만 복사
// 요소의 값 변경시 모두가 영향을 받는 것
public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3]; // 객체 배열, 원본
		Book[] bookArray2 = new Book[3]; // 객체 배열, 사본
		
		// 힙 영역에 실제 데이터가 생성되는 기억 장소가 생성
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르멘 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		// 복사된 배열의 데이터를 출력
		for(int i=0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		// 원본 배열에 데이터 변경 작업
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		// 원본 배열 출력
		System.out.println("=== bookArray1 ===");
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		// 사본 배열 출력
		System.out.println("=== bookArray2 ===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}
}
