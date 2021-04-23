package constructor;

class Calculator4{
	
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

public class CalculatorDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator4 c1 = new Calculator4();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator4 c2 = new Calculator4();
		c2.setOperands(20, 30);
		c2.sum();
		c2.avg();
	}

}
