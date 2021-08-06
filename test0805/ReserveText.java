package test0805;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class ReserveText extends JFrame {
   JLabel label = new JLabel("LOVE JAVA");
   public ReserveText() {
      this.setTitle("TextChange");
      this.setSize(300,300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container contentPane = this.getContentPane();
      contentPane.setLayout(new FlowLayout());
      contentPane.add(label);
      contentPane.addKeyListener(new MyKeyListener());
      contentPane.setFocusable(true);
      contentPane.requestFocus();
      this.setVisible(true);
   }
   
   class MyKeyListener extends KeyAdapter {
      public void keyPressed(KeyEvent e) {
         //System.out.println("일단 키가 눌러졌습니다.");
         int keyCode = e.getKeyCode();
         if(keyCode==KeyEvent.VK_LEFT) {
            //System.out.println("조건에 의해서 왼쪽키만 눌러집니다.");
            //label.setText("AVAJ EVOL");
            StringBuffer sb = new StringBuffer();
            sb.append(label.getText());
            sb.reverse();
            label.setText(sb.toString());
         }
      }
   }
   
   public static void main(String[] args) {
      new ReserveText();
   }
}
