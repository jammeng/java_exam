package test;
import java.util.Scanner;

public class Exmethod {
	
	//7-1
	public static int signOf(int num) {
		int sign = num;
		if ( sign == 0 ) {
			return 0;
		}
		else if (sign > 0) {
			return 1;
		}
		else {
			return -1;
		}
	}
	 
	//7-2
	public static int min(int num1, int num2, int num3) {
		int min = num1;
		if ( min > num2 ) {
			min = num2;
		}
		if ( min > num3 ) {
			min = num3;
		}
		return min;
	}
	
	//7-3
	public static int med(int a, int b,int c) {
		int mid = 0;
		if( b>=a && a>=c || c>=a && a>=b) {
			mid = a;
		}
		else if ( a>=b && b>=c || c>=b && b>=a) {
			mid = b;
		}
		else {
			mid = c;
		}
		return mid;
	}
	
	//7-4
	public static int sumUp(int n) {
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
	
	//7-5
	public static void hello() {
		System.out.println("¾È³çÇÏ¼¼¿ä");
	}
	
	public static String printSeason(int num) {
//		if(num == 3 || num == 4 || num == 5)
//			return "Spring";
//		else if(num == 6 || num == 7 || num == 8)
//			return "Summer";
//		else if(num == 9 || num == 10 || num == 11)
//			return "Fall";
//		else if(num == 12 || num == 1 || num == 2)
//			return "Winter";
//		else
//			return "";
		
		switch (num) {
		case 3,4,5: {
			return "Spring";
		}
		case 6,7,8: {
			return "Summer";
		}
		case 9,10,11: {
			return "Fall";
		}
		case 12,1,2: {
			return "Winter";
		}
		default:
			return "";
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(printSeason(num));
	}
}