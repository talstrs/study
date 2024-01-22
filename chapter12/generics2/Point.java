package chapter12.generics2;

public class Point<T, V> {
	
	T x;
	V y;
	
	public Point (T x, V y) {
		super();
		this.x =x;
		this.y =y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}

	
}
