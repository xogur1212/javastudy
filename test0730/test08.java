package test0730;

import java.util.Scanner;

public class test08 {
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		Scanner sc=new Scanner(System.in);
		String text;
		text=sc.nextLine();
		sc.close();
		
		for(int i=0;i<text.length();i++) {
			String a=text.substring(0,1);
			String b=text.substring(1);
			text=b+a;
			System.out.println(text);
		}
	}
}
