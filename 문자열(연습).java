package javabook.ch2;

import java.util.Scanner;

public class HelloWorld {	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str;
		str=s.nextLine();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}

package javabook.ch2;

import java.util.Scanner;

public class HelloWorld {	
	static int func() {
		return (int)(Math.random()*100);
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		
		int a[]=new int[6];//int형 배열 생성
		System.out.println("Lotto 숫자는 ? ");
		for(int i=0;i<6;i++) {
			a[i]=func();
		}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<6;j++) {
				if(a[i]==a[j]) {
					a[i]=func();
				}
			}
		}
		for(int i=0;i<6;i++) {
			System.out.print(a[i]+" " );
		}
	}

}
