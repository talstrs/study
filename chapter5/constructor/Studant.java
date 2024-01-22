package chapter5.constructor;

public class Studant {
	
	int studentID;
	String name;
	int age;
	String addr;
	
	
	//생성자 오버로딩
	//기본생성자
	public Studant() {}
	
	//생성자. "홍길동"
	public Studant(String pname) {
		name = pname;
	}
	
	//생성자, "홍길동", "노원구"
	public Studant(String pname,String paddr) {
		name = pname;
		addr = paddr;
	}
	
	public class StudantTest {
		public static void main(String[] args) {
			Studant t1 = new Studant();
			System.out.println(t1.addr);
			System.out.println(t1.age);
			System.out.println(t1.name);
			System.out.println(t1.studentID);
			
			Studant t2 = new Studant("홍길동");
			System.out.println(t2.addr);
			System.out.println(t2.age);
			System.out.println(t2.name);
			System.out.println(t2.studentID);
			
			Studant t3 = new Studant("홍길동", "노원구");
			System.out.println(t3.addr);
			System.out.println(t3.age);
			System.out.println(t3.name);
			System.out.println(t3.studentID);
			
			
		}
	}
	

}
