package test.static1;

public class RunTV {

	public static void main(String[] args) {
		TV t1 = new TV(32, "blue");
		TV t2 = new TV(55, "red");
		TV t3 = new TV(100, "green");
		
		TV.producer = "삼성전자";
		System.out.printf("t1이 참조하는 객체의 멤버필드 color : %s, size : %d, producer : %s\n", 
							t1.getColor(), t1.getSize(), TV.producer);
		
		System.out.printf("t2이 참조하는 객체의 멤버필드 color : %s, size : %d, producer : %s\n", 
					t2.getColor(), t2.getSize(), TV.producer);
		
		System.out.printf("t3이 참조하는 객체의 멤버필드 color : %s, size : %d, producer : %s\n", 
					t3.getColor(), t3.getSize(), TV.producer);
	}

}
