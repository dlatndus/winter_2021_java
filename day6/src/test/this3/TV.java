package test.this3;

public class TV {
	private String producer;
	private int size;
	private String color;
	
	public TV(String producer) {
		this.producer = producer;
	}
	
	public TV(String producer, int size) {
		//this.producer = producer;
		this(producer);
		this.size = size;
	}
	
	public TV(String producer, int size, String color) {
		//this.producer = producer;
		//this.size = size;
		this(producer, size);
		this.color = color;
	}
}
