package test0727;

import java.util.Scanner;

public class test08 {
	public static void main(String[] args) {
		System.out.print("정수 몇개?");
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		int intArray[]=new int[total];
		
		for(int i=0; i<total;i++) {
		int randommath=(int)(Math.random()*100+1);
			intArray[i]=randommath;
			for(int j=0;j<i;j++) {
				if(intArray[i]==intArray[j])
				i--;
			}
		}
		for(int i=0; i<total;i++) {
		
				System.out.print(intArray[i]+" ");
			}
		
	}
}
