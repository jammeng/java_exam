package test.exclass;

class Human{
	String name;
	int height;
	int weight;
	/*			main
	 * 
		Human h1 = new Human();
		Human h2 = new Human();
		
		h1.name="�浿";
		h1.height=170;
		h1.weight=60;
		h2.name="ö��";
		h2.height=140;
		h2.weight=30;
		
		
		System.out.println("�̸�: " + h1.name);
		System.out.println("����: " + h1.height + "cm");
		System.out.println("ü��: " + h1.weight + "kg");
		System.out.println();

		System.out.println("�̸�: " + h2.name);
		System.out.println("����: " + h2.height + "cm");
		System.out.println("ü��: " + h2.weight + "kg");
	*/
}

class Human2{
	private String name;
	private int height;
	private int weight;
	
	Human2(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	
	void gainWeight(int weight) {
		this.weight += weight;
	}
	
	void reduceWeight(int weight) {
		this.weight -= weight;
	}
	
	/*
	 	Human2 h1 = new Human2("ö��", 190, 90);
		h1.gainWeight(2);
		System.out.println("�̸�: " + h1.getName());
		System.out.println("����: " + h1.getHeight() + "cm");
		System.out.println("ü��: " + h1.getWeight() + "kg");*/
}

public class Class8_1 {
	public static void main(String[] args) {
		
	}
}
