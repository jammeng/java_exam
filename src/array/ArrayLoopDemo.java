package array;


import java.util.ArrayList;
import java.util.List;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] members = {"김정명", "박창주", "최정상", "강전석"};
		for (int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member);
		}
		List<String> test = new ArrayList<String>();
		test.add("1");
		System.out.println(test);
		
	}

}
