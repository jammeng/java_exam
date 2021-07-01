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
	public static boolean confirmRetry() {
		int retry = 0;
		do {
			System.out.print("다시? yes:1, no:0");
			retry = input.nextInt();
		} while(retry != 1 && retry != 0);
		return retry == 1;
	}
	
	//7-11
	public static int[] pow2(int x, int y) {
		int[] arr = {x, x};
		
		for(int j=0; j<y; j++) {
			arr[0] *= 2;
		}
		for(int j=0; j<y; j++) {
			arr[1] /= 2;
		}
		return arr;
	}
	
	//7-12
	public static int rotateRight(int x, int n) {
		for(int j=0; j<n; j++) {
			x *= 2;
		}
		return x;
	}
	
	public static int rotateLeft(int x, int n) {
		for(int j=0; j<n; j++) {
			x /= 2;
		}
		return x;
	}
	
	//7-13
		public static void printBits(int x) {
			for(int i = 31 ; i >= 0; i--) {
//				System.out.print((x >>> i & 1) == 1? '1' : '0');
				if ((x >>> i & 1) == 1) {
					System.out.print('1');
				}
				else {
					System.out.print('0');
				}
				
			}
		}
		
		public static int set(int x , int pos) {
			return x|(1<<pos);
		}
		
		public static int reset(int x , int pos) {
			return x & ~(1<<pos);
		}
		
		public static int inverse(int x , int pos) {
			return x ^ (1<<pos);
		}
		
		//7-15
		public static int sumOf(int[] x) {
			int sum = 0;
			for (int i = 0; i<x.length; i++) {
				sum += x[i];
			}
			return sum;
		}
		
		//7-16
		public static int[] minOf(int[][] x) {
			int[] newarr = {x[0][0], x[0][1]};
			
			for (int i = 0; i<x.length; i++) {
				if (x[i][0] > newarr[0]) {
					newarr[0] = x[i][0];
				}
				if(x[i][1] < newarr[1]) {
					newarr[1] = x[i][1];
				} 
			}
			return newarr;
		}
	
	//-----------
	//7-17
	public static int linearSearch(int key, int[] arr) {
		for (int i=0; i<arr.length; i++) {
			if(arr[i] == key) 
				return i;			
		}
		return -1;
	}
	
	public static int linearSearchR(int key, int[] arr) {
		for (int i=arr.length-1; i>=0; i--) {
			if(arr[i] == key) 
				return i;			
		}
		return -1;
	}
	
	//7-18
	public static int[] aryRmv(int idx, int[] arr) {
		for (int i=idx; i<arr.length-1; i++) {
				arr[idx] = arr[idx+1];
		}return arr;
	}
	
	//7-20
	public static void insertArray(int innum, int idx, int[] arr) {
		if(idx>=0 && idx<arr.length) {
			for (int i=arr.length-1; i>idx; i--) {
				arr[i] = arr[i-1];

			}
			arr[idx] = innum;
		}

	}
	
	//7-21
	public static void exchangeArray(int[] arr1, int[] arr2) {

		int length = arr1.length;
		if (arr1.length > arr2.length)
			length = arr2.length;
		
		int[] mem = new int[length];
		for(int i=0; i<length; i++) {
			mem[i] = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = mem[i];
		}	
	}
	
	//7-22
	public static int[] cloneArray(int[] arr) {
		int[] cloneArr = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			cloneArr[i] = arr[i];
		}
		return cloneArr;
	}
	//7-23
	public static int[] removeArray(int[] arr, int pos) {
		if (pos < 0 || pos > arr.length) {
			return arr;
		} else {
			int[] removeArr = new int[arr.length - 1];
			int cnt = 0;
			for(int i = 0; i<arr.length; i++) {
				if (pos == i) { 
					cnt++; 
					continue;
				}
				
				if(cnt>0) { removeArr[i] = arr[i+1]; }
				else { removeArr[i] = arr[i]; }
			}
			return removeArr;
		}
	}
	
	//7-24
	public static int[] searchArrayIdx(int[] arr, int val) {
		int cnt = 0; // 검색하고자하는 값의 개수
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == val) {
				cnt++;
			}
		}
		int[] searchArr = new int[cnt]; //값의 개수만큼의 길이로 배열 생성
//--
//		int pos = 0; // 반환할 배열의 인덱스 값
//		for(int i = 0; i<arr.length; i++) {
//				if(arr[i] == val) {
//					searchArr[pos] = i;
//					pos++;
//				}
//		}
//--
		cnt--;
		for(int i = arr.length-1; cnt>=0; i-- ) {
			if(arr[i] == val) {
				searchArr[cnt] = i;
				cnt--;
			}
		}
		return searchArr;
	}
	
	public static void main(String[] args) {
		System.out.print("배열 arr의 요소수: ");
		int x = input.nextInt();
		int[] arr = new int[x];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("arr[%d]: ", i);
			arr[i] = input.nextInt();
		}
		
		System.out.print("배열 arr의 검색할 요소: ");
		int val = input.nextInt();
		
		
		System.out.println("해당 요소를 검색한 배열");
		int[] arr2 = searchArrayIdx(arr, val);
		 
		for(int i = 0; i<arr2.length; i++) {
			System.out.printf("arr2[%d]: %d \n", i, arr2[i]);
		}
	}
}