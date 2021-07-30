package test0730;

import java.util.Scanner;
import java.util.StringTokenizer;

class Change{
	String wantchange;
	public Change(String text) {
		this.wantchange=text;
	}
	public void changed(String before,String after) {
		wantchange=wantchange.replace(before, after);
	}
}
public class test11 {

	public static void main(String[] args) {
		System.out.print(">>");
		Scanner sc =new Scanner(System.in);
		String text;
		String totalchange=null;
		String before = null;
		String after = null;
		text=sc.nextLine();
		Change c1= new Change(text);
		System.out.print("명령: ");
		String change=sc.next();
		
		StringTokenizer s1=new StringTokenizer(change,"!");
		before=s1.nextToken();
		after=s1.nextToken();
		
		
		c1.changed(before, after);
		System.out.println(c1.wantchange);
		
		
		
		
		
	} 
}
