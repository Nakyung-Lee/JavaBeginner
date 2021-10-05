package chapter03;

public class ch05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0;
		for (int i=64; i<=95;i++) {
			if (j%16==0) {
				System.out.print("-------------------\n");
				System.out.print("10진수\t16진수\t문자\n");
				System.out.print("-------------------\n");
				j=0;
			}
			j+=1;
			System.out.printf("%d\t%x\t%c\n",i,i,i);
		}
	}

}



# -------------------
# 10진수	16진수	문자
# -------------------
# 64	40	@
# 65	41	A
# 66	42	B
# 67	43	C
# 68	44	D
# 69	45	E
# 70	46	F
# 71	47	G
# 72	48	H
# 73	49	I
# 74	4a	J
# 75	4b	K
# 76	4c	L
# 77	4d	M
# 78	4e	N
# 79	4f	O
# -------------------
# 10진수	16진수	문자
# -------------------
# 80	50	P
# 81	51	Q
# 82	52	R
# 83	53	S
# 84	54	T
# 85	55	U
# 86	56	V
# 87	57	W
# 88	58	X
# 89	59	Y
# 90	5a	Z
# 91	5b	[
# 92	5c	\
# 93	5d	]
# 94	5e	^
# 95	5f	_
