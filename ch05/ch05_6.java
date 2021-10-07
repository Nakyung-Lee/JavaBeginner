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

// 숫자를 여러 개 입력 : 5914
// *****
// *********
// *
// ****
