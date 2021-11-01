package chapter9;

public class ch09_03 {

	static class mynum{
		String re="";
	}
	static int check(mynum str,int random) {
		int cnt=0;
		for(int i=0;i<str.re.length();i++) {
			System.out.println(i+" "+str.re.length());
			if (random==(int)(str.re.charAt(i)-48)) {
				cnt+=1;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mynum result = new mynum();
		int cnt=0;
		System.out.println("** 로또 추첨을 시작합니다. **");
		int n=6;
		//System.out.print("추첨된 로또 번호 : ");
		for (int i = 0; i < n; i++) { // 0 ~ 9까지 랜덤 숫자 구하기 
			System.out.println("n 값 : "+ n);
			cnt=0;
			int random = (int) (Math.random() * 10);
			cnt=check(result,random);
			if (cnt==0)
				result.re+=random;		
			else
				n+=1;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(result.re.charAt(i) + " "); 		
		}		
	}
}

//메소드를 활용하여 0~9 6개의 중복없는 랜덤숫자구하기
