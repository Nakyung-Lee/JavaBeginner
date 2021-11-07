package chapter9;

import java.util.Scanner;

public class ch09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String result="";
		int diff = 'a' - 'A';//소문자 대문자 차이
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		str=s.nextLine();
		for (int i=0;i<str.length();i++) {
			char tmp=str.charAt(i);
			if (tmp >='A' && tmp <='Z')
				result+=(char)(tmp+diff);
			else if (tmp >='a' && tmp <='z')
				result+=(char)(tmp-diff);
			else
				result+=(char)tmp;
		}
		System.out.printf("변환된 문자열 : %s \n" , result);
	}

}
