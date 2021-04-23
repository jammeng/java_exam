package operator;

public class EqualStringDemo {
	public static void main(String[] args) {
		String a = "Hello";
		String b = new String("Hello");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}
}
