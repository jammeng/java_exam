package method;

public class MethodDemo6 {
	
	public static int numbering2(int val1, int val2) {
		int mul = 0;
		mul = val1 * val2;
		
		return mul;
	}

	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += i;
			i++;
		}
		return output;
	}
	public static void main(String[] args) {
		//numbering(1);
		String result = numbering(1,5);
		System.out.println(result);
		
		System.out.println(numbering(0, 3));
		
		System.out.println(numbering2(5,3));
		int resurt = numbering2(3,2);
		System.out.println(resurt);
	}

}
