package test0802;

import java.util.Scanner;
import java.util.Vector;

public class test04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int precipitation; //강수량
		int sum=0;
		int average;
		Vector<Integer> v1= new Vector<Integer>();
		while(true) {
		System.out.println("강수량 입력 (0 입력시 종료 )>>");
		precipitation=sc.nextInt();
		if(precipitation==0) break;
		v1.add(precipitation);
		for(int i=0;i<v1.size();i++) {
			System.out.print(v1.get(i)+ " ");
			sum+=v1.get(i);
			
		}
		
		
		System.out.println("현재 평균" + (sum/v1.size()));
		sum=0;
		}
	}
}
