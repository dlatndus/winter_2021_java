package test.class2;

public class RunClassAdd {

	public static void main(String[] args) {
		ClassAdd a1 = new ClassAdd();
		ClassAdd a2 = new ClassAdd();
		
		a1.setN1(10);
		a1.setN2(20);
		a1.calcAdd();
		
		System.out.printf("%d + %d = %d\n", a1.getN1(), a1.getN2(), a1.calcAdd());
		
		a2.setN1(500);
		a2.setN2(600);
		a2.calcAdd();
		
		System.out.printf("%d + %d = %d\n", a2.getN1(), a2.getN2(), a2.calcAdd());
	}

}
