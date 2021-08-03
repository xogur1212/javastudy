package test0803;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageBlockCopyEx {
public static void main(String[] args) {
	File original =new File("D:\\target\\엄티1.png");
	File copy =new File("D:\\target\\엄티2.png");
	FileInputStream fis=null;
	FileOutputStream fos =null;
	double start=System.currentTimeMillis();
	//byte buffer[]= new byte[1024*8]; //10kb짜리 버퍼 
	//buufer를 생성해서 출력..
	int c;
	
	try {
		fis=new FileInputStream(original);
		fos=new FileOutputStream(copy);
		while((c=fis.read())!=-1) {
			fos.write((byte)c);
		}
		
		double end=System.currentTimeMillis();
		System.out.println(end-start);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
