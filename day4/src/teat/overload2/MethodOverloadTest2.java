package teat.overload2;

public class MethodOverloadTest2 {
	
	public int calc(int n1, int n2) {
		return n1 * n2;
	}
	
	public double calc(double n1, double n2) {
		return n1 + n2;
	}
	public static void main(String[] args) {
		MethodOverloadTest2 ot2 = new MethodOverloadTest2();
		
		int n1 = 7;
		int n2 = 8;
		
		System.out.printf("%d * %d = %d\n", n1, n2, ot2.calc(n1, n2));
		
		double n3 = 3.5;
		double n4 = 2.7;
		
		System.out.printf("%.1f + %.1f = %.2f\n", n3, n4, ot2.calc(n3, n4));
		
		
	}

}
