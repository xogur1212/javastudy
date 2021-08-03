package test0802;

import java.util.ArrayList;
import java.util.Scanner;

public class test02 {

	public static double average(double sum) {
		return sum/6;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a1= new ArrayList<String>();
		String grade[]=new String[6];
		int sum=0;
		double score=0;
		System.out.print("6개의 학점을 빈칸으로 분리입력(A/B/C/D/E/F)>>");
		
		
		//입력
		for (int i=0;i<6;i++) {
			grade[i]=sc.next();
			a1.add(grade[i]);
		}
		
		//조회
		
		for(int i=0;i<6;i++) {
		
			
			if(a1.get(i).equals("A")) {
				score=4.0;
			}
			else if(a1.get(i).equals("B")) {
				score=3.0;
			}
			else if(a1.get(i).equals("C")) {
				score=2.0;
			}
			else if(a1.get(i).equals("D")) {
				score=1.0;
			}
			else if(a1.get(i).equals("F")) {
				score=0;
			}
			
			sum+=score;
		}
		System.out.println(average(sum));
		
	}
}
