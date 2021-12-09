package chapter9;

public class ch09_01 {

	public static void main(String[] args) {
		String str = "    한글    ABCD   efgh   ";
		String result="";
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)!=' ')
				result+=str.substring(i,i+1);
        #result+=str.charAt(i);
		}
		System.out.println("원문자열 = > [" + str + "]");
		System.out.println("공백제거 문자열 = > [" + result + "]");
	}

}
