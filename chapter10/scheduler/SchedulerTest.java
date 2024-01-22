package chapter10.scheduler;

import java.io.IOException;

public class SchedulerTest {
	
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요");
		System.out.println("R: 한명씩 차례대로 할당");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P: 우선순위가 높은 고객에게 먼저 할당");
		System.out.println("S: 예비 손님 메시지");
		
		int ch = System.in.read(); // 키보드를 통하여 키를 입력받는 기능 제공
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}else if(ch == 'S' || ch == 's') {
			scheduler = new SampleTest();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
