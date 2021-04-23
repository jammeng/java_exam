package method;

public class MethodDemo3 {

	public static void numbering(int x, int t) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < t) {
			System.out.println(i+x);
			i++;
		}	
	}
	public static void main(String[] args) {
		//numbering(1);
		numbering(10, 5);
		
	}

}
