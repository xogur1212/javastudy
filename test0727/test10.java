package test0727;

import java.util.Scanner;

public class test10 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		int intArray[][]=new int[4][4];
		int count=0;
		
	
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				int randomMath=(int)(Math.random()*10+1);
				intArray[i][j]=randomMath;
			}
		}

		
		
	
		for(int i=0;i<6;i++) {
			
				int randomMathx=(int)(Math.random()*3);
				int randomMathy=(int)(Math.random()*3);
				if(intArray[randomMathx][randomMathy]==0) {
					i--;
				}
					
				intArray[randomMathx][randomMathy]=0;
				
				
			}
		
			
			
			
		
				
			
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(intArray[i][j]+ "   ");
				
			}
			System.out.println("");
		}
		
	}
}
