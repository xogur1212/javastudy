package thread;

import java.awt.Container;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

class DigitalClock extends JLabel implements Runnable {
	   private int num = 0;
	   private Thread th;
	   public DigitalClock() {
	      this.setText("시계가 출력될 예정입니다.");
	      this.setFont(new Font("맑은 고딕",Font.BOLD,30));
	      this.setHorizontalAlignment(JLabel.CENTER);
	      th = new Thread(this);
	      th.start();
	   }
	   @Override
	   public void run() {
	      while(true) {
	         try {
	            Thread.sleep(1000);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	            return;
	         }
	         //num++;
	         Calendar cal = Calendar.getInstance();
	         int hour = cal.get(Calendar.HOUR_OF_DAY);
	         int min = cal.get(Calendar.MINUTE);
	         int sec = cal.get(Calendar.SECOND);
	         this.setText(hour+":"+min+":"+sec);
	      }
	   }
	}
	public class DigitalClockEx extends JFrame {
	   public DigitalClockEx() {
	      this.setTitle("CLOCK");
	      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      this.setSize(500,500);
	      Container contentPane = this.getContentPane();
	      contentPane.add(new DigitalClock());
	      this.setVisible(true);
	   }
	   public static void main(String[] args) {
	      new DigitalClockEx();
	   }
	}

