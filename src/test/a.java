package test;
import java.util.Random;
import java.util.Scanner;

class a {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rnd = new Random();

		int[][] arr1 = new int[4][3];
 		int[][] arr2 = new int[3][4];
 		int[][] arr3 = new int[4][4];
 		
 		System.out.println("arr1 �Է�");
 		for(int i=0; i<4; i++) {
 			for(int j=0; j<3; j++) {
 				System.out.print("arr1["+i+"]["+j+"]");
 				arr1[i][j] = input.nextInt();
 			}
 		}
 		System.out.println("arr2 �Է�");
 		for(int i=0; i<3; i++) {
 			for(int j=0; j<4; j++) {
 				System.out.print("arr2["+i+"]["+j+"]");
 				arr2[i][j] = input.nextInt();
 			}
 		}
 		
 		System.out.println("arr1");
 		for(int i=0; i<4; i++) {
 			for(int j=0; j<3; j++) {
 				System.out.print(arr1[i][j]+"\t");
 				}
 			System.out.println("");
 		}
 		System.out.println("arr2");
 		for(int i=0; i<3; i++) {
 			for(int j=0; j<4; j++) {
 				System.out.print(arr2[i][j]+"\t");
 				}
 			System.out.println("");
 		}
 		
 		for(int i=0; i<4; i++) {
 			for(int j=0; j<3; j++) {		
 				for(int h=0; h<4; h++) {
 				    arr3[i][h] += arr1[i][j]*arr2[j][h];
 				} 				
 			}
 		}
 		System.out.println("arr3");
 		for(int i=0; i<4; i++) {
 			for(int j=0; j<4; j++) {
 				System.out.print(arr3[i][j]+"\t");
 				}
 			System.out.println("");
 		}
		
//		int[][] arr1 = new int[2][2]; //4x3
// 		int[][] arr2 = new int[2][2]; //3x4
// 		int[][] arr3 = new int[2][2];
// 		
// 		System.out.println("arr1 �Է�");
// 		for(int i=0; i<2; i++) {
// 			for(int j=0; j<2; j++) {
// 				System.out.print("arr1["+i+"]["+j+"]");
// 				arr1[i][j] = input.nextInt();
// 			}
// 		}
// 		System.out.println("arr2 �Է�");
// 		for(int i=0; i<2; i++) {
// 			for(int j=0; j<2; j++) {
// 				System.out.print("arr2["+i+"]["+j+"]");
// 				arr2[i][j] = input.nextInt();
// 			}
// 		}
// 		//��
// 		for(int i=0; i<2; i++) {
// 			int a1,b1,c1,d1;
// 			
// 			for(int j=0; j<2; j++) {
// 				a1 = arr1[i][0];
// 				b1 = arr2[0][j];
// 				
// 				c1 = arr1[i][1];
// 				d1 = arr2[1][j];
// 				arr3[i][j] = (a1*b1)+(c1*d1);
// 				}
// 			}
//        System.out.println("��");
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.println(arr3[i][j]);
//			}
//		}
			
//		int stop = 1;
//
//		String[] day = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
//		String[] day2 = {"��","��","ȭ","��","��","��","��"};
//		
//		retry: while(stop == 1) {
//			int rn_day = rnd.nextInt(7);
//			int rn_last_day = rnd.nextInt(7);
//	
//			while(rn_day == rn_last_day) {
//				rn_day = rnd.nextInt(7);
//			}
//			rn_last_day = rn_day;
//			
//			wrong: while(true) {
//				System.out.println("�ش� ������ ���ܾ��Է� (�ҹ���)");   
//				
//				System.out.print(day2[rn_day]+"���� : ");
//				String str = input.next();
//				
//				if(day[rn_day].equals(str)){
//					System.out.print("�����Դϴ�. �ٽ��Ͻðڽ��ϱ�? (yes:1, no:0)");
//					stop = input.nextInt();
//					continue retry;
//				}
//				else {
//					System.out.println("��!");	
//					continue wrong;
//				}
//			}
//		}
	
//		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August",
//						"September", "October", "November", "December"};
//		
//		retry: while(stop == 1) {
//			int rn_month = rnd.nextInt(12);	
//			int rn_month2 = rnd.nextInt(12);
//			
//			while(rn_month == rn_month2) {
//				rn_month2 = rnd.nextInt(12);
//			}
//			rn_month = rn_month2;
//			
//			err: while(true) {
//				System.out.println("�ش� ���� ���ܾ��Է� (ù���ڴ� �빮�� �������� �ҹ���)");
//				
//				System.out.print(rn_month+1+"�� : ");
//				String str = input.next();
//				
//				if(month[rn_month].equals(str)){
//					System.out.print("�����Դϴ�. �ٽ��Ͻðڽ��ϱ�? (yes:1, no:0)");
//					stop = input.nextInt();
//					continue retry;
//				}
//				else {
//					System.out.println("��!");	
//					continue err;
//				}
//			}
//		}
		
//		System.out.print("��� ��: ");
//		int num = input.nextInt();
//		
//		int[] list = new int[num];
//		int[] list2 = new int[num];
//		
//		for(int i = 0; i<list.length; i++) {
//			System.out.print("list["+i+"] = ");
//			list[i] = input.nextInt();
//		}
//		for (int i=0; i<num; i++) {
//			list2[i] = list[(num-1)-i];
//		}
//		
//		System.out.println("����");
//		for(int i = 0; i<list.length; i++) {
//			System.out.println("list2["+i+"] = "+list2[i]);
//		}		
		
//		System.out.print("��� ��: ");
//		int num = input.nextInt();
//		
//		int[] list = new int[num];
//		for(int i = 0; i<list.length; i++) {
//			System.out.print("list["+i+"] = ");
//			list[i] = input.nextInt();
//		}for (int i=0; i<num; i++) {
//			int rn1 = rnd.nextInt(num);
//			int rn2 = rnd.nextInt(num);
//			int t = list[rn1];
//			list[rn1] = list[rn2];
//			list[rn2] = t;
//		}
//		
//		System.out.println("����");
//		for(int i = 0; i<list.length; i++) {
//			System.out.println("list["+i+"] = "+list[i]);
//		}
	
//		System.out.print("10 ���� ��� ��: ");
//		int num = input.nextInt();
//		
//		int[] list = new int[num];
//		
//		for(int i = 0; i < list.length; i++) {
//			int j;
//			do {
//				list[i] = rnd.nextInt(10)+1;
//				for(j = 0; j < i; j++) {
//					if(list[i]==list[j])
//						break;
//				}
//			}while(j<i);	
//				
//				
//			}
//				
//		
//		for(int i = 0; i<list.length; i++) {		// �迭 Ȯ��
//			System.out.println("intList["+i+"] = "+list[i]);
//		}
			
		
//		System.out.print("��� ��: ");
//		int num = input.nextInt();
//				
//		int[] intList = new int[num];
//		intList[0] = rnd.nextInt(10)+1; // intList[0] ������ ����
//		
//		for(int i = 1; i<intList.length; i++) { // i�� 1���� �迭 ���� -1 ����
//			intList[i] = rnd.nextInt(10)+1; // intList[1] ������ ����
//			
//			while(intList[i-1] == intList[i]) {  // intList[i-1]�� intList[i]�� ������ while�� ����
//				intList[i] = rnd.nextInt(10)+1; // intList[i] ������ �ٸ������� ����
//			}
//		}
//		for(int i = 0; i<intList.length; i++) {		// �迭 Ȯ��
//			System.out.println("intList["+i+"] = "+intList[i]);
//		}
		
//		Scanner input = new Scanner(System.in);
//		Random rnd = new Random();
//		
//		System.out.print("��� ��: ");
//		int num = input.nextInt();
//		
//		int[] intList = new int[num];
//		for(int i = 0; i<intList.length; i++) {
//			intList[i] = rnd.nextInt(10)+1;
//			System.out.println("intList["+i+"] = "+intList[i]);
//		}
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("��� ��: ");
//		int num = input.nextInt();
//		
//		double[] doubleList = new double[num];
//		double sum = 0.0; 
//		
//		System.out.println("��ҁ��� �Է��ϼ���.");
//		for(int i = 0; i < doubleList.length; i++) {
//			System.out.print("doubleList["+i+"] = ");
//			double num2 = input.nextDouble();
//			doubleList[i] = num2;
//			
//			sum += doubleList[i];
//		}
//		System.out.println(sum);
//		System.out.println(sum/num);
		
//		Scanner input = new Scanner(System.in);
//
//		System.out.print("��� ��: ");
//		int num = input.nextInt();
//		
//		int[] intList = new int[num];
//		
//		System.out.println("��ҁ��� �Է��ϼ���.");
//		for(int i = 0; i < intList.length; i++) {
//			System.out.print("intList["+i+"] = ");
//			int num2 = input.nextInt();
//			intList[i] = num2;
//		}
//		for(int i = intList.length-1; i >= 0; i--) {
//			System.out.println("ã�� ���� ���� �Է��ϼ���.");
//			int search = input.nextInt();
//			
//			if (search == intList[i]) {
//				System.out.println("intList["+i+"] �� ��ġ�� �ֽ��ϴ�");
//				break;
//			}
//			else 
//				continue;
//		}
//		input.close();
		
		
//		System.out.print("��� ��: ");
//		int num = input.nextInt();
//		int[] scoreList = new int[num];
//		int sum = 0;
//		double avg = 0.0;
//		int max = 0;
//		int min = 0;
//		
//		System.out.println("������ �Է��ϼ���.");
//		for (int i = 0; i<scoreList.length; i++) {
//			System.out.print(i+1+"�� ����: ");
//			int score = input.nextInt();
//			scoreList[i] = score;
//			
//			sum += scoreList[i];
//			avg = sum/(num*1.0);
//			
//		}
//		System.out.println("�հ� : "+ sum);
//		System.out.println("��� : "+ avg);
//		
//		max = scoreList[0];
//		min = scoreList[0];
//		for (int i = 1; i<scoreList.length; i++) {
//			if (scoreList[i] - max > 0)
//				max = scoreList[i];
//			if (scoreList[i] - min < 0)
//				min = scoreList[i];
//			else
//				continue;			
//		}
//		System.out.println("�ִ밪 : " +max);
//		System.out.println("�ִ밪 : " +min);
		
		
//		System.out.print("��Ҽ� �Է�: ");
//		int num = input.nextInt();
//		int[] intList = new int[num];
//		
//		for(int i = 0; i < intList.length; i++) {
//			System.out.print("intList["+ i +"] = ");
//			int num2 = input.nextInt();
//			intList[i] = num2;
//		}
//		System.out.print("intList = { ");
//		for (int i = 0; i < intList.length; i++) {
//			if (intList.length-i == 1)
//				System.out.print(intList[i]+" }");
//			else
//				System.out.print(intList[i]+", ");	
//		}
		
		
//		int[] intlist = {5,4,3,2,1};
//		for (int i = 0;i <intlist.length; i++)
//			System.out.println(intlist[i]);
		
//		System.out.print("��Ҽ�: ");
//		int num = input.nextInt();
//		
//		int[] intList = new int[num];
//		
//		for(int z = 0; z<intList.length; z++) {
//			intList[z] = rnd.nextInt(10)+1;  		// ���� �� ����	
//		}
//		System.out.println("");
//		
//		for(int r = 10; r>0; r--) {
//			for(int i = 0; i<num; i++) {
//				if (r <= intList[i]) 
//					System.out.print("* ");
//				if(r > intList[i])
//					System.out.print("  ");
//			}
//			System.out.println("");
//		}
//		for(int i = 0; i <intList.length; i++ ) {
//			System.out.print("- ");	
//		}
//		System.out.println("");
//		for(int i = 0; i <intList.length; i++ ) {
//			System.out.print(intList[i]+" ");	
//		}
//		
//		double[] doubleList = new double[5];
//		for (int i = 0; i<doubleList.length; i++) {
//			doubleList[i] = 1.1 * (i+1);
//			System.out.printf("doubleList[%d] = ", i);
//			System.out.printf("%.1f \n", doubleList[i]);
//		}
//		
		
		
//		int[] intList = new int[5];
//		for (int i = 0; i<intList.length; i++) {
//			intList[i] =  5 - i;
//			System.out.printf("intList[%d] = ", i);
//			System.out.println(intList[i]);
//		}
		
		
//		double[] doubleList = new double[5];
//		for (int i = 0; i<doubleList.length; i++) {
//			System.out.printf("doubleList[%d] = ", i);
//			System.out.println(doubleList[i]);
//		}
				
//		Scanner sc = new Scanner(System.in);
//		Random rnd = new Random();
	
//		System.out.println("\"ABC\\n\"");
//		
		
			
//		float x = 0.0f;
//		for(float i = 0; i<=1000;i++) {
//			x = i/1000;
//			System.out.printf("%3.3f 		%9.7f\n", x, x*x);
//		}
		
//		float x = 0.0f;
//		for(int i = 0; i <=1000; i++) {
//			
//			System.out.printf("%9.7f		%9.7f\n", x, (float)i / 1000);
//			x += i/1000;
//		}
		
		
		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		int sum = num1+num2+num3;
//		System.out.println(sum);
//		System.out.println(sum/3f);
		
//		boolean b1 = true;
//		boolean b2 = false;
//		
//		b1 = sc.nextBoolean();
//		b2 = sc.nextBoolean();
//		System.out.println(b1);
//		System.out.println(b2);
		
//		float x = 0;
//		double y = 0;
//		
//		System.out.print("float �Է�: ");
//		x = sc.nextFloat();
//		System.out.print("double �Է�: ");
//		y = sc.nextDouble();
//		
//		System.out.println(x);
//		System.out.println(y);
		
		
		
//		System.out.print("������ �Է��Ͻÿ�");
//		int num = sc.nextInt();
//		
//		System.out.printf("8����: %o\n", num);
//		System.out.printf("16����: %x", num);
		
//		System.out.println("8���� 12�� 10������ "+012+"�Դϴ�");
//		System.out.println("10���� 12�� 10������ "+12+"�Դϴ�");
//		System.out.println("16���� 12�� 10������ "+0x12+"�Դϴ�");
		
//		int num = 0;
//		
//		int rndnum = rnd.nextInt(99);
//		System.out.println("���� ���߱� ���� ����!");
//		System.out.println("0���� 99������ ���ڸ� ���� ������");
//		for (int i = 1; i <=7; i++) {
//			System.out.print("���� �Է�");
//			num = sc.nextInt();
//			
//			if (num == rndnum) {
//				System.out.println(i+"ȸ���� ���߼̽��ϴ�");
//				break;
//			}
//			else if (num != rndnum) {
//				if (num<rndnum)
//					System.out.println("�� ū ���� �Դϴ�");
//				if (num>rndnum)
//					System.out.println("�� ���� ���� �Դϴ�");
//			}
//			System.out.println(7-i+"ȸ ���ҽ��ϴ�.");
//				
//		}
		
//		int num = 0;
//		int sum = 0;
//		System.out.println("������ ���մϴ�.");
//		
//		label:
//		for (int i = 1; i<=10; i++) {
////			if (num == 99999) 
////				break;
//			System.out.println(i+" �׷�");
//			
//			for(int j = 1; j<=5; j++) {
//				
//				System.out.print("����: ");
//				num = sc.nextInt();
////				if (num == 88888 || num == 99999)
////					break;
//				if (num == 88888) 
//					break;
//				if (num == 99999) 
//					break label;
//				
//				sum += num;
//			}
//		}
//		System.out.println("�հ�� "+sum+"�Դϴ�");
			
		
//		System.out.print("��� �Է��ұ��?: ");
//		cnt = sc.nextInt();
//		
//		for (int i = 0; i<cnt; i++) {
//			System.out.print("���� �Է�(����:0): ");
//			num = sc.nextInt();
//			
//			if (num == 0)
//				break;
//			
//			if (num<0) {
//				System.out.println("������ ������ �ʽ��ϴ�");
//				continue;
//			}
//			sum += num;
//			
//		}
//		System.out.println("�� : "+ sum);
//		System.out.println("��� : "+sum/cnt);
		
//		System.out.print("��� �Է��ұ��?: ");
//		cnt = sc.nextInt();
//		
//		for (int i = 0; i<cnt; i++) {
//			System.out.print("���� �Է�(����:0): ");
//			num = sc.nextInt();
//			
//			
//			if (sum+num>=1000) {
//				System.out.println("�հ谡 1000�� �Ѿ����ϴ�. ������ ���� �����մϴ�.");
////				sum -=num ;
//				break;
//			}sum += num;
//			
//		} 
//		System.out.println("�� : "+ sum);
//		System.out.println("��� : "+sum/cnt);
				
//		int i = 0;
//		while(i<cnt) {
//			System.out.print("���� �Է�(����:0): ");
//			num = sc.nextInt();
//			sum += num; 
//			i++;
//			if (num==0)
//				break;
//		}
//		System.out.println("�հ� : "+sum);
//		System.out.println("��� : "+(sum/cnt));		
				
//		int cnt = 0;
//		do {
//			System.out.print("���� �Է�: ");
//			num = sc.nextInt();	
//			for(int i = 1; i <= num; i++)
//				if (num%i == 0)
//					cnt++;
//			if(cnt == 2)
//				System.out.println(num+"�� �Ҽ��Դϴ�");
//			else
//				System.out.println(num+"�� �Ҽ��� �ƴմϴ�");
//		}while(num<=0);
//		
		
		
//		int cnt=1;
//		
//		for (int i = 1; i<=num; i++) {
//			for (int j = 0; j<num-i; j++)
//				System.out.print(" ");
//			for(int z = 1; z<=(i-1)*2+1 ; z++) {
//				if (cnt>=10)
//					cnt %= 10;
//				System.out.print(cnt);	
//			}
//			cnt++;
//			System.out.println("");
//		}
		
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
			
//		sc.close();
		
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
//		sc.close();
	
		
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
