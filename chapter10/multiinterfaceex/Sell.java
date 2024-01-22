package chapter10.multiinterfaceex;

public interface Sell {
	
	void sell();
	
	default void order() {
		System.out.println("판매 주문");
	}

}
