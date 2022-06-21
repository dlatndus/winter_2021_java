package test.inheritance1;

public class RunStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="쥐잡는드래곤";
		s1.age = 35;
		s1.addr = "서울시 용산구 한남동";
		System.out.println("성명 : "+s1.name);
		System.out.println("나이 : "+s1.age);
		System.out.println("주소 : "+s1.addr);
		
		System.out.print(s1.name + "이 ");
		s1.eat();
		s1.sleep();
		s1.study();
		System.out.println(s1.toString());
	}

}
