package chapter03;

import java.util.Scanner;

public class ch05_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("합계의 시작값 ==> ");
		int start = s.nextInt();
		System.out.print("합계의 끝값 ==> ");		
		int end = s.nextInt();
		System.out.print("배수 ==> ");
		int mul = s.nextInt();
		int total=0;
		for (int i=start;i<=end;i++) {
			if (i%mul==0)
				total+=i;
		}
		System.out.print(start+"부터 "+ end+"까지의 "+mul+"배수의 합계 ==> "+total);
	}

}


	for (int i=start;i<=end;i++) {
			if (i%mul==0)
				total+=i;
		}
----->  while(i<=end){
		if (i%mul==0)
			total+=i;
		i++;
	}


# 합계의 시작값 ==> 100
# 합계의 끝값 ==> 200
# 배수 ==> 4
# 100부터 200까지의 4배수의 합계 ==> 3900
