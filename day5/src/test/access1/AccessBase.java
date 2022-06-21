package test.access1;

//외부에서 접근을 당하는 기준 클래스
//클래스 public : 같은 패키지, 다른 패키지 모두에서 접근이 가능하다
//클래스 default(접근지정자 생략): 같은 패키지 접근 가능, 다른 패키지 접근 불가능

public class AccessBase {
	private int n1 = 10;
	public int n2 = 20;
	protected int n3 = 30;
	int n4 = 50;//default
}
