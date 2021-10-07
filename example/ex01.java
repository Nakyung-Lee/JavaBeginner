package example;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		char ch;
		System.out.printf("첫번째 수를 입력하세요 : ");
		a=s.nextInt();
		System.out.printf("연산자를 입력하세요 : ");
		ch=s.next().charAt(0);
		System.out.printf("두번째 수를 입력하세요 : ");
		b=s.nextInt();
		if (ch=='+')
			System.out.print(a+b);
		if (ch=='-')
			System.out.print(a-b);
		if (ch=='*')
			System.out.print(a*b);
		if (ch=='/')
			System.out.printf("%f",a/(float)b);
		if (ch=='%')
			System.out.printf("%d %% %d = %d 입니다.",a,b,a%b);
	}

}
