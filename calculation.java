package javabook.ch2;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		int a,b;
		int result;

		Scanner s=new Scanner(System.in);
		//Scanner의 객체 생성
		
		System.out.print("첫번째 값을 입력하세요 ==> ");
		a=s.nextInt(); // 입력
		
		System.out.print("두번째 값을 입력하세요 ==> ");
		b=s.nextInt();
		
		result=a+b;
		System.out.println(a+"+"+b+"="+result); // 출력 
		//연산자 출력 할 때 " " 안에 작성
		result=a-b;
		System.out.println(a+"-"+b+"="+result);
		result=a*b;
		System.out.println(a+"*"+b+"="+result);
		result=a/b;
		System.out.println(a+"/"+b+"="+result);
	}

}
