package chapter13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravlTest {

	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		
		// 고객 명단 출력
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		// 총 여행 비용. mapToInt(ToIntFunction) 객체 T를 int 값으로 매핑한다. int applyAsInt(T t)
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은: " + total + "입니다.");
		
		// 스트림에서 조건을 적용하고 싶으면
		// filter(Predicate)
		// boolean test(T t) 객체 T를 조사 후 boolean 값 반환
		System.out.println("== 20세 이상 고객 명단 출력 ==");
		customerList.stream().filter(c ->c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		

	}

}
