#문자열 담을 배열 새로 생성
#split
package chapter03;

import java.util.Scanner;

public class ch05_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str;
		String[] st;
		System.out.printf("글자를 입력 : ");
		str=s.next();
		st=str.split("");
		System.out.printf("입력한 문자열 ==> %s \n", str);
		int j=0;
		System.out.printf("변환된 문자열 ==> ");
		for (int i=str.length()-1;i>=0;i--) {
			System.out.print(st[i]);
		}	
	}

}

#charAt
package chapter03;

import java.util.Scanner;

public class ch05_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str;
		System.out.printf("글자를 입력 : ");
		str=s.next();
		System.out.printf("입력한 문자열 ==> %s \n", str);
		int j=0;
		System.out.printf("변환된 문자열 ==> ");
		for (int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}	
	}

}
