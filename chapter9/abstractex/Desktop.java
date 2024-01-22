package chapter9.abstractex;

public class Desktop extends Computer {
	
	@Override
	public void dispaly() {
	
		System.out.println("Desktop display()");
	}
	
	@Override
	public void typing() {
		System.out.println("Desktop typing()");		
	}

}
