package test.final1;


public class Child extends Parent{
//final 필드는 나중에 값 변경 금지(final 필드값 변경 금지)
	public final int time = 3;
	
	public void rest() {	
		//time = 5;
		System.out.println(time + "시간 휴식한다.");
	}
}
