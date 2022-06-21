package test.constructor2;

public class RunUSBMemory {

	public static void main(String[] args) {
		USBMemory u1 = new USBMemory(64, "black");
		USBMemory u2 = new USBMemory(128, "red");
		
		u1.readMemory();
		
		u2.writeMemory();
		u2.readMemory();
	}

}
