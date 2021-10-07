package example;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		char ch;
		String[] str;
		System.out.printf("수식을 한줄로 띄어쓰기로 입력하세요 : ");
		str=s.nextLine().split(" "); //공백까지 포함해서 입력받는다 + 공백을 기준으로 잘라서 str 배열에 저장
		
		a= Integer.parseInt(str[0]); //숫자로 변환
		ch=str[1].charAt(0); //str(1)에 있는 문자열에서 첫번째 문자 잘라서 저장
		b=Integer.parseInt(str[2]);
		
		switch (ch) {
		case '+':
			System.out.printf("%d + %d = %d 입니다.\n",a,b,a+b);
			break;
		case '-':
			System.out.print(a-b);
			break;
		case '*':
			System.out.print(a*b);
			break;
		case '/':
			System.out.print(a/(float)b);
			break;
		case '%':
			System.out.print(a-b);
			break;
		default:
			System.out.print("연산자를 잘못 입력했습니다.");
		}
		
	}

}
