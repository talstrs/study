package chapter12.generics2;

public class GenericMethod {

	// 제너릭 기능이 적용된 메서드
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	public static void main(String[] args) {
		// Wraaper 클래스: 기본 데이터 타입을 객체로 사용하기 위한 기능 제공을 지원하는 클래스(8개)
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);

	}

}