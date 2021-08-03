package test0803;



import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedIOEx {
   public static void main(String[] args) {
      FileReader fr = null;
      int c;
      try {
         fr = new FileReader("C:\\Users\\user-000\\Desktop\\test06.txt");
         // 파일을 일고 쓰고 하는 속도가 굉장히 빨라진다.
         BufferedOutputStream bOut = new BufferedOutputStream(System.out,5); 
         // Buffered 붙어 있는것들은 Dam이다  주어진 숫자가 채워질때까지 나가지 않는다.
         while(  (c = fr.read())!=-1 ) {
            bOut.write(c);
         }
         // 강제로 내보내야 한다.
         bOut.flush(); // 강제로 밀어내기....
         bOut.close();
         fr.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}




