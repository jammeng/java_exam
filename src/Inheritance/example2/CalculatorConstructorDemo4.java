package Inheritance.example2;

class Calculator{
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class SubCalculator extends Calculator{
	public SubCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemo4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubCalculator c1 = new SubCalculator(10, 20);
		c1.sum();
		c1.avg();
		c1.subtract();
		
	}

}
