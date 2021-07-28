package test0728;

import java.util.Scanner;

class Day{
	public Day() {
		
	}
	private String work;
	public void set (String work) {this.work=work;}
	public String get() {return work;}
	public void show() {
		if(work ==null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
	
}
public class MonthSchedule {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Day[] d1=new Day[30];
		for(int i=1;i<30;i++)
		d1[i]=new Day();
		int donum;
		int day;
		String[] dolist =new String[30];
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true) {
			System.out.print("할일 (입력: 1, 보기:2, 끝내기:3 >>");
			donum=sc.nextInt();
			
		
			if(donum==1) {
				System.out.print("날짜(1~30)?");
				day=sc.nextInt();
				System.out.print("할일(빈칸없이입력)?");
				dolist[day]=sc.next();
				
				d1[day].set(dolist[day]);
			}else if(donum==2) {
				System.out.print("날짜(1~30)?");
				day=sc.nextInt();
				System.out.print(day+"의 할일은 ");
				d1[day].show();
				
				
			}else if(donum==3) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
