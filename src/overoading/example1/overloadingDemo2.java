package overoading.example1;

public class overloadingDemo2 extends overloadingDemo{
	void A (String arg1, String arg2){
		System.out.println("sub class : void A (String arg1, String arg2)");
	}
    void A (){
    	System.out.println("sub class : void A ()");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadingDemo2 od2 = new overloadingDemo2();
		od2.A();
		od2.A(1);
	    od2.A("coding everybody");
	    od2.A("coding everybody", "coding everybody");

	}

}
