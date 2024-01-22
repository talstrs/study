package chapter10.interfaceex;

public interface Calc {
	
	//상수. final compile시 public final static 자동 생성
	double PI = 3.14;
	int ERROR = -999999999;
	
	//추상메서드. compile시 public abstract 자동 생성
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	

}
