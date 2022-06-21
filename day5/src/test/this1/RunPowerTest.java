package test.this1;

public class RunPowerTest {

	public static void main(String[] args) {
		PowerTest p =new PowerTest();
		p.power(7);
		
		int x=5, y=3;
		
		System.out.printf("%dÀÇ %dÁ¦°ö½ÂÀº %dÀÔ´Ï´Ù\n", x, y, p.power(x, y));
	}

}
