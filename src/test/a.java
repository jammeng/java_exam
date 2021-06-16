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
 		
 		System.out.println("arr1 입력");
 		for(int i=0; i<4; i++) {
 			for(int j=0; j<3; j++) {
 				System.out.print("arr1["+i+"]["+j+"]");
 				arr1[i][j] = input.nextInt();
 			}
 		}
 		System.out.println("arr2 입력");
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
// 		System.out.println("arr1 입력");
// 		for(int i=0; i<2; i++) {
// 			for(int j=0; j<2; j++) {
// 				System.out.print("arr1["+i+"]["+j+"]");
// 				arr1[i][j] = input.nextInt();
// 			}
// 		}
// 		System.out.println("arr2 입력");
// 		for(int i=0; i<2; i++) {
// 			for(int j=0; j<2; j++) {
// 				System.out.print("arr2["+i+"]["+j+"]");
// 				arr2[i][j] = input.nextInt();
// 			}
// 		}
// 		//곱
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
//        System.out.println("답");
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.println(arr3[i][j]);
//			}
//		}
			
//		int stop = 1;
//
//		String[] day = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
//		String[] day2 = {"일","월","화","수","목","금","토"};
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
//				System.out.println("해당 요일의 영단어입력 (소문자)");   
//				
//				System.out.print(day2[rn_day]+"요일 : ");
//				String str = input.next();
//				
//				if(day[rn_day].equals(str)){
//					System.out.print("정답입니다. 다시하시겠습니까? (yes:1, no:0)");
//					stop = input.nextInt();
//					continue retry;
//				}
//				else {
//					System.out.println("떙!");	
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
//				System.out.println("해당 월의 영단어입력 (첫글자는 대문자 나머지는 소문자)");
//				
//				System.out.print(rn_month+1+"월 : ");
//				String str = input.next();
//				
//				if(month[rn_month].equals(str)){
//					System.out.print("정답입니다. 다시하시겠습니까? (yes:1, no:0)");
//					stop = input.nextInt();
//					continue retry;
//				}
//				else {
//					System.out.println("떙!");	
//					continue err;
//				}
//			}
//		}
		
//		System.out.print("요소 수: ");
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
//		System.out.println("역순");
//		for(int i = 0; i<list.length; i++) {
//			System.out.println("list2["+i+"] = "+list2[i]);
//		}		
		
//		System.out.print("요소 수: ");
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
//		System.out.println("셔플");
//		for(int i = 0; i<list.length; i++) {
//			System.out.println("list["+i+"] = "+list[i]);
//		}
	
//		System.out.print("10 이하 요소 수: ");
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
//		for(int i = 0; i<list.length; i++) {		// 배열 확인
//			System.out.println("intList["+i+"] = "+list[i]);
//		}
			
		
//		System.out.print("요소 수: ");
//		int num = input.nextInt();
//				
//		int[] intList = new int[num];
//		intList[0] = rnd.nextInt(10)+1; // intList[0] 랜덤값 대입
//		
//		for(int i = 1; i<intList.length; i++) { // i는 1부터 배열 길이 -1 까지
//			intList[i] = rnd.nextInt(10)+1; // intList[1] 랜덤값 대입
//			
//			while(intList[i-1] == intList[i]) {  // intList[i-1]과 intList[i]이 같을때 while문 실행
//				intList[i] = rnd.nextInt(10)+1; // intList[i] 랜덤값 다를때까지 대입
//			}
//		}
//		for(int i = 0; i<intList.length; i++) {		// 배열 확인
//			System.out.println("intList["+i+"] = "+intList[i]);
//		}
		
