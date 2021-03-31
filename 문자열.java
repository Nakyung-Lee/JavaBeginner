#C언어
#pragma warning(disable:4996)
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main() {
	char* str;
	int a = 0, b = 0, c = 0;
	str = (char*)calloc(1000, sizeof(char));
	gets(str);
	for (int i = 0; i <= strlen(str); i++) {
		if (str[i] >= 'A' && str[i] <= 'Z')
			a++;
		if (str[i] >= 'a' && str[i] <= 'z')
			b++;
		if (str[i] >= '0' && str[i] <= '9')
			c++;
	}
	printf("대문자 %d개, 소문자 %d개, 숫자 %d개\n",a,b,c);
}

#java
package javabook.ch2;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str;
		int a=0,b=0,c=0;
		str=s.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				a++;
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				b++;
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				c++;
		}
		System.out.println("대문자" +a +"개," + "소문자" + b +"개," + "숫자"+ c+"개");
		
		
	}

}
