package test0803;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		File file = new File("C:\\temp\\phone.txt");
		FileWriter fw = null;
		Scanner sc =new Scanner(System.in);
		String text = "f";
		System.out.println("전화번호 입력 프로그램입니다.");
		//ArrayList al=new ArrayList();
		try {
			fw=new FileWriter(file);
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		while(true) {
			System.out.print("이름 전화번호 >>");
			text=sc.nextLine();
			if(text.equals("그만"))break;
			try {
				fw.write(text,0,text.length());
				fw.write("\t\n",0,2);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		try {
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(file.getPath()+"에 저장했습니다.");
		
		
	
		
	}
}
