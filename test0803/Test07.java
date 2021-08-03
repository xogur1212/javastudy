package test0803;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fileName1;
		String fileName2;
		
		
		File f1=new File("d:\\target\\공격2.zip");
		File f2=new File("d:\\target\\공격3.zip");
		
		
		FileInputStream fis1;
		
		FileOutputStream fos1;
		
		String r1="f";
		String r2="g";
		double total=0;
		int collsion=1;
		try {
			fis1=new FileInputStream(f1);
			fos1=new FileOutputStream(f2);
			byte [] buf =new byte[10];
			//fis1 복사하기
			while(true) 
			{
				int n=fis1.read(buf);
				fos1.write(buf,0,n);
				total+=(double)n/f1.length()*100;
				
				//System.out.println(Math.floor(total)+"%");
			
				for(int i=1;i<11;i++) {
					if((Math.floor(total))==i*10 && collsion==i) {
						System.out.print("*");
						collsion++;
					}
				}
				
				
				
				
				if(n<buf.length)
				{
					break;
				}
				
				
			}
			
			fis1.close();
			
			fos1.close();
			sc.close();
			
					
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}
}
