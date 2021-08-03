package test0803;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
   public static void main(String[] args) {
      byte b[] = new byte[8];
      FileInputStream fin = null;
      try {
         // 문자로 저장되지 않은 파일.... 동영상, 그림, 압축파일등을 읽을 때 사용한다.
         fin = new FileInputStream("C:\\Users\\user-000\\Desktop\\test05.out");
         int n = 0, c;
         // 이러면 시간이 엄청 걸림  // buffer  댐  1024
         while(   (c = fin.read()) != -1  ) {
            b[n] = (byte)c;
            n++;
         }
         System.out.println("test05.out에서 읽은 배열을 출력합니다.");
         for(int i =  0;i<b.length;i++) {
            System.out.print(b[i]+" ");
         }
         System.out.println();
         fin.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}