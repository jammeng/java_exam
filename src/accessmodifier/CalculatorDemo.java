package accessmodifier;

class Calculator{
	//int left, right;
	private int left, right;
     
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int _sum(){
        return this.left+this.right;
    }
    private int _minus(){
        return this.left-this.right;
    }
    public void sumDecoPlus(){
        System.out.println("++++ "+_sum()+" ++++");
    }
    public void sumDecoMinus(){
        System.out.println("---- "+_minus()+" ----");
    }
}
  
public class CalculatorDemo {
    public static void main(String[] args) {        
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        //c1.left = 100;
        c1.sumDecoPlus();
        c1.sumDecoMinus();
    }
}