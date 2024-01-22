package chapter8.inheritance;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;

	public VIPCustomer()
	{
		// 컴파일 과정에서 super() 메서드가 생성된다
		// 부모 클래스 Customer의 생성자를 호출한다. 즉, Customer()와 동일
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	
		System.out.println("VIPCustomer() 생성자 호출");
	}

	public VIPCustomer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	public int getAgentID(){
		return agentID;
	}


}
