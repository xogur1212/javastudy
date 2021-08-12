package blockGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
   static int BALL_DIAMETER = 20;
   static int BLOCK_ROW = 5;
   static int BLOCK_COLUMN = 10;
   static int BLOCK_WIDTH = 60;
   static int BLOCK_HEIGHT = 30;
   static int BLOCK_GAP = 2;
   static int PADDLE_WIDTH = 90;
   static int PADDLE_HEIGHT = 20;
   static int GAME_WIDTH = BLOCK_WIDTH*BLOCK_COLUMN+BLOCK_GAP*(BLOCK_COLUMN - 1);
   static int GAME_HEIGHT = 900;
   private boolean exitThread=false;
   
   private Thread th;
   private Thread th2;
   
   private Ball ball = new Ball();
   private Paddle paddle = new Paddle();
   
   private Block blocks[][] = new Block[GamePanel.BLOCK_ROW][GamePanel.BLOCK_COLUMN];
   private int score=0;
   private int total=0;
   private int life=3;
   public GamePanel() {
      this.setPreferredSize(new Dimension(GAME_WIDTH,GAME_HEIGHT));
      //this.setSize(GAME_WIDTH,GAME_HEIGHT);
      this.setBackground(Color.BLACK);
     // GamePanel g1=new GamePanel();
      th = new Thread(this);
      
      th.start();
      for(int i=0;i<GamePanel.BLOCK_ROW;i++) { // 5
         for(int j = 0;j<GamePanel.BLOCK_COLUMN;j++) { // 10
            blocks[i][j] = new Block(); // 각각의 블럭을 생성  배열의 각각에 block
            blocks[i][j].x = GamePanel.BLOCK_WIDTH*j+GamePanel.BLOCK_GAP*j;
            blocks[i][j].y = 100 + GamePanel.BLOCK_HEIGHT*i+GamePanel.BLOCK_GAP*i;
            blocks[i][j].width = GamePanel.BLOCK_WIDTH;
            blocks[i][j].height = GamePanel.BLOCK_HEIGHT;
            blocks[i][j].color = i;
         }
      }
      //좌우키보드 이벤트 달기....
      this.setFocusable(true);
      this.requestFocus();
      this.addKeyListener(new KeyListener() {
         @Override
         public void keyTyped(KeyEvent e) {}
         @Override
         public void keyReleased(KeyEvent e) {
            switch(e.getKeyCode()) {
               case KeyEvent.VK_LEFT:
               paddle.left=false;
               break;
               case KeyEvent.VK_RIGHT:
               paddle.right=false;
               break;
               
            }
         }
         @Override
         public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
               case KeyEvent.VK_LEFT:
               paddle.left=true;
               break;
               case KeyEvent.VK_RIGHT:
               paddle.right=true;
               break;
               case KeyEvent.VK_ENTER:
            	   if(exitThread==true) {
            		  
            		   exitThread=false;
                	   life=3;
                	   score=0;
                	  // Thread.State state = th.getState();
                	  //  System.out.println(state);

                	  
                	   th=new Thread(GamePanel.this);
                	   th.start();
                	   for(int i=0;i<GamePanel.BLOCK_ROW;i++) { // 5
                	         for(int j = 0;j<GamePanel.BLOCK_COLUMN;j++) { // 10
                	            blocks[i][j] = new Block(); // 각각의 블럭을 생성  배열의 각각에 block
                	            blocks[i][j].x = GamePanel.BLOCK_WIDTH*j+GamePanel.BLOCK_GAP*j;
                	            blocks[i][j].y = 100 + GamePanel.BLOCK_HEIGHT*i+GamePanel.BLOCK_GAP*i;
                	            blocks[i][j].width = GamePanel.BLOCK_WIDTH;
                	            blocks[i][j].height = GamePanel.BLOCK_HEIGHT;
                	            blocks[i][j].color = i;
                	         }
                	      }
                	   
            	   }
            	   break;
            	   
            }
         }
      });
   }
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.WHITE);
      g.fillOval(ball.x,ball.y,ball.width, ball.height);
      g.setColor(Color.RED);
      g.fillRect(paddle.x,paddle.y,paddle.width,paddle.height);
      Font f=new Font("맑은 고딕",Font.ITALIC,30);
      g.setFont(f);
      g.setColor(Color.WHITE);
      g.drawString(String.valueOf(score),GamePanel.GAME_WIDTH/2-20,30);
      g.setColor(Color.WHITE);
      g.drawString("life : "+life,GamePanel.GAME_WIDTH-100,30);
      if(exitThread) {
    	  super.paintComponent(g);//기존것들 다지움
    	  g.setFont(f);
          g.setColor(Color.WHITE);
          g.drawString("game end"+score,GamePanel.GAME_WIDTH/2-50,GamePanel.GAME_HEIGHT/2);
      }
     
      
      //thread 생성해서 주구장창..
      for(int i=0;i<GamePanel.BLOCK_ROW;i++) { // 5
         for(int j = 0;j<GamePanel.BLOCK_COLUMN;j++) { // 10
            //g.setColor(Color.yellow);
        	if(blocks[i][j].isHide) {
        		continue;
        	}
            if(blocks[i][j].color == 0) {
               g.setColor(Color.BLUE);
            }  else if(blocks[i][j].color == 1) {
               g.setColor(Color.GREEN);
            } else if(blocks[i][j].color == 2) {
               g.setColor(Color.MAGENTA);
            } if(blocks[i][j].color == 3) {
               g.setColor(Color.YELLOW);
            } if(blocks[i][j].color == 4) {
               g.setColor(Color.WHITE);
            }
            g.fillRect(blocks[i][j].x, blocks[i][j].y, blocks[i][j].width, blocks[i][j].height);
         }
      }
      
   }
   @Override
   public void run() {
      while(!exitThread) {
         try {
            Thread.sleep(1);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         //System.out.println("주구장창");
         repaint();
         paddleMove();
         ballMove();
         checkWall();
         checkBlock();
         checkGameEnd();
      }
   }
   
   public void checkGameEnd() {
	   int gameCount=0;
	   for(int i=0;i<GamePanel.BLOCK_ROW;i++) { // 5
	         for(int j = 0;j<GamePanel.BLOCK_COLUMN;j++) { // 10
	           Block block =blocks[i][j];
	           if(block.isHide) {
	        		
		   			gameCount++;
	           }
	           
	         }
	         
	         if(gameCount==50) {
	        	 exitThread=true;
	        	 repaint();
	         }
	         if(life==0) {
	        	 exitThread=true;
	        	 repaint();
	         }
	         
	   }
   }
   public void paddleMove() {
      if(paddle.left) {
         paddle.x-=10;
      }
      if(paddle.right) {
         paddle.x+=10;
      }
   }
   public void checkWall() {
      if(ball.dir==0) { //up right
         if(ball.y < 0) {//위쪽 벽에 닿았을때
            ball.dir=1;
         }
         if(ball.x > GamePanel.GAME_WIDTH - GamePanel.BALL_DIAMETER) {
            ball.dir = 2;
         }
      } else if(ball.dir == 1) { // down right   
         if(ball.y > GamePanel.GAME_HEIGHT - GamePanel.BALL_DIAMETER) {
            ball.dir = 0;
         }
         if(ball.x > GamePanel.GAME_WIDTH - GamePanel.BALL_DIAMETER) {
            ball.dir = 3;
         }
         // paddle과의 충돌
         if(ball.y+GamePanel.BALL_DIAMETER >= paddle.y) {
        	 System.out.println("x"+ball.x+"y"+ball.y);
            if( hitObject( new Rectangle(ball.x,ball.y,ball.width,ball.height),
                         new Rectangle(paddle.x,paddle.y,paddle.width,paddle.height)  )) {
            	
               ball.dir = 0;
            }
            
         }if(ball.y >= GamePanel.GAME_HEIGHT-GamePanel.BALL_DIAMETER) {
        	    
        	 	life--;
                	//System.out.println("x"+ball.x+"y"+ball.y);
               	ball.x = GamePanel.GAME_WIDTH/2 - GamePanel.BALL_DIAMETER/2;
        		ball.y = GamePanel.GAME_HEIGHT/2 - GamePanel.BALL_DIAMETER/2;
        		ball.dir=0;
         }
         
      } else if(ball.dir==2) { // up left
         if(ball.y < 0) {//위쪽 벽에 닿았을때
            ball.dir=3;
         }
         if(ball.x < 0) {
            ball.dir = 0;
         }
      } else if(ball.dir==3) { // down left
         if(ball.y > GamePanel.GAME_HEIGHT - GamePanel.BALL_DIAMETER) {
            // 여기 부분 수정...
            ball.dir = 2;
         }
         if(ball.x < 0) {
            ball.dir = 1;
         }
         // paddle과의 충돌
         if(ball.y+GamePanel.BALL_DIAMETER >= paddle.y) {
            if( hitObject( new Rectangle(ball.x,ball.y,ball.width,ball.height),
                         new Rectangle(paddle.x,paddle.y,paddle.width,paddle.height)  )) {
               ball.dir = 2;
            }
//            else {
//            	//System.out.println("x"+ball.x+"y"+ball.y);
//           	ball.x = GamePanel.GAME_WIDTH/2 - GamePanel.BALL_DIAMETER/2;
//    		ball.y = GamePanel.GAME_HEIGHT/2 - GamePanel.BALL_DIAMETER/2;
//         }
         }if(ball.y >= GAME_HEIGHT-20) {    	    
         	//System.out.println("x"+ball.x+"y"+ball.y);
        	 life--;
        	ball.x = GamePanel.GAME_WIDTH/2 - GamePanel.BALL_DIAMETER/2;
        	ball.y = GamePanel.GAME_HEIGHT/2 - GamePanel.BALL_DIAMETER/2;
        	ball.dir=0;
  }
      }
   }
   //checkBlcok
   public void checkBlock() {
	   for(int i=0;i<GamePanel.BLOCK_ROW;i++) { // 5
	         for(int j = 0;j<GamePanel.BLOCK_COLUMN;j++) { // 10
	           Block block =blocks[i][j];
	           if(!block.isHide) {	//화면에 보이는것들만
		           if(ball.dir==0) {	//up right
		        	   if(hitObject(new Rectangle(ball.x,ball.y,ball.width,ball.height),
		        			   		new Rectangle(block.x,block.y,block.width,block.height))) {
		        		   			if(ball.x>block.x && ball.x+ball.width<=block.x+block.width) {
		        		   				
		        		   				//밑면
		        		   				ball.dir=1;
		        		   			}else {
		        		   				
		        		   				//옆면
		        		   				ball.dir=2;
		        		   			}
		        		   			switch(i) {
		        		   			case 0:	
		        		   				score+=50;
		        		   				break;
		        		   			
		        		   			case 1:
		        		   				score+=40;
		        		   				break;
		        		   			case 2:
		        		   				score+=30;
		        		   				break;
		        		   				
		        		   			case 3:
		        		   				score+=20;
		        		   				break;
		        		   				
		        		   			case 4:
		        		   				score+=10;
		        		   				break;
		        		   			
		        		   				
		        		   			}
		        		   			blocks[i][j].isHide=true;
		        		   			
		        		   			
		        		   			
		        	   }
		           }
		           else if(ball.dir==1) {	//down right
		        	   if(hitObject(new Rectangle(ball.x,ball.y,ball.width,ball.height),
		        			   		new Rectangle(block.x,block.y,block.width,block.height))) {
		        		   			if(ball.x>block.x && ball.x+ball.width<=block.x+block.width) {
       		   				
		        		   			//밑면
		        		   			ball.dir=0;
			       		   			}else {
			       		   				
			       		   				//옆면
			       		   			ball.dir=3;
			       		   			}
		        		   			switch(i) {
		        		   			case 0:	
		        		   				score+=50;
		        		   				break;
		        		   			
		        		   			case 1:
		        		   				score+=40;
		        		   				break;
		        		   			case 2:
		        		   				score+=30;
		        		   				break;
		        		   				
		        		   			case 3:
		        		   				score+=20;
		        		   				break;
		        		   				
		        		   			case 4:
		        		   				score+=10;
		        		   				break;
		        		   			
		        		   				
		        		   			}
		        		   			blocks[i][j].isHide=true;
		        		   			
		        		   			
		        		   			
		        	   }
		           }
		           else if(ball.dir==2) {	//up left
		        	   if(hitObject(new Rectangle(ball.x,ball.y,ball.width,ball.height),
		        			   		new Rectangle(block.x,block.y,block.width,block.height))) {
					        		if(ball.x>block.x && ball.x+ball.width<=block.x+block.width) {
				       		   				
				        		   	//밑면
				        		   	ball.dir=3;
					       		   	}else {
					       		   				
					       		   	//옆면
					       		   	ball.dir=0;
					       		   	}
					        		switch(i) {
						   			case 0:	
						   				score+=50;
						   				break;
						   			
						   			case 1:
						   				score+=40;
						   				break;
						   			case 2:
						   				score+=30;
						   				break;
						   				
						   			case 3:
						   				score+=20;
						   				break;
						   				
						   			case 4:
						   				score+=10;
						   				break;
						   			
						   				
						   			}
		        		   			blocks[i][j].isHide=true;
		        		   			
		        		   			
		        	   }
		           }
		           else if(ball.dir==3) {	//down left
		        	   if(hitObject(new Rectangle(ball.x,ball.y,ball.width,ball.height),
		        			   		new Rectangle(block.x,block.y,block.width,block.height))) {
				        		   if(ball.x>block.x && ball.x+ball.width<=block.x+block.width) {
			       		   				
					        	//밑면
					        	  	ball.dir=2;
						       		}else {
						       		   				
						       		   //옆면
						       		 ball.dir=1;
						       		   }
				        		   switch(i) {
						   			case 0:	
						   				score+=50;
						   				break;
						   			
						   			case 1:
						   				score+=40;
						   				break;
						   			case 2:
						   				score+=30;
						   				break;
						   				
						   			case 3:
						   				score+=20;
						   				break;
						   				
						   			case 4:
						   				score+=10;
						   				break;
						   			
						   				
						   			}
		        		   			blocks[i][j].isHide=true;
		        		   			
		        		   			
		        		   			
		        	   }
		           }
	           	}
	         }
	   }
   }
   
   
   public void ballMove() {
      //벽을 세워서 충돌을 감지해야
      if(ball.dir==0) { //up right
         ball.x+=ball.speed;
         ball.y-=ball.speed;
      } else if(ball.dir==1) { // down right
         ball.x+=ball.speed;
         ball.y+=ball.speed;
      } else if(ball.dir==2) { // up left
         ball.x-=ball.speed;
         ball.y-=ball.speed;
      } else if(ball.dir==3) { // down left
         ball.x-=ball.speed;
         ball.y+=ball.speed;
      }
   }
   
   public boolean hitObject(Rectangle ball,Rectangle rect) {
      return ball.intersects(rect);
   }
}














