package test.this1;

public class PowerTest {
	private int n;
	
	public void power(int n) {
		this.n = n * n; //this.? =>매개변수
		System.out.printf("%d의 2제곱승은 %d입니다.\n", n, this.n);
	}
	
	public int power(int x, int y) {
		n = 1;
		for (int i = 0; i < y; i++) {
			n *= x;
		}
		
		return n;
	}
}
