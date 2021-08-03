package test0803;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fileName1;
		String fileName2;
		System.out.println("경로도 같이 입력하세요");
		System.out.print("파일 경로를 작성하세요");
		fileName1=sc.next();
		System.out.print("파일 경로를 작성하세요");
		fileName2=sc.next();
		File f1=new File(fileName1);
		File f2=new File(fileName2);
		
		
		FileInputStream fis1;
		FileInputStream fis2;
		String r1="f";
		String r2="g";
		
		try {
			
			BufferedReader inFile= new BufferedReader(new FileReader(f1));
			BufferedReader inFile2= new BufferedReader(new FileReader(f2));
			
			while(true) {
					r1=inFile.readLine();
					r2=inFile2.readLine();
					
					if(r1==null || r2==null) {
						break;
					}
					
					if(!r1.equals(r2)) {
						System.out.println("파일이 다릅니다.");
						break;
					}
					
			}
			if(r1==null && r2!=null) {
				System.out.println("파일이 다릅니다");
			}
			else if(r2==null && r1!=null) {
				System.out.println("파일이 다릅니다");
			}
			else if(r1==null && r2==null){
				System.out.println("파일이 같습니다.");
			}
			else if(r1.equals(r2))
				System.out.println("파일이 같습니다.");
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}
}
