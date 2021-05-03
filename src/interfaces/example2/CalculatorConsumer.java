package interfaces.example2;


class CalculatorDummy implements Calculatable{
    public void setOprands(int first, int second, int third){
    }
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class CalculatorConsumer {
    public static void main(String[] args) {
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10, 20, 30);
        System.out.println("implemented CalculatorDummy Class");
        System.out.println(c.sum()+c.avg());
        
        Calculator c2 = new Calculator();
        System.out.println("implemented Calculator Class");
        c2.setOprands(10, 20, 30);
        System.out.println(c2.sum()+c2.avg());
        
    }
}