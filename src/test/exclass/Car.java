package test.exclass;
//8-3

public class Car {
	private String name ,number;
	private int width, height, length;
	private double x, y, storage, fuel, sfc;
	
	Car(String name, String number, int width, int height, int length, 
		 double storage, double fuel, double sfc){
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.storage = storage;
		this.fuel = (fuel <= storage )? fuel : storage;
		this.sfc = sfc;
		x = 0.0;
		y = 0.0;
		
	}
	
	public double getX() { return x; }
	public double getY() { return y; }
	public double getFuel() { return fuel; }
	
	void displaySpec(){
		System.out.println("�̸�: " + name);
		System.out.println("��ȣ: " + number);
		System.out.println("����: " + width + "mm");
		System.out.println("����: " + height + "mm");
		System.out.println("����: " + length + "mm");
		System.out.println("��ũ: " + storage + "L");
		System.out.println("����: " + sfc + "km/L");
	}
	
	double move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx+dy*dy);
		double requiredFuel = dist / sfc;
		
		if (requiredFuel > fuel) {
			return 0;
		}
		else {
			fuel -= requiredFuel;
			x +=dx;
			y +=dy;
			return requiredFuel;
		}
	}
	
	String refuel(double amount) {
		double max = storage - fuel;
		
		if (amount > max) {
			fuel += max;
			return "����";
		}
		else {
			fuel += amount;
			return Double.toString(amount) + "L ��ŭ ���� �Ͽ����ϴ�.";
		}
	}
	
	public static void main(String[] args) {		
		
	}

}
