package test0729;

import java.util.Scanner;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
	
}
class StringStack implements Stack{

	String str[];
	int number;
	
	public StringStack(int a) {
		str=new String[a];
		this.number=a;
	}
	public String[] getStr() {
		return str;
	}

	public void setStr(String[] str) {
		this.str = str;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return number;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean push(String val) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
public class test09 {
	public static void main(String[] args) {
		
		System.out.print("총 스택 저장 공간의 크기 입력 >>");
		Scanner sc =new Scanner(System.in);
		
		
		int a=sc.nextInt();
		int i=0;
		StringStack s1=new StringStack(a);
		String aa=null;
		
		
		while(true) {
			System.out.print("문자열 입력 >>");
			if( i<a) {
				s1.str[i]=sc.next();
				i++;
			}
			else if( i==a) {
				aa=sc.next();
				if(aa.equals("그만")) {
				System.out.print("스택에 저장된 모든 문자열 팝: ");
				for(int j=0; j<s1.str.length;j++) {
					System.out.print(s1.str[j]);
				}
				break;
				}
				else {
					System.out.println("스택이 꽉차서 푸시 불가");
				}
				
				
				
				
				
			
			}
			
			
				
		
		}
		
		
		
		
	}
}
