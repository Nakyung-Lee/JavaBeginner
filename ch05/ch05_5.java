
#s.next() -> 문자 또는 문자열을 공백을 기준으로 한단어 또는 한 문자씩 입력받는다
#s.nextLine() -> 문자 또는 문장 한라인 전체를 입력받는다

package chapter03;

import java.util.Scanner;

public class ch05_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력 : ");
		String str = s.nextLine();
		int a=0,b=0,c=0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)>='A' && str.charAt(i)<='Z')
				a+=1;
			else if (str.charAt(i)>='a' && str.charAt(i)<='z')
				b+=1;
			else if (str.charAt(i)>='0' && str.charAt(i)<='9')
				c+=1;
		}
		System.out.print("대문자 "+a+"개, 소문자 "+b+"개, 숫자 " + c + "개");
	}

}


# 문자열을 입력 : Korea 2021
# 대문자 1개, 소문자 4개, 숫자 4개
