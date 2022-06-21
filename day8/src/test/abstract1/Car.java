package test.abstract1;

public abstract class Car {
	String name;
	
	public void showInfo() {
		System.out.println("클래스가 상속받는 Car는 자식클래스를 규격화하는 추상클래스이다");
	}
	
	public abstract void drive();
	public abstract void stop();
	public abstract void turnLeft();
	public abstract void turnRight();
	
}
