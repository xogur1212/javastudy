package test0803;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageBlockCopyEx02 {
public static void main(String[] args) {
	File original =new File("D:\\target\\엄티1.png");
	File copy =new File("D:\\target\\엄티3.png");
	FileInputStream fis=null;
	FileOutputStream fos =null;
	byte buffer[]= new byte[1024*8]; //10kb짜리 버퍼 
	double start=System.currentTimeMillis();
	//buufer를 생성해서 출력..
	int c;
	
	try {
		fis=new FileInputStream(original);  
		fos=new FileOutputStream(copy);
		while(true) {
			
			int n=fis.read(buffer); //버퍼에 담겨저서 넘어온 데이터 
			fos.write(buffer,0,n);
			if(n<buffer.length) {
				break;
			}
			
		}
		fis.close();
		fos.close();
		double end=System.currentTimeMillis();
		System.out.println(end-start);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
