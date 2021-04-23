package condition;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kjm : 1234 123 12 1
		// david : aa b ccc
		
		String id = args[2];
		String pw = args[0];
		
		if(id.equals("aaa")) {
			System.out.println(id + " right");
		}
		else if(id.equals("bbb")) {
			System.out.println(id + " right");
		}
		else if(id.equals("ccc")){
			System.out.println(id + " right");
			if(pw.equals("b")) {
				System.out.println(id + pw + " right");
			}
			else {
				System.out.println("id right but password wrong");
			}
		}
		else {
		System.out.println(id + " wrong");
	
		}
	}

}
