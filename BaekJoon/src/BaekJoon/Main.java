package BaekJoon;

import java.util.Random;
import java.util.Scanner;

public class Main {
	// 18108
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int y = sc.nextInt();
//		sc.close();
//		System.out.println(y-543);

	// 1330
//public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int A=sc.nextInt();
//		int B=sc.nextInt();
//		
//		
//		if (A > B) {
//			System.out.println(">");
//		} else if (A < B) {
//			System.out.println("<");
//		} else if (A == B) {
//			System.out.println("==");
//		}
//}

	// 9498
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		
//		if (x>=90 && x<=100) {
//			System.out.println("A");
//		} else if (x >= 80 && x < 90) {
//			System.out.println("B");
//		} else if (x >= 70 && x < 80){
//			System.out.println("C");
//		} else if (x >= 60 && x < 70) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
//	}	

	// 2753
	// À±³âÀÌ¸é 1, ¾Æ´Ï¸é 0
	// À±³â=y/4=0 && y/100 != 0
	// À±³â=y/4=0 || y/400 == 0
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int y = sc.nextInt();
//		if (y%4 == 0 && y%100 !=0 || y%400 == 0) {
//			System.out.println("1");
//		} else {
//			System.out.println("0");
//		}
//	}
	// 2884
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int H = sc.nextInt();
//		int M = sc.nextInt();
//		sc.close();
//		if (H == 0 && M < 45) {
//			System.out.println("23" + " " + (M + 60 - 45));
//		} else if (M >= 45) {
//			System.out.println(H + " " + (M - 45));
//		} else if (M < 45) {
//			System.out.println((H - 1) + " " + (M + 60 - 45));
//		}
//	}
	// 11720
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		String strNum = sc.next();
//		
//		int sum=0;
//		
//		for (int i=0; i<strNum.length(); i++) {
////			charAtÀº stringÀ» ÇÏ³ªÇÏ³ª ³ª´²¼­ char Å¸ÀÔÀ¸·Î º¯È¯ÇØÁÜ!
////			System.out.println(strNum.charAt(i));
//			sum += Character.getNumericValue(strNum.charAt(i));
//		} System.out.println(sum);
//	}
	// 2908
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      String strNum1 = sc.next();
	      String strNum2 = sc.next();
	      
	      StringBuffer sr = new StringBuffer(strNum1);
	      StringBuffer sr2 = new StringBuffer(strNum2);
	      
	      String reverse = sr.reverse().toString();
	      String reverse2 = sr2.reverse().toString();
	      
	      if (Integer.parseInt(reverse)>Integer.parseInt(reverse2)) {
	         System.out.println(reverse);
	      } else if (Integer.parseInt(reverse)<Integer.parseInt(reverse2)) {
	         System.out.println(reverse2);
	      }
	   }
}
