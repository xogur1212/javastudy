package test0803;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopyEx {
	
	public static void main(String[] args) {
		
		
		File original =new File("D:\\target\\sample.txt");
		File copy =new File("D:\\\\target\\\\sample_copy.txt");
		
		
		int c;
		
			try {
				FileReader fr =new FileReader(original);
				
				try {
					
					FileWriter fw=new FileWriter(copy);
					
					while((c=fr.read())!=-1) {
						fw.write((char)c);
					}
					fw.close();
					fw.close();
					System.out.println(original.getPath()+"를 " + copy.getPath()+"로 복사했습니다.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
		
	

			
			
			
}
