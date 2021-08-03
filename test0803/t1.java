package test0803;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class t1 {
   public static void main(String[] args) {
      FileReader fr = null; 
      // 입출력에 관련된 것들은 try~catch로 감싸서 예외처리한다.
         try {
            //fr = new FileReader("C:\\Windows\\system.ini");
            fr = new FileReader("test.txt");
            //console에 출력
            int c; // 읽을때는 순차적으로 읽기위해 int c로 선언하고 출력할때는 거기에 맞는 char 형변환해서 출력한다.
            //c = fr.read(); // 입출력이 안됐을때 예외처리
            //System.out.print((char)c);
            //eof  파일의 제일 마지막에 가면 -1을 반환한다.
            while((c = fr.read()) != -1) {
               System.out.print((char) c);
            }
            fr.close();
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         }
         
   }
}