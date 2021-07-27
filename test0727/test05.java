package test0727;

import java.util.Scanner;

public class test05 {
	public static void main(String[] args) {
		System.out.println("양의 정수 10개 입력하세요");
		int intArray[]=new int[10];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<10;i++) {
			intArray[i]=sc.nextInt();
		}
		System.out.print("3의 배수는");
		for(int i=0;i<10;i++) {
			if(intArray[i]%3==0) {
				System.out.print(intArray[i]+ " " );
				
			}
				
		}
		

		
	}
}
