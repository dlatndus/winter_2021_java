package test.overriding;

public class Bomb extends Weapon {
	@Override
	public void fire() {
		super.fire();//�θ�Ŭ������ fire ����
		System.out.println("����̤̤̤̤̤̤̤̤̤̤̤̤̿�ġĭ��ġŲġŲ�̳��弼��~");
	}
}
