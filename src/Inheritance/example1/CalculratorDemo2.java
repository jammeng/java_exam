package Inheritance.example1;

class MulCalCulrator extends Calculator{
	public void mul() {
		System.out.println(this.left * this.right);
	}
}

public class CalculratorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulCalCulrator c1 = new MulCalCulrator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.mul();
	}

}