package test0803;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		File f1=new File("d:\\target\\phone\\phone.txt");
		FileInputStream fis1;
		HashMap<String, String> h1= new HashMap<String, String>();
		int lineCount=0;
		
		try {
			FileReader fr1=new FileReader(f1);
			Scanner fScanner =new Scanner(fr1);
			fis1=new FileInputStream(f1);
			
			while(fScanner.hasNext()) {
				String line=fScanner.nextLine();
				int idx=line.lastIndexOf(" ");
				String name=line.substring(0,idx);
				String phone=line.substring(idx);
				h1.put(name,phone);
				lineCount++;
			}
			fScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("총" +lineCount+"개의 전화번호를 읽었습니다.");
		while(true) {
			
			System.out.print("이름>>");
			String findName=sc.next();
			if(findName.equals("그만")) {
				break;
			}
			System.out.println(h1.get(findName));
		
		}
		
		
		
				
	}
}
