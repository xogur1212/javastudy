package test0730;

import java.util.Scanner;

class Person{
	String name;
	int r1=1;
	int r2=2;
	int r3=3;
	public Person(String name) {
		this.name=name;
	}
	public void playgame() {
		System.out.println(name+" <Enter>");
		this.r1=(int)(Math.random()*3+1);
		this.r2=(int)(Math.random()*3+1);
		this.r3=(int)(Math.random()*3+1);
		
		
		
	}
	public void onemoregame() {
		System.out.print("	"+r1 + "  " + r2 + "  "+ r3 + "  ");
	}
}
public class test10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.print("1번째 선수 입력: ");
		name=sc.next();
		Person p1=new Person(name);
		System.out.print("2번째 선수 입력: ");
		name=sc.next();
		Person p2=new Person(name);
		while(true) {
			p1.playgame();
			sc.nextLine();
			p1.onemoregame();
			if(p1.r1 ==p1.r2 && p1.r2==p1.r3 && p1.r3 == p1.r1) {
				System.out.println(p1.name+ "님이 이겼습니다");
				break;
			}else if(p2.r1 ==p2.r2 && p2.r2==p2.r3 && p2.r3 == p2.r1) {
				System.out.println(p2.name+ "님이 이겼습니다");
				break;
			}
			else {
				System.out.println(" 아쉽군요!");
			}
			
			p2.playgame();
			sc.nextLine();
			p2.onemoregame();
			if(p1.r1 ==p1.r2 && p1.r2==p1.r3 && p1.r3 == p1.r1) {
				System.out.println(p1.name+ "님이 이겼습니다");
				break;
			}else if(p2.r1 ==p2.r2 && p2.r2==p2.r3 && p2.r3 == p2.r1) {
				System.out.println(p2.name+ "님이 이겼습니다");
				break;
			}
			else {
				System.out.println(" 아쉽군요!");
			}
			
			
			
				
			
		}
		
		
		
	}
}
