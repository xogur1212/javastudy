package test0803;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		File file = new File("C:\\temp\\phone.txt");
		FileWriter fw = null;
		Scanner sc =new Scanner(System.in);
		String text = "f";
		System.out.println(file.getPath()+"를 출력합니다.");
		FileInputStream fis=null;
		
		BufferedOutputStream bout= new BufferedOutputStream(System.out,20);
		//ArrayList al=new ArrayList();
		
		int n;
		try {
			fis=new FileInputStream(file);  
				
			 while((n=fis.read())!=-1) {
		           bout.write((char)n);
		     }
				
				
				
			
			fis.close();
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	
		
	}
}
