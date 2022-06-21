package teat.overload;

import java.util.Scanner;

public class RunOverloadTest1 {

	public static void main(String[] args) {
		MethodOverloadingTest1 ot1 = new MethodOverloadingTest1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int n2 = sc.nextInt();
		
		System.out.printf("%d * %d = %d\n", n1, n2, ot1.calc(n1, n2));
		
		System.out.print("정수 1 입력 : ");
		int n3 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int n4 = sc.nextInt();
		System.out.print("정수 3 입력 : ");
		int n5 = sc.nextInt();
		
		System.out.printf("%d + %d + %d = %d\n", n3, n4, n5, ot1.calc(n3, n4, n5));
	
		sc.close();
	}

}
