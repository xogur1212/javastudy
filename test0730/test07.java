package test0730;

import java.util.Scanner;
import java.util.StringTokenizer;



public class test07 {
	
	String sentence;
	public test07() {
		
	}
	public void input() {
		Scanner sc =new Scanner(System.in);
		sentence=sc.nextLine();
		//sc.close();
	}
		public static void main(String[] args) {
			test07 t1=new test07();
		
			
			while(true) {
				t1.input();
				StringTokenizer st= new StringTokenizer(t1.sentence);
				int n=st.countTokens();
				if(t1.sentence.equals("그만")) {
					System.out.println("종료합니다..");
					break;
				}
				System.out.println("어절 갯수는 "+n);
				
					
				
				
			}
		}
}
