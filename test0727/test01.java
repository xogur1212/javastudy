package test0727;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
	
		int sum=0; 
		
		for(int i=0;i<100;i++) {
			sum+=i;
			i+=2;
		}
		System.out.println(sum);
	}
}
