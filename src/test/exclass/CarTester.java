package test.exclass;

public class CarTester {

	public static void main(String[] args) {

		Car carens = new Car("뉴카렌스", "32더1234", 1820, 1650, 4545, 199.8, 30.0, 8.6);
		Car kona = new Car("kona", "23나1234", 1800, 1570, 4180, 159.8, 30.0, 6.86);
		
		carens.displaySpec();
		System.out.println();
		kona.displaySpec();
		
		System.out.println();
		System.out.println("뉴카렌스 현재위치 "+ carens.getX() + ", " + carens.getY());
		System.out.println("뉴카렌스 연료량 "+ carens.getFuel());
		
		double usedFuel = carens.move(10.1, 20.2);
		System.out.println("뉴카렌스 사용된 연료량 "+ usedFuel);
		System.out.println("뉴카렌스 연료량 "+ carens.getFuel());
		
		carens.refuel(30);
		System.out.println("뉴카렌스 연료량 "+ carens.getFuel());

		System.out.println("뉴카렌스 현재위치 "+ carens.getX() + ", " + carens.getY());

	}

}
