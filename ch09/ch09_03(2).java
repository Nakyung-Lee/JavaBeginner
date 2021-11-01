package chapter9;

public class ch09_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		System.out.println("** 로또 추첨을 시작합니다. **");
		int rand[]=new int[6];
		System.out.print("추첨된 로또 번호 : ");
		for (int i = 0; i < 6; i++) { // 1 ~ 45까지 랜덤 숫자 구하기 
			cnt=0;
			rand[i] = (int) (Math.random() * 45 + 1);
			for (int j=0;j<i;j++) {
				if (rand[i]==rand[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(rand[i] + " "); 		
		}		
	}

}
