package method;

public class MethodDemo1 {
	/*
	출력타입 함수명 (입력값);{
	}
	
	ex:
	String 함수명 (int val);{
	}

	String 함수명 (int val1, String val2, boolean val3); {
		return val4
	}
	*/

	public static void numbering() {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}	
	}
	public static void main(String[] args) {
		//numbering(1);
		numbering();
	}
}
