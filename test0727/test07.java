package test0727;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		int intArray[]= new int[10]; 
		float total=0;
		for(int j=0;j<10;j++) {
			int i =(int)(Math.random()*10+1); //1부터 10까지
			intArray[j]=i;
		}
		System.out.print("랜덤한 정수들 : ");
		
		for(int j=0;j<10;j++) {
			System.out.print(intArray[j]+" ");
			total+=intArray[j];
		}
		System.out.println("");
		System.out.println("평균은 : "+ total/intArray.length);
	}
}
