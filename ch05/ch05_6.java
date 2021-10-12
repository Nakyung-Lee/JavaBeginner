package chapter03;

import java.util.Scanner;

public class ch05_6 {

	public static void main(String[] args) {
		System.out.print("숫자를 여러 개 입력 : ");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		for(int i=0;i<str.length();i++) {
			int n=(str.charAt(i)-'0');
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}

	#for문 ---> while문		
		int sc;
		int i=0;
		while(true) {
			sc=str.charAt(i)-'0';
			for (int k=0;k<sc;k++) {
				System.out.print("*");
			}
			System.out.printf("\n");
			if(++i>str.length()-1)
				break;
			sc=str.charAt(i);
		}

// 숫자를 여러 개 입력 : 5914
// *****
// *********
// *
// ****
