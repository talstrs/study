package chapter6.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		student studentJames = new student("James", 5000);
		student studentTomas = new student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		
	}

}
