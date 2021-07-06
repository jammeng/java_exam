package test.exclass;

public class CarTester {

	public static void main(String[] args) {

		Car carens = new Car("��ī����", "32��1234", 1820, 1650, 4545, 199.8, 30.0, 8.6);
		Car kona = new Car("kona", "23��1234", 1800, 1570, 4180, 159.8, 30.0, 6.86);
		
		carens.displaySpec();
		System.out.println();
		kona.displaySpec();
		
		System.out.println();
		System.out.println("��ī���� ������ġ "+ carens.getX() + ", " + carens.getY());
		System.out.println("��ī���� ���ᷮ "+ carens.getFuel());
		
		double usedFuel = carens.move(10.1, 20.2);
		System.out.println("��ī���� ���� ���ᷮ "+ usedFuel);
		System.out.println("��ī���� ���ᷮ "+ carens.getFuel());
		
		carens.refuel(30);
		System.out.println("��ī���� ���ᷮ "+ carens.getFuel());

		System.out.println("��ī���� ������ġ "+ carens.getX() + ", " + carens.getY());

	}

}
