package test;

import java.util.Random;
import java.util.Scanner;

class a {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		
		for (int x =0 ; x<20 ; x++ ) {
			System.out.println((i-5)+rnd.nextInt(11));
			
		}
		
		
		
//		Random rnd = new Random();
//		int n1 = 1 + rnd.nextInt(9);
//		int n2 = -1 - rnd.nextInt(9);
//		int n3 = 10 + rnd.nextInt(9);
//	
//		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);		
		
//		Scanner keyinput = new Scanner(System.in);
//		double x;
//		final double PI = 3.1416;
//		
//		x = keyinput.nextDouble();
//		double y = Math.pow(x, 2);
//		double z = Math.pow(x, 3);		
//		
//		System.out.println(4*PI*y);
//		System.out.println(4/3.0*PI*z);
		
//		double lowb, high;
//		System.out.print("밑변길이 입력:");
//		lowb = keyinput.nextDouble();
//		System.out.print("높이길이 입력:");
//		high = keyinput.nextDouble();
//		
//		System.out.println( lowb * high / 2 );
		
//		double x, y;	
//		System.out.print("실수 입력:");
//		x = keyinput.nextDouble();
//		System.out.print("실수 입력:");
//		y = keyinput.nextDouble();
//		
//		System.out.println(x+y);
//		System.out.println((x+y)/2);
		
//		int x;
//		System.out.print("정수 입력:");
//		x = keyinput.nextInt();
//		System.out.println( x / 10 );
//		System.out.println( x % 10 );
		
//		System.out.println("10을 더한 값: " + (x+10));
//		System.out.println("10을 뺀 값: " + (x-10));
//		
//		String x;
//		System.out.print("이름을 입력: ");
//		String x = keyinput.next();
//		System.out.println(x);
//		keyinput.close();				
	}

}
