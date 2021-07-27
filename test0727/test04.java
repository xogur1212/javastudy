package test0727;

import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=s.charAt(0);
		char f=c;
		System.out.println(c);
		
		for(int i=(int)'a'; i<=c;i++) {
			
		
			for(int j=(int)'a'; j<=f;j++) {
				System.out.print((char)j);
			}
			System.out.println("");
			f--;
		}
		
	}
}
