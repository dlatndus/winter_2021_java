package test.this2;

public class PrintCircle {
	
	public static void print(Circle c) {//�ּҰ� call by reference
		System.out.printf("������  %dcm�� ���� �ѷ���  %.2fcm�̴�\n", c.getR(), c.getCircum());
		System.out.printf("������  %dcm�� ���� ������  %.2fcm2 �̴�\n", c.getR(), c.getArea());
	}

	public static void main(String[] args) {
		Circle c = new Circle(7);
		c.showInfo();
		
		Circle c2 = new Circle(15);
		c2.showInfo();

	}

}
