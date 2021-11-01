package chapter9;

import java.util.Scanner;

public class ch09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String result="";
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		str=s.nextLine();
		for (int i=0;i<str.length();i++) {
			char tmp=str.charAt(i);
			if (tmp >='A' && tmp <='Z')
				result+=str.valueOf(tmp).toLowerCase();
			else if (tmp >='a' && tmp <='z')
				result+=str.valueOf(tmp).toUpperCase();
			else
				result+=str.valueOf(tmp);
		}
		System.out.println("변환된 문자열 : " + result);
	}

}

//대문자->소문자 소문자->대문자
