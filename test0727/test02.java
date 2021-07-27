package test0727;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		int total=number;
		for(int i=0;i<number;i++) 
		{
			for(int j=0;j<total;j++) 
			{
				System.out.print("*");
			}
		System.out.println("");
		total--;
		
		}	
	
	}
}
