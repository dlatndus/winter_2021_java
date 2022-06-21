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
		return capacity + "GB, " + color + " 색상";
	}
	
	public void writeMemory() {
		System.out.println(showInFo() + "의 USB Memory에 데이터를 저장한다.");
		
	}

	public void readMemory() {
		System.out.println(showInFo() + "의 USB Memory에 데이터를 읽어온다.");
		
	}
}
