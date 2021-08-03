package test0802;

import java.util.Scanner;
import java.util.Vector;

public class test01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int big=0;
		//String b=null;
		Vector<Integer> v1= new Vector<Integer>();
		System.out.print("정수(-1이 입력될 떄까지)");
		while(a!=-1){
			
			
			a=sc.nextInt();
			v1.add(a);
			
			
		}
		for (int i=0;i<v1.size();i++) {
			
					if(big<v1.get(i))
						big=v1.get(i);
		}
		System.out.println("가장 큰수는 : "+ big);
	}
}
