package chapter10.scheduler;

public class SampleTest implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("예비 손님이 대기중입니다");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("예비 손님이 순서를 기다립니다");
	}
}
