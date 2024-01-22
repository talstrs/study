package chapter12.collection.hashset;

import java.util.HashSet;

public class HastSetTest {
	
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("홍길동1"));
		hashSet.add(new String("홍길동2"));
		hashSet.add(new String("홍길동3"));
		hashSet.add(new String("홍길동4"));
		hashSet.add(new String("홍길동5"));
		hashSet.add(new String("홍길동5"));
		
		System.out.println(hashSet);
		
	}

}
