package test.abstract1;

public abstract class Car {
	String name;
	
	public void showInfo() {
		System.out.println("Ŭ������ ��ӹ޴� Car�� �ڽ�Ŭ������ �԰�ȭ�ϴ� �߻�Ŭ�����̴�");
	}
	
	public abstract void drive();
	public abstract void stop();
	public abstract void turnLeft();
	public abstract void turnRight();
	
}
