package test0727;

import java.util.Scanner;

public class test09 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		int intArray[][]=new int[4][4];
		
	
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int randomMath=(int)(Math.random()*10+1);
				intArray[i][j]=randomMath;
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(intArray[i][j]+ "   ");
				
			}
			System.out.println("");
		}
		
	}
}
