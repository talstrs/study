package chapter12.collection.map;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("1", "홍길동1");
		map.put("2", "홍길동2");
		map.put("3", "홍길동3");
		map.put("4", "홍길동4");
		map.put("5", "홍길동5");
		
		map.put("2", "홍길동4");
		
		
		System.out.println(map);

	}

}
