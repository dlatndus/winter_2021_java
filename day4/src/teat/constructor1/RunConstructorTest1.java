package teat.constructor1;

public class RunConstructorTest1 {

	public static void main(String[] args) {
		constructorTest1 c1 = new constructorTest1(7);
		constructorTest1 c2 = new constructorTest1(11);

		System.out.println("c1�� �����ϴ� ��ü�� n1 �ʵ��� ���� "+ c1.getN1());
		System.out.println("c2�� �����ϴ� ��ü�� n1 �ʵ��� ���� "+ c2.getN1());
	}

}
