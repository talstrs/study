package chapter7.array;

public class BookArray {

	public static void main(String[] args) {

		
		
		/* 객체가 생성되지 않은 상태에서는 사용 불가
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		*/
		
		
		// 배열 요소 5개로 객체 배열 생성
		// 스택 영역과 힙 영역에 정보 생성
		Book[] library = new Book[5];
		
		//힙 영역 데이터를 생성하는 기억 장소 new 생성자()
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생택쥐페리");
		
	
		for(int i=0; i <library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}

	}

}
