package chapter13.stream;

import java.util.Arrays;

// 스트림: 배열 또는 컬렉션을 대상으로 하는 기술
public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum); // 15
		
		int sumVal = Arrays.stream(arr).sum();
		System.out.println(sumVal);
	}

}
