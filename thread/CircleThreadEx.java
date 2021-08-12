package thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


class MyPanel extends JPanel implements Runnable {
   Thread th;
   private int x = 50;
   private int y = 50;
   public MyPanel() {
      th = new Thread(this);
      //th.start();
      this.addMouseListener(new MouseAdapter() {
         public void mousePressed(MouseEvent e) {
            th.start();
         }
      });
   }
   @Override
   public void run() {
      while(true) {
         try {
            Thread.sleep(100);
         } catch (InterruptedException e) {
            e.printStackTrace();
            return;
         }
         //System.out.println("뭐라도 나와라");
         x = (int)(Math.random()*500);
         y = (int)(Math.random()*500);
         repaint();
      }
   }
   
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.RED);
      g.fillOval(x, y, 50, 50);
   }
}
public class CircleThreadEx extends JFrame  {
   public CircleThreadEx() {
      this.setTitle("CIRLCLE");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(500,500);
      MyPanel myPanel = new MyPanel();
      this.setContentPane(myPanel);
      this.setVisible(true);
   }
   public static void main(String[] args) {
      new CircleThreadEx();
   }
}
