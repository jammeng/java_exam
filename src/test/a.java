package test;


import java.util.Random;
import java.util.Scanner;

class a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� A�� �Է��Ͻÿ�");
		int a = sc.nextInt();
		System.out.print("���� B�� �Է��Ͻÿ�");
		int b = sc.nextInt();
		System.out.print("���� C�� �Է��Ͻÿ�");
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
//				System.out.println("10�� ����Դϴ�");
//			}
//			else {
//				System.out.println("10�� ����� �ƴմϴ�");
//			}
//		}
//		else{
//			System.out.println("������");
//		}
		
//		if (sc1 > 0) {
//			if (sc1 < 50) {
//				System.out.println("��");
//			}
//			else if ( 50 <= sc1 && sc1 < 60) {
//				System.out.println("��");
//			}
//			else if ( 60 <= sc1 && sc1 < 70) {
//				System.out.println("��");
//			}
//			else if ( 70 <= sc1 && sc1 < 80) {
//				System.out.println("��");
//			}
//			else {
//				System.out.println("��");
//			}
//			
//		}
//		else {
//			System.out.println("�߸��� �����Դϴ�");
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
//		System.out.print("�ּҸ� �Է��ϼ���: ");
//		String address = sc.nextLine();
//		System.out.println("�ּ�: "+ address);
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
//		System.out.print("�غ����� �Է�:");
//		lowb = keyinput.nextDouble();
//		System.out.print("���̱��� �Է�:");
//		high = keyinput.nextDouble();
//		
//		System.out.println( lowb * high / 2 );
		
//		double x, y;	
//		System.out.print("�Ǽ� �Է�:");
//		x = keyinput.nextDouble();
//		System.out.print("�Ǽ� �Է�:");
//		y = keyinput.nextDouble();
//		
//		System.out.println(x+y);
//		System.out.println((x+y)/2);
		
//		int x;
//		System.out.print("���� �Է�:");
//		x = keyinput.nextInt();
//		System.out.println( x / 10 );
//		System.out.println( x % 10 );
		
//		System.out.println("10�� ���� ��: " + (x+10));
//		System.out.println("10�� �� ��: " + (x-10));
//		
		
//		System.out.print("���� �Է�: ");
//		String y  = sc.next();
//		System.out.print("�̸��� �Է�: ");
//		String x;
//		x = sc.next();
//		
//		System.out.println(y+x+"�� �ȳ��ϼ���");
//		sc.close();				
	}

}
