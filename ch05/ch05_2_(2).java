package chapter03;

public class ch05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<128;i++) {
			if (i%16==0) {
				System.out.print("-------------------------\n");
				System.out.print("10진수\t16진수\t문자\n");
				System.out.print("-------------------------\n");
			}
			System.out.printf("%8d    %x    %8c\n",i,i,i);
		}
	}

}


// -------------------------
// 10진수	16진수	문자
// -------------------------
//      48    30           0
//      49    31           1
//      50    32           2
