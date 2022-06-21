package p1;

public class Parent {
	//상속관계일때는 자식이 부모의 protected 멤버를 접근 할 수 있다.
	protected int num1;
	
	protected void test1() {
		System.out.println("Parent의 test1() 호출");
		
	}
}
