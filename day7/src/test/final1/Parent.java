package test.final1;

//final 부모클래스는 자식클래스가 없다(상속금지)
public /*final*/ class Parent {
//부모클래스의 final 메소드는 재정의 할 수 없다.(메소드 재정의(overriding) 금지)
	public /* final */ void rest() {
		System.out.println("10분간 휴식한다");
		
	}
}
