package test.constructor2;

public class USBMemory {
	private int capacity;
	private String color;
	
	public int getCapacity() {
		return capacity;
	}
	
	public String getColor() {
		return color;
	}
	
	public USBMemory(int capacity, String color) {
		this.capacity = capacity;
		this.color = color;
	}
	
	public String showInFo() {
		return capacity + "GB, " + color + " ����";
	}
	
	public void writeMemory() {
		System.out.println(showInFo() + "�� USB Memory�� �����͸� �����Ѵ�.");
		
	}

	public void readMemory() {
		System.out.println(showInFo() + "�� USB Memory�� �����͸� �о�´�.");
		
	}
}