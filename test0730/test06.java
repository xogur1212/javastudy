package test0730;

import java.util.Calendar;
import java.util.Scanner;

class timegame{

	int firsttime;
	int latetime;
	int count=0;
	int time;
	String name;
	public timegame(String name) {
		this.name=name;
		gamestart2(name);
		inputEnter();
		whenisten();
		inputEnter();
	} 
	
	public  int getSecond(Calendar cal) {
		
		int sec=cal.get(Calendar.SECOND);
		
		return sec;
	}
	public  void gamestart2(String name) {
		System.out.print(name+" 시작 <Enter>키>>");
	}
	public void whenisten() {
		System.out.print("10초 예상 후 <Enter>키 >>");
	}

	 void getTime() {
		Calendar now =Calendar.getInstance();
		int firsttime=getSecond(now);
		System.out.println("현재 초 시간  = " +firsttime);
		this.firsttime=firsttime;
	}
	public void getTime2() {
		Calendar now =Calendar.getInstance();
		int firsttime=getSecond(now);
		System.out.println("현재 초 시간  = " +firsttime);
		this.latetime=firsttime;
	}
	public void inputEnter() {
		Scanner sc =new Scanner(System.in);
		if(sc.nextLine() != null)
		{	
			if(count==0) {
				count++;	
				getTime();
			}
			else if(count==1) {
				getTime2();
			}
			
		
			
		}
	}

	public void currectten() {
		 time=Math.abs(latetime-firsttime);
		System.out.print(name+ "의 결과 " +time);
	
	}
	
	public int showTime() {
		return time;
	}
	
}
public class test06 {
	
	
	
	
	public static void main(String[] args) {
		System.out.println("10초에 가까운 사람이 이기는 게임 입니다.");
		timegame t1=new timegame("황기태");
		timegame t2=new timegame("이재문");
		t1.currectten();
		t2.currectten();
		if(t1.showTime() >t2.showTime()) {
			System.out.println(t1.name+"의 승리");
		}else if( 10-t1.showTime()<t2.showTime()) {
			System.out.println(t2.name+"의 승리");
		}else {
			System.out.println("비김");
		}
		
		
		
	}

}
