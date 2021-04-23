package Inheritance.example1;

class DivCalculator extends MulCalCulrator {
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivCalculator c1 = new DivCalculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.division();
	}

}
