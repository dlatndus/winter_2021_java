package test.abstract1;

public class Lexus extends Car {
	private String producer = "Lexus";
	
	
	public Lexus() {
		producer = name;

	}
	
	
	@Override
	public void drive() {
		System.out.println(producer + "자동차가 주행한다");
	}

	@Override
	public void stop() {
		System.out.println(producer + "자동차가 멈춘다");
	}

	@Override
	public void turnLeft() {
		System.out.println(producer + "자동차가 좌회전한다");
	}

	@Override
	public void turnRight() {
		System.out.println(producer + "자동차가 우회전한다");
	}

}
