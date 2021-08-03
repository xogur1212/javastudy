package test0803;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOEx02 {
   public static void main(String[] args) {
      FileInputStream fis = null;
      FileOutputStream  fos = null;
      BufferedInputStream bis = null;
      BufferedOutputStream bos = null;
      double start = 0;
      double end = 0;
      try {
         fis = new FileInputStream("C:\\Users\\user-000\\Desktop\\jun.jpg");
         fos = new FileOutputStream("C:\\Users\\user-000\\Desktop\\jun_02.jpg"); // 1byte  씩 쓰기
         // 1byte읽기
         bis = new BufferedInputStream(fis);// 8kb  
         bos = new BufferedOutputStream(fos);
         start = System.currentTimeMillis(); // milliseconds
         int i; 
         while((i = bis.read())!=-1) {
            bos.write(i);
         }
         end = System.currentTimeMillis();
         System.out.println(end - start+"초 걸렸습니다.");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}



