package method;

public class ReturnDemo4 {

	public static String[] getmembers(){
		String[] members = {"������", "��â��", "������", "������"};
		return members;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] members = getmembers();
		System.out.println(members[0]);
	}
}
