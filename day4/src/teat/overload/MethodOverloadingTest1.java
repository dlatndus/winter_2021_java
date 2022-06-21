package teat.overload;

public class MethodOverloadingTest1 {
//매개변수의 개수를 다르게 선언한 메소드 오버로딩
	public int calc(int n1,int n2) {
		return n1 * n2;
	}	
	public int calc(int n1, int n2, int n3) {
		return n1+n2+n3;
		
	
	}
}