//		Scanner input = new Scanner(System.in);
//		Random rnd = new Random();
//		
//		System.out.print("요소 수: ");
//		int num = input.nextInt();
//		
//		int[] intList = new int[num];
//		for(int i = 0; i<intList.length; i++) {
//			intList[i] = rnd.nextInt(10)+1;
//			System.out.println("intList["+i+"] = "+intList[i]);
//		}
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("요소 수: ");
//		int num = input.nextInt();
//		
//		double[] doubleList = new double[num];
//		double sum = 0.0; 
//		
//		System.out.println("요소겂를 입력하세요.");
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
//		System.out.print("요소 수: ");
//		int num = input.nextInt();
//		
//		int[] intList = new int[num];
//		
//		System.out.println("요소겂를 입력하세요.");
//		for(int i = 0; i < intList.length; i++) {
//			System.out.print("intList["+i+"] = ");
//			int num2 = input.nextInt();
//			intList[i] = num2;
//		}
//		for(int i = intList.length-1; i >= 0; i--) {
//			System.out.println("찾고 싶은 값를 입력하세요.");
//			int search = input.nextInt();
//			
//			if (search == intList[i]) {
//				System.out.println("intList["+i+"] 에 위치해 있습니다");
//				break;
//			}
//			else 
//				continue;
//		}
//		input.close();
		
		
//		System.out.print("사람 수: ");
//		int num = input.nextInt();
//		int[] scoreList = new int[num];
//		int sum = 0;
//		double avg = 0.0;
//		int max = 0;
//		int min = 0;
//		
//		System.out.println("점수를 입력하세요.");
//		for (int i = 0; i<scoreList.length; i++) {
//			System.out.print(i+1+"번 점수: ");
//			int score = input.nextInt();
//			scoreList[i] = score;
//			
//			sum += scoreList[i];
//			avg = sum/(num*1.0);
//			
//		}
//		System.out.println("합계 : "+ sum);
//		System.out.println("평균 : "+ avg);
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
//		System.out.println("최대값 : " +max);
//		System.out.println("최대값 : " +min);
		
		
//		System.out.print("요소수 입력: ");
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
		
//		System.out.print("요소수: ");
//		int num = input.nextInt();
//		
//		int[] intList = new int[num];
//		
//		for(int z = 0; z<intList.length; z++) {
//			intList[z] = rnd.nextInt(10)+1;  		// 랜덤 값 대입	
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
//		System.out.print("float 입력: ");
//		x = sc.nextFloat();
//		System.out.print("double 입력: ");
//		y = sc.nextDouble();
//		
//		System.out.println(x);
//		System.out.println(y);
		
		
		
//		System.out.print("정수를 입력하시오");
//		int num = sc.nextInt();
//		
//		System.out.printf("8진수: %o\n", num);
//		System.out.printf("16진수: %x", num);
		
//		System.out.println("8진수 12는 10진수로 "+012+"입니다");
//		System.out.println("10진수 12는 10진수로 "+12+"입니다");
//		System.out.println("16진수 12는 10진수로 "+0x12+"입니다");
		
//		int num = 0;
//		
//		int rndnum = rnd.nextInt(99);
//		System.out.println("숫자 맞추기 게임 시작!");
//		System.out.println("0부터 99사이의 숫자를 맞춰 보세요");
//		for (int i = 1; i <=7; i++) {
//			System.out.print("숫자 입력");
//			num = sc.nextInt();
//			
//			if (num == rndnum) {
//				System.out.println(i+"회만에 맞추셨습니다");
//				break;
//			}
//			else if (num != rndnum) {
//				if (num<rndnum)
//					System.out.println("더 큰 숫자 입니다");
//				if (num>rndnum)
//					System.out.println("더 작은 숫자 입니다");
//			}
//			System.out.println(7-i+"회 남았습니다.");
//				
//		}
		
//		int num = 0;
//		int sum = 0;
//		System.out.println("정수를 더합니다.");
//		
//		label:
//		for (int i = 1; i<=10; i++) {
////			if (num == 99999) 
////				break;
//			System.out.println(i+" 그룹");
//			
//			for(int j = 1; j<=5; j++) {
//				
//				System.out.print("정수: ");
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
//		System.out.println("합계는 "+sum+"입니다");
			
		
//		System.out.print("몇개를 입력할까요?: ");
//		cnt = sc.nextInt();
//		
//		for (int i = 0; i<cnt; i++) {
//			System.out.print("정수 입력(종료:0): ");
//			num = sc.nextInt();
//			
//			if (num == 0)
//				break;
//			
//			if (num<0) {
//				System.out.println("음수는 더하지 않습니다");
//				continue;
//			}
//			sum += num;
//			
//		}
//		System.out.println("합 : "+ sum);
//		System.out.println("평균 : "+sum/cnt);
		
