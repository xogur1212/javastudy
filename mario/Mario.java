package mario;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
class GamePanel extends JPanel implements Runnable {
   private Thread th;
   private Image bg = new ImageIcon("images/bg.jpg").getImage();
   private Image mario = new ImageIcon("images/mario.png").getImage();
   private Image mushroom = new ImageIcon("images/mushroom.png").getImage();
   private int marioX = 200;
   private int marioY = 200;
   private int mushX = 400;
   private int mushY = 400;
   private boolean up,down,left,right;
   public GamePanel() {
      this.setSize(800,600);
      this.setFocusable(true);
      this.requestFocus();
      this.addKeyListener(new KeyListener() {
         @Override
         public void keyTyped(KeyEvent e) {}
         @Override
         public void keyReleased(KeyEvent e) {
            switch(e.getKeyCode()) {
               case KeyEvent.VK_LEFT:
                  left = false;
                  break;
               case KeyEvent.VK_RIGHT:
                  right = false;
                  break;
               case KeyEvent.VK_UP:
                  up = false;
                  break;
               case KeyEvent.VK_DOWN:
                  down = false;
                  break;
            }
         }
         @Override
         public void keyPressed(KeyEvent e) {
            //System.out.println(e.getKeyCode());
            switch(e.getKeyCode()) {
               case KeyEvent.VK_LEFT:
                  left = true;
                  break;
               case KeyEvent.VK_RIGHT:
                  right = true;
                  break;
               case KeyEvent.VK_UP:
                  up = true;
                  break;
               case KeyEvent.VK_DOWN:
                  down = true;
                  break;
            }
         }
      });
      
      th = new Thread(this);
      th.start();
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawImage(bg, 0,0, null);
      g.drawImage(mario, marioX, marioY, null);
      g.drawImage(mushroom, mushX, mushY, null);
   }
   
   private void marioMove() {
      if(left) {
         marioX-=5;
         //System.out.println("marioX좌표는 "+marioX);
      } 
      if(right) {
         marioX+=5;
         //System.out.println("marioX좌표는 "+marioX);
      } 
      if(up) {
         marioY-=5;
         //System.out.println("marioX좌표는 "+marioY);
      } 
      if(down) {
         marioY+=5;
         //System.out.println("marioX좌표는 "+marioY);
      } 
      repaint();
   }
   private void hitMushroom() {
		  double distX =marioX-mushX;
		  double distY =marioY-mushY;
		  double distance = Math.sqrt(distX*distX +distY*distY);
		  if(distance<20) {
			  //System.out.println("충돌");
			  
			  mushX=(int)(Math.random()*800-50);
			  mushY=(int)(Math.random()*600-50);
			  
			  if(mushX <=0) {
				  mushX+=50;
			  }
			  if(mushY <=0) {
				  mushY+=50;
			  }
		  }
	   }
   
  
   @Override
   public void run() {
      while(true) {
         try {
            Thread.sleep(20);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         //System.out.println("주구장창");
         marioMove();
         hitMushroom();
      }
   }
}
public class Mario extends JFrame {
   public Mario() {
      this.setTitle("MARIO GO GO GO");
      this.setSize(800,600);
      this.setResizable(false);
      this.setLocationRelativeTo(null); // 화면 가운데 띄우기...
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      this.setContentPane(new GamePanel());// 원래 있던 Container를 GamePanel로 바꿈...
      
      this.setVisible(true);
   }
   public static void main(String[] args) {
      new Mario();
   }
}

