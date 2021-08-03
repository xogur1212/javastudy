package test0803;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Test06 {
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
		File f3=new File("d:\\target\\append.txt");
		
		
		FileInputStream fis1;
		FileInputStream fis2;
		FileOutputStream fos1;
		
		String r1="f";
		String r2="g";
		
		try {
			fis1=new FileInputStream(f1);
			fis2=new FileInputStream(f2);
			fos1=new FileOutputStream(f3);
			byte [] buf =new byte[1024*20];
			//fis1 복사하기
			while(true) 
			{
				int n=fis1.read(buf);
				fos1.write(buf,0,n);
				if(n<buf.length)
				{
					break;
				}
				
				
			}
			
			fis1.close();
			//fis2 복사하기
			while(true) 
			{
				int n=fis2.read(buf);
				fos1.write(buf,0,n);
				if(n<buf.length)
				{
					break;
				}
				
				
			}
			
			fis2.close();
			fos1.close();
			sc.close();
			System.out.println(f3.getPath()+"에 저장되었습니다");
					
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}
}
