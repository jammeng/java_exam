package test;
import java.util.Random;
import java.util.Scanner;

class a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		
		
		int num = 0;
		
		System.out.print("�� �� �Է�: ");
		num = sc.nextInt();	

		
		
		int cnt=1;
		for (int i = 1; i<=num; i++) {
			for (int j = 0; j<num-i; j++)
				System.out.print(" ");
			for(int z = 1; z<=(i-1)*2+1 ; z++) {
				if (cnt>=10)
					cnt %= 10;
				System.out.print(cnt);	
			}
			cnt++;
			System.out.println("");
		}
		
//		for (int i = num-1; i>=0; i--) {
//			for(int j= 0; )
//		}
		
//		for (int i = 1; i<=num; i++) {
//			for (int j = 1; j <=i; j++)
//				System.out.print("*");
//			System.out.println("");
//		}
//		System.out.println("");
//		
//		for (int i = 0; i<num; i++) {
//			for (int j = 0; j<num-i; j++)
//				System.out.print("*");
//			System.out.println("");
//		}
		
		
		
		
//		do{
//			System.out.print("�� �Է�: ");
//			num = sc.nextInt();	
//		}while(num > 12 || num <= 0);
//		
//		switch (num) {
//		case 3,4,5: {
//			System.out.println("��");
//		}
//		case 6,7,8: {
//			System.out.println("����");
//			
//		}
//		case 9,10,11: {
//			System.out.println("����");
//		}
//		case 12,1,2: {
//			System.out.println("�ܿ�");
//		}
//		}
		
		
//		System.out.print("����: ");
//		int num = sc.nextInt();
//		
//		for(int i = 1; i<=num; i++) {
//			System.out.print("*");
//			if (i % 5 == 0)
//				System.out.println("");
//		}
//		
				
//		int min = 0;
//		int max = 0;
//		int temp = 0;
//		
//		System.out.print("�ּҰ�: ");
//		min = sc.nextInt();
//		System.out.print("�ִ밪: ");
//		max = sc.nextInt();
//		System.out.print("������: ");
//		temp = sc.nextInt();
//		
//		System.out.println("���� | ǥ��ü��");
//		for (; min<=max;) {
//			double avg = (min - 100) * 0.9;
//			System.out.println(min + " | "+ avg);
//			min += temp;
//		}
		
		
		
		
		
//		int cnt = 0;
//		do {
//			System.out.print("�Է�:");
//			num = sc.nextInt();
//		}while(num<=0);
//		
//		for (int i = 1; i<=num; i++) {
//			if (i != 1)
//				System.out.print("+"+ i);
//			if (i == 1)
//				System.out.print(i);
//			cnt += i;
//		}
//		System.out.println("="+ cnt);
//		
		
		
		
		
//		for (int i = 0; i <= num; i++)
//			System.out.println(i);
//		for (; num >= 0; num--)
//			System.out.println(num);
		
		
//		for (int i = 0; i<num; i++) {
//			System.out.print("*");
//		}
		
		
		
		
//		int num = 0;
//		
//		do {
//			System.out.print("���� ����:");
//			num = sc.nextInt();
//		}while( num <= 0);
//		
//		int cnt = num-1; 
//		
//		while(cnt>=1) {
//			num *= cnt;
//			cnt--;
//		}System.out.println(num);
//		
		
		
		
		
//		int num ;
//		do {
//			System.out.println("���� ����:");
//			num = sc.nextInt();
//		}while( num <= 0);
//		
//		int cnt = 0;
//		while(num > 0) {
//			num /= 10;
//			cnt ++;
//		}
//		System.out.println("�Է��Ͻ� ���ڴ� "+cnt+" �ڸ��Դϴ�");
			
			
			
			
			
		
		
		
//		for (int i = 1 ; i <= num; i ++) {
//			if (i % 2 != 0)
//				System.out.print("*");
//			if (i % 2 == 0)
//				System.out.print("+");
//		}
//			
		
//		System.out.print("��� ǥ���ұ��? : ");
//		int num = sc.nextInt();
//		int cnt = 0;
//		do {
//			if (num < 1)
//				break;
//			
//			cnt++;
//			if (cnt % 2 != 0)
//				System.out.print("*");
//			if (cnt % 2 == 0)
//				System.out.print("+");
//		}while(cnt != num);
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
//		String val = "hello";
//		String val2 = new String("hello");
//		//String val3 = "hello";
//		
//		System.out.println(val == val2);
//		System.out.println(val.equals("hello"));
//		
//		boolean res = val.equals(val2);
//		System.out.println(res); 
		
//		int star = sc.nextInt();
//		int i;
//		for(i = 0; i<star; i++)
//			System.out.print("*");
//			if(i==star && star != 0)
//				System.out.print("\n");
//		
//			
//		
		
		
		
//		System.out.print("���� �� �Է��ϼ���. : ");
//		int inp1 = sc.nextInt();
//		int i = 0;
//		for( i = inp1; i>=0; i--)
//			System.out.println(i);
//		System.out.println(i);
//		
//		
//		int x;
//		do {
//			x = sc.nextInt();
//		}while(x<=0);
//		
//		while(x>=0) {
//			System.out.println(x--);
//		}	
//		System.out.println(x);
		
		
		
		
		
		
		
		
//		System.out.print("���� �� �Է��ϼ���. : ");
//		int inp1 = sc.nextInt();
//		
//		System.out.print("���� �� �Է��ϼ���. : ");
//		int inp2 = sc.nextInt();
//		
//		int min = inp1;
//		int max = 0;
//		
//		if (min < inp2) 
//			max = inp2;
//		else {
//			min = inp2;
//			max = inp1;
//		} 
//	
//		int i;
//		for (i = min+1; i<max; i++) {
//			System.out.println(i);
//		}
//		
		
		
		
		
//		int collect = 0;
//		int num = rnd.nextInt(90)+10;
//		System.out.println(num);
//		
//		do {
//			
//			System.out.print("���� ���ڸ� �Է��ϼ���. : ");
//			int inp = sc.nextInt();
//			
//			if (num > inp) {
//				System.out.println("�Է��� ������ ū �� �Դϴ�");
//			}
//			else if(num < inp) {
//				System.out.println("�Է��� ������ ���� �� �Դϴ�");
//			}
//			else {
//				System.out.println("�����Դϴ�");
//				collect = 1;
//			}
//		}while (collect == 0); 
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int x;
//		
//		do {
//			System.out.println("�Է�");
//			x = sc.nextInt();
//			
//		}while(x < 100 || x> 999);
//		System.out.println("���� "+ x);
//		
		
		
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
