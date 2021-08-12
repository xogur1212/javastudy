package thread;

import java.util.Scanner;

class TimeThread extends Thread{
	int n=0;
	
	public void run() {
		System.out.println("쓰레드시작");
		for(n=1;n<11;n++) {
			System.out.print(n+" ");
			try {
				sleep(1000);
		}
			catch(InterruptedException e) {
				return ;
		}
			System.out.println("쓰레드 종료");
		}
	}
}

public class Test01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("아무키나 입력");
		sc.next();
		TimeThread th=new TimeThread();
		th.start();
	}
}
