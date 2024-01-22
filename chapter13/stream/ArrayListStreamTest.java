package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		// List 컬렉션
		List<String> sList = new ArrayList<String>();
		sList.add("손흥민");
		sList.add("김민재");
		sList.add("이강인");
		
		for(int i =0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}

		
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s + " "));

	}

}
