package chapter9;

import java.util.Scanner;

public class ch09_01 {

	public static void main(String[] args) {
		String str;
		String result="";
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		str=s.nextLine();
		for (int i=str.length()-1;i>=0;i--) {
			result+=str.charAt(i);
		}
		System.out.println("내용을 거꾸로 출력 : " + result);
		
	}

}
