package test.access3;

public class RunAccessSample {

	public static void main(String[] args) {
		AccessSample a1 = new AccessSample();

	a1.n1 = 100;
	a1.setN2(88);
	
	System.out.printf("a1이 참조하는 AccessSample 객체의 n1 필드 : %d\n", a1.n1);
	System.out.printf("a1이 참조하는 AccessSample 객체의 n2 필드 : %d\n", a1.getN2());
	
	}

}
