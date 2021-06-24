package test;
import java.util.Scanner;
import java.util.Random;

public class Exmethod {
	static Random rnd = new Random();
	static Scanner input = new Scanner(System.in);
	
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
		System.out.println("안녕하세요");
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
	
	//7-7
	public static String putChar(int n) {
		String str = "";
		for(int i = 1; i<= n; i++) {
			str += "c"; 
		}
		return str;
	}

	public static void putStars(char ch,int n) {
		for(int i = 1; i<= n; i++) {
			for(int j = 1; j<= putChar(i).length(); j++) {
				System.out.print(ch);
			}
			System.out.println("");
		}
	}
	
	//7-8
	public static void random(int a, int b) {
		Random rnd = new Random();
		if(b<=a)
			System.out.println(a);
		else
			System.out.println(a + rnd.nextInt(b-(a-1)));
	}
	
	//7-9
	public static int readPlusInt(int num) {
		int reverse = 0;
		while(num != 0 ) {
			reverse = reverse * 10 + num % 10;
			num /= 10;
		}
		return reverse;
	}
	
	//7-10
	public static void rndmath(int num) {
		
		
	}
	
	public static boolean confirmRetry() {
		int retry = 0;
		do {
			System.out.print("다시? yes:1, no:0");
			retry = input.nextInt();
		} while(retry != 1 && retry != 0);
		return retry == 1;
	}
	
	public static void main(String[] args) {

		int retry = 0;
		do {
			int rnnum1 = rnd.nextInt(900) + 100;
			int rnnum2 = rnd.nextInt(900) + 100;
			int rnnum3 = rnd.nextInt(900) + 100;
			int rnmath = rnd.nextInt(4);
			
			int result = 0;
			int in;
			
			switch (rnmath) {
			case 0: {
				result = rnnum1 + rnnum2 + rnnum3; break;
			}
			case 1: {
				result = rnnum1 + rnnum2 - rnnum3; break;
			}
			case 2: {
				result = rnnum1 - rnnum2 + rnnum3; break;
			}
			case 3: {
				result = rnnum1 - rnnum2 - rnnum3; break;
			}
			}
			while(true) {
				System.out.print(
						rnnum1 + ( (rnmath<2)? "+" : "-" )+ 
						rnnum2 + ( (rnmath%2==0)? "+" : "-" ) + 
						rnnum3 + " = "
				);
				
				in = input.nextInt();
				if(result == in) {
					System.out.println("정답!");
					break;
				}
				else {
					System.out.println("오답!");
				}
			}
		}while(confirmRetry());
		
		
		
		
		
	}
}