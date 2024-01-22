package chapter6.thisex;

class BirthDay {
	
	int day;
	int month;
	int year;
	
	//year 필드를 위한 setter 메서드
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this); //this 출력 확인
	}
}

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2024);
		
		System.out.println(bDay);
		bDay.printThis();
	}

}
