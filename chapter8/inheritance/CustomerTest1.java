package chapter8.inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		// VIPCustomer 클래스와 상관 없이 Customer 클래스 생성자만 호출됨
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		// 자식 클래스인 VIPCustomer 클래스 생성자 호출시 부모 클래스의 동작법
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

	}

}
