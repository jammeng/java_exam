package overoading.example1;

public class overloadingDemo {
	 	void A (){
	 		System.out.println("void A()");
	 	}
	 	
	    void A (int arg1){
	    	System.out.println("void A (int arg1)");
	    }
	    
	    void A (String arg1){
	    	System.out.println("void A (String arg1)");
	    }
//	    int A (){
//	    	System.out.println("int A()");
//	    }
	public static void main(String[] args) {
		overloadingDemo cd = new overloadingDemo();
		cd.A();
		cd.A(1);
		cd.A("coding everybody");
		
		// TODO Auto-generated method stub

	}

}
