package teat.constructor1;

public class constructorTest1 {
	private int n1;
	
	
	
	public int getN1() {
		return n1;
	}
	
	//���߿� n1���� �ٲٰ� ���� ��
	public void setN1(int n1) {
		this.n1 = n1;
	}

	public constructorTest1(int n1) {
		this.n1 = n1;
		System.out.printf("constructorTest1(%d) ������ ȣ���\n", n1);
	}
}
