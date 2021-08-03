package test0803;
import java.io.FileInputStream; // 모든 입출력 관련된 것들은 io 패키지에 들어가 있다. 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class fillereadhangul {
   public static void main(String[] args) {
      FileInputStream fis = null;
      InputStreamReader in = null;
      try {
         fis = new FileInputStream("test.txt");    //문자를 바이트 읽어서 출력....
         in = new InputStreamReader(fis);  // byte 인 FileInputStream을 매개변수로 받는 
         int c;  // eof  -1을 반환
         while((c = in.read()) != -1 ) {
             System.out.print((char) c);
         }
         in.close();
         fis.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}