package chapter8.inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		// 부모 클래스 변수로 자식 객체를 대입
		// 타입 일치
		// Customer vc = (Customer) new VIPCustomer(10030, "나몰라", 2000);
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		
		
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) +"원입니다.");

	}

}
