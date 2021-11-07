package chapter9;

public class ch09_03 {
	
	static short getNumber() {
		return (short) (Math.random()*45+1);
		//1~45까지의 숫자만 사용하므로 큰 버위 필요 없어서 short 사용 + return 필용
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		System.out.println("** 로또 추첨을 시작합니다. **");
		short rand[]= {0,0,0,0,0,0};
		short num;
		char dupl = 'N';
		System.out.print("추첨된 로또 번호 : ");
		for (int i = 0; i < 6; i++) {
			num=getNumber();
			for (int k = 0; k < 6; k++) { // 1 ~ 45까지 랜덤 숫자 구하기 
				if (rand[k]==num)
					dupl='Y';
			}
			if (dupl=='N')
				rand[i]=num;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(rand[i] + " "); 		
		}		
	}

}
