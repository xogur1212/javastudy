package test0805;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class KeyCodeEx extends JFrame {
   //Container contentPane;
   public KeyCodeEx() {
      this.setTitle("KeyEventListenerEx");
      this.setSize(400,300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container contentPane = this.getContentPane();
      contentPane.addKeyListener(new MyKeyListener());//
      
      contentPane.setFocusable(true);
      contentPane.requestFocus(); // 포커스를 받을 수 있다. 그래야지만  keyEvent가 처리 가능하다.
      this.setVisible(true);
   }
   class MyKeyListener extends KeyAdapter {
      public void keyPressed(KeyEvent e) {
         //System.out.println("key pressed");
         Container contentPane = (Container)e.getSource();
         char keyChar = e.getKeyChar();
         int keyCode = e.getKeyCode();
         if(keyChar == '%') {
            System.out.println("%를 눌렀습니다.");
            contentPane.setBackground(Color.YELLOW);
         } else if(keyCode == KeyEvent.VK_F1) {
            System.out.println("F1눌러졌음");
            contentPane.setBackground(Color.GREEN);
         }
      }
   }
   public static void main(String[] args) {
      new KeyCodeEx();
   }
}   
