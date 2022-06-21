package test.abstract1;

public class RunCar {

	public static void main(String[] args) {
		Lexus rx = new Lexus();
		
		//rx.name = "Lexus";
		rx.showInfo();
		rx.drive();
		rx.turnLeft();
		rx.stop();
	}

}
