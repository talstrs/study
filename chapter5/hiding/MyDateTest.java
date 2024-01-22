package chapter5.hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.month = 1;
		date.day = 12;
		date.year = 2024;
		
		System.out.println(date.month);
		System.out.println(date.day);
		System.out.println(date.year);

	}

}
