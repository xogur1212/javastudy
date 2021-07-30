package test0730;

import java.util.Scanner;


class Human{
	String name;
	int rsp;
	public Human(String name) {
		this.name=name;
	}
}
class Computer{
	int rsp;
	public Computer() {
		
	}
	
}
public class test09 {
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		Human h1=new Human("철수");
		Computer c1=new Computer();
		while(true) {
			System.out.print("철수[가위(1),바위(2),보(3),끝내기(4)>>");
			h1.rsp=sc.nextInt();
			c1.rsp=(int) Math.floor(Math.random()*3+1);
			if(h1.rsp==1 ) {
				System.out.print("철수(가위) :");
				if(c1.rsp==1) {
					System.out.println(" 컴퓨터 :(가위)");
				}else if(c1.rsp==2) {
					System.out.println(" 컴퓨터 :(바위)");		
				}else if (c1.rsp==3) {
					System.out.println(" 컴퓨터 :(보)");
				}
				if(h1.rsp-c1.rsp ==0) {
					System.out.println("비겼습니다.");
				}else if(h1.rsp-c1.rsp ==1 || h1.rsp-c1.rsp==-2) {
					System.out.println(h1.name+"가 이겼습니다.");
				}else {
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}
			if(h1.rsp==2 ) {
				System.out.print("철수(바위) :");
				if(c1.rsp==1) {
					System.out.println(" 컴퓨터 :(가위)");
				}else if(c1.rsp==2) {
					System.out.println(" 컴퓨터 :(바위)");		
				}else if (c1.rsp==3) {
					System.out.println(" 컴퓨터 :(보)");
				}
				if(h1.rsp-c1.rsp ==0) {
					System.out.println("비겼습니다.");
				}else if(h1.rsp-c1.rsp ==1 || h1.rsp-c1.rsp==-2) {
					System.out.println(h1.name+"가 이겼습니다.");
				}else {
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}
			if(h1.rsp==3 ) {
				System.out.print("철수(보)  :");
				if(c1.rsp==1) {
					System.out.println(" 컴퓨터 :(가위)");
				}else if(c1.rsp==2) {
					System.out.println(" 컴퓨터 :(바위)");		
				}else if (c1.rsp==3) {
					System.out.println(" 컴퓨터 :(보)");
				}
				if(h1.rsp-c1.rsp ==0) {
					System.out.println("비겼습니다.");
				}else if(h1.rsp-c1.rsp ==1 || h1.rsp-c1.rsp==-2) {
					System.out.println(h1.name+"가 이겼습니다.");
				}else {
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}
			if(h1.rsp==4 ) {
				
				break;
			}
		
		}
		
	}
}
