package array;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3};
		int[] intarray2 = new int[3];
		int[] intArray3 = new int[] {0,0,0};
//		System.out.println(intArray[2]);
		int sum = 0;
		for (int i = 0; i<intArray.length; i++) {
			
			sum += intArray[i];
			System.out.println(sum);
		}
	}

}
