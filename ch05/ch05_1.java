package chapter03;

public class ch05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=9; i++){
			System.out.print("#제"+i+"단#\t"); // \t 칸 간격 벌림
		}
		System.out.print("\n\n");
		for(int i=1; i<=9; i++){
			for(int j=2; j<=9; j++){
				System.out.printf("%dX %d=%2d ",j,i,j*i);
			}System.out.println();
		}
	}

}

		// 배열로 값 저장하고 한번에 출력
		int aa[][]=new int[10][10];
		
		for (int i=2;i<10;i++) {
			for (int j=2;j<10;j++){
				aa[j][i]=i*j;
			}
		}
		for (int i=2;i<10;i++) {
			for (int j=2;j<10;j++){
				System.out.printf("%dX%d= %2d  ",j,i,aa[j][i]);
			}
			System.out.println();
		}

// #제2단# #제3단# #제4단# #제5단# #제6단# #제7단# #제8단# #제9단#
// 2X 1= 2 3X 1= 3 4X 1= 4 5X 1= 5 6X 1= 6 7X 1= 7 8X 1= 8 9X 1= 9
// 2X 2= 4 3X 2= 6 4X 2= 8 5X 2=10 6X 2=12 7X 2=14 8X 2=16 9X 2=18
// 2X 3= 6 3X 3= 9 4X 3=12 5X 3=15 6X 3=18 7X 3=21 8X 3=24 9X 3=27
// 2X 4= 8 3X 4=12 4X 4=16 5X 4=20 6X 4=24 7X 4=28 8X 4=32 9X 4=36
// 2X 5=10 3X 5=15 4X 5=20 5X 5=25 6X 5=30 7X 5=35 8X 5=40 9X 5=45
// 2X 6=12 3X 6=18 4X 6=24 5X 6=30 6X 6=36 7X 6=42 8X 6=48 9X 6=54
// 2X 7=14 3X 7=21 4X 7=28 5X 7=35 6X 7=42 7X 7=49 8X 7=56 9X 7=63
// 2X 8=16 3X 8=24 4X 8=32 5X 8=40 6X 8=48 7X 8=56 8X 8=64 9X 8=72
// 2X 9=18 3X 9=27 4X 9=36 5X 9=45 6X 9=54 7X 9=63 8X 9=72 9X 9=81
