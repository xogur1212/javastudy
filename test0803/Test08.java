package test0803;

import java.io.File;

public class Test08 {

	public static void main(String[] args) {
		
		File f1=new File("d:\\target");
		
		File[] subFiles=f1.listFiles();
		String filename="0";
		long maximum=0;
		for(int i=0;i<subFiles.length;i++) {
			File f=subFiles[i];
			
		//	System.out.print(f.getName());
		//	System.out.println("\t파일크기"+ f.length());
			if(maximum<f.length()) {
				maximum=f.length();
				filename=f.getName();
			}
			
		}
		System.out.println("가장 큰 파일은 "+  filename+" "+ maximum+"바이트");
	}
}
