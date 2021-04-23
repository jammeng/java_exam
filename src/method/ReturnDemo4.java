package method;

public class ReturnDemo4 {

	public static String[] getmembers(){
		String[] members = {"김정명", "박창주", "최정상", "강전석"};
		return members;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] members = getmembers();
		System.out.println(members[0]);
	}
}
