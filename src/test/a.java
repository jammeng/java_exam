package test;


import java.util.Random;
import java.util.Scanner;

class a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 A를 입력하시오");
		int a = sc.nextInt();
		System.out.print("정수 B를 입력하시오");
		int b = sc.nextInt();
		System.out.print("정수 C를 입력하시오");
		int c = sc.nextInt();
		
		if ( a > b ) {
			int temp = a;
			a = b;
			b = temp;
		}
		if ( b > c ) {
			int temp = b;
			b = c;
			c = temp;
		}
		if ( a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
//		if (sc1 > 0 ) {
//			if (sc1 % 10 ==0) {
//				System.out.println("10의 배수입니다");
//			}
//			else {
//				System.out.println("10의 배수가 아닙니다");
//			}
//		}
//		else{
//			System.out.println("음수임");
//		}
		
//		if (sc1 > 0) {
//			if (sc1 < 50) {
//				System.out.println("가");
//			}
//			else if ( 50 <= sc1 && sc1 < 60) {
//				System.out.println("양");
//			}
//			else if ( 60 <= sc1 && sc1 < 70) {
//				System.out.println("미");
//			}
//			else if ( 70 <= sc1 && sc1 < 80) {
//				System.out.println("우");
//			}
//			else {
//				System.out.println("수");
//			}
//			
//		}
//		else {
//			System.out.println("잘못된 점수입니다");
//		}
		sc.close();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		int i;
//		Random rnd = new Random();
//		Scanner sc = new Scanner(System.in);
//		i = sc.nextInt();
		
		
//		for (int x =0 ; x<20 ; x++ ) {
			
			//double b = Math.round(rnd.nextDouble()*10);
			
//			System.out.println(rnd.nextDouble());
//			System.out.println(rnd.nextDouble()*10);
//			
//			double a = (-1 + rnd.nextInt(3));
//			System.out.println((-1 + rnd.nextDouble()) * a);
			
//			System.out.println(-1 + (rnd.nextDouble()*2));
			
//		}
//		System.out.print("주소를 입력하세요: ");
//		String address = sc.nextLine();
//		System.out.println("주소: "+ address);
//		
//		
		
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
		
//		System.out.print("성을 입력: ");
//		String y  = sc.next();
//		System.out.print("이름을 입력: ");
//		String x;
//		x = sc.next();
//		
//		System.out.println(y+x+"님 안녕하세요");
//		sc.close();				
	}

}
