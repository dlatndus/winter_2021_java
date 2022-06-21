package test.class1;

public class RunTV {

	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		TV tv3 = new TV();

		tv1.setProducer("LG");
		tv1.setColor("Black");
		tv1.setSize(55);
		
		tv2.setProducer("Sansung");
		tv2.setColor("White");
		tv2.setSize(77);
		
		tv3.setProducer("Apple");
		tv3.setColor("Netal");
		tv3.setSize(100);
		
		System.out.println("*************************************************");
		
		System.out.println(tv1.getProducer()+"전자 TV");
		System.out.println(tv1.getSize()+"인치");
		System.out.println(tv1.getColor()+"색상");
		tv1.powerOn();
		for (int i = 0; i < 7; i++) {
			tv1.upChannel();
		}
		tv1.powerOff();
		System.out.println("*************************************************");
	
		System.out.println("*************************************************");
		
		System.out.println(tv2.getProducer()+"전자 TV");
		System.out.println(tv2.getSize()+"인치");
		System.out.println(tv2.getColor()+"색상");
		tv2.powerOn();
		for (int i = 0; i < 10; i++) {
			tv2.upChannel();
		}
		tv2.powerOff();
		System.out.println("*************************************************");
	
	}

}
