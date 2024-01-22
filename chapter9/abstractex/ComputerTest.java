package chapter9.abstractex;


public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer(); 추상 클래스가 존재하여 객체 생성 불가
		Computer c2 = new Desktop();
		//Computer c3 = new Notebook(); 추상 클래스가 존재하여 객체 생성 불가
		Computer c4 = new MyNotebook();

		System.out.println(c2);
		System.out.println(c4);

	}

}
