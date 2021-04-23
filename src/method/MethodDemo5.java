package method;

public class MethodDemo5 {

	public static void numbering(int init, int limit) {
		// TODO Auto-generated method stub
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}	
	}
	public static void main(String[] args) {
		//numbering(1);
		numbering(1,5);
	}

}
