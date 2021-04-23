package condition;

public class LoginDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String pw = args[1];
		
		if((id.equals("k") || id.equals("kj") || id.equals("kjm")) && pw.equals("42399")) {
			System.out.println("right");
		}
		else {
		System.out.println("wrong");
	
		}
	}
}
