package test.constructorcall2;

public class ClsB extends ClsA {
	public ClsB() {
		System.out.println("ClsB()�⺻ ������ ����");
	}
	
	public ClsB(int n) {
		super(n); //ClsA�⺻������ ȣ��
		System.out.println("ClsB(int n)������ ����" + n);
	}
}
