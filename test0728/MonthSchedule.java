package test0728;

import java.util.Scanner;

class Day{
	public Day() {
		
	}
	private String work;
	public void set (String work) {this.work=work;}
	public String get() {return work;}
	public void show() {
		if(work ==null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
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
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while(true) {
			System.out.print("���� (�Է�: 1, ����:2, ������:3 >>");
			donum=sc.nextInt();
			
		
			if(donum==1) {
				System.out.print("��¥(1~30)?");
				day=sc.nextInt();
				System.out.print("����(��ĭ�����Է�)?");
				dolist[day]=sc.next();
				
				d1[day].set(dolist[day]);
			}else if(donum==2) {
				System.out.print("��¥(1~30)?");
				day=sc.nextInt();
				System.out.print(day+"�� ������ ");
				d1[day].show();
				
				
			}else if(donum==3) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
