package test.this2;

public class Circle {
	private int r;
	private double circum, area;
	
	public Circle(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public double getCircum() {
		return circum;
	}

	public double getArea() {
		return area;
	}
	
	//반지름이 r인 원의 둘레  계산하는 메소드
	public void calcCircum() {
		circum = 2 * Math.PI * r;
	}
	//반지름이 r인 원의 면적 계산하는 메소드
	public void calcArea() {
		area = Math.PI * Math.pow(r, 2);
	}
	
	public void showInfo() {
		calcCircum();
		calcArea();
		PrintCircle.print(this);
	}
}