//		System.out.print("몇개를 입력할까요?: ");
//		cnt = sc.nextInt();
//		
//		for (int i = 0; i<cnt; i++) {
//			System.out.print("정수 입력(종료:0): ");
//			num = sc.nextInt();
//			
//			
//			if (sum+num>=1000) {
//				System.out.println("합계가 1000을 넘었습니다. 마지막 값은 무시합니다.");
////				sum -=num ;
//				break;
//			}sum += num;
//			
//		} 
//		System.out.println("합 : "+ sum);
//		System.out.println("평균 : "+sum/cnt);
				
//		int i = 0;
//		while(i<cnt) {
//			System.out.print("정수 입력(종료:0): ");
//			num = sc.nextInt();
//			sum += num; 
//			i++;
//			if (num==0)
//				break;
//		}
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+(sum/cnt));		
				
//		int cnt = 0;
//		do {
//			System.out.print("정수 입력: ");
//			num = sc.nextInt();	
//			for(int i = 1; i <= num; i++)
//				if (num%i == 0)
//					cnt++;
//			if(cnt == 2)
//				System.out.println(num+"은 소수입니다");
//			else
//				System.out.println(num+"은 소수가 아닙니다");
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
//			System.out.print("월 입력: ");
//			num = sc.nextInt();	
//		}while(num > 12 || num <= 0);
//		
//		switch (num) {
//		case 3,4,5: {
//			System.out.println("봄");
//		}
//		case 6,7,8: {
//			System.out.println("여름");
//			
//		}
//		case 9,10,11: {
//			System.out.println("가을");
//		}
//		case 12,1,2: {
//			System.out.println("겨울");
//		}
//		}
		
		
//		System.out.print("개수: ");
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
//		System.out.print("최소값: ");
//		min = sc.nextInt();
//		System.out.print("최대값: ");
//		max = sc.nextInt();
//		System.out.print("증가값: ");
//		temp = sc.nextInt();
//		
//		System.out.println("신장 | 표준체중");
//		for (; min<=max;) {
//			double avg = (min - 100) * 0.9;
//			System.out.println(min + " | "+ avg);
//			min += temp;
//		}
		
//		int cnt = 0;
//		do {
//			System.out.print("입력:");
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
//			System.out.print("양의 정수:");
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
//			System.out.println("양의 정수:");
//			num = sc.nextInt();
//		}while( num <= 0);
//		
//		int cnt = 0;
//		while(num > 0) {
//			num /= 10;
//			cnt ++;
//		}
//		System.out.println("입력하신 숫자는 "+cnt+" 자리입니다");
				
//		for (int i = 1 ; i <= num; i ++) {
//			if (i % 2 != 0)
//				System.out.print("*");
//			if (i % 2 == 0)
//				System.out.print("+");
//		}
//			
		
//		System.out.print("몇개를 표시할까요? : ");
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
		
		
		
//		System.out.print("정수 를 입력하세요. : ");
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
		
//		System.out.print("정수 를 입력하세요. : ");
//		int inp1 = sc.nextInt();
//		
//		System.out.print("정수 를 입력하세요. : ");
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
//			System.out.print("예상 숫자를 입력하세요. : ");
//			int inp = sc.nextInt();
//			
//			if (num > inp) {
//				System.out.println("입력한 수보다 큰 수 입니다");
//			}
//			else if(num < inp) {
//				System.out.println("입력한 수보다 작은 수 입니다");
//			}
//			else {
//				System.out.println("정답입니다");
//				collect = 1;
//			}
//		}while (collect == 0); 
		
//		int x;
//		
//		do {
//			System.out.println("입력");
//			x = sc.nextInt();
//			
//		}while(x < 100 || x> 999);
//		System.out.println("값은 "+ x);
//		
		
		
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
