package chapter11.object;
//toString() 메서드를 정의한 예제
class Book {
	int bookNumber;
	String bookTitle;
	
	//생성자
	public Book(int bookNumber, String bookTitle) {
		// 작성하지 않아도 컴파일 작업시 자동 생성되며 상위 클래스를 호출하는 용도
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	//Object 클래스의 toString() 메서드를 재정의

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookTitle + "," + bookNumber;
	}
	
}

public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");
		

		// toString() 메서드로 재정의하지 않으면 Object 클래스에서 기본 제공하는 toString() 메서드 호출
		//chapter11.object.Book@6ec8211c
		// toString() 메서드로 재정의하면 메서드 재정의 값으로 출력된다
		System.out.println(book1);
	}

}
