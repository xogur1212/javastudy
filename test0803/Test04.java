package test0803;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		File file = new File("C:\\windows\\system.ini");
		int i=1;

		try {
			BufferedReader inFile= new BufferedReader(new FileReader(file));
			String sLine=null;
			while((sLine=inFile.readLine())!=null) {
				System.out.print(i++ +": ");
				System.out.println(sLine);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	
		
	}
}
