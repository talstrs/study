package chapter12.collection.treeset;

import java.util.TreeSet;

// Set 인터페이스를 구현한 TreeSet 클래스
// 기본 데이터에 대하여 이진트리 구조 관리로 정렬 지원
// 
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("이순신");
		treeSet.add("강감찬");
		
		for(String str : treeSet) {
			System.out.println(str);
		}

	}

}
