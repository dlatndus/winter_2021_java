package test.access2;

import test.access1.AccessBase;

public class BBB {

		public void test() {
			AccessBase ab = new AccessBase();
			
			//System.out.println("n1(private) = " + ab.n1); //private 필드는 다른 패키지에서 접근 불가능
			System.out.println("n2(public) = " + ab.n2); //public 필드는 다른 패키지에서 접근가능
			//System.out.println("n3(protected) = " + ab.n3); //protected 필드는 다른 패키지에서 접근 불가능
			//System.out.println("n4(default) = " + ab.n4); //default 필드는 다른 패키지에서 접근 불가능
			
		}
}
