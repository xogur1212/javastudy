package test0805;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame{
	private JLabel label= new JLabel("NoMouse Event");
	public MouseListenerEx() {
		this.setTitle("key");
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane =this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		MyMouseListener myMouseListener =new MyMouseListener();
		contentPane.addMouseListener(myMouseListener);
		contentPane.addMouseMotionListener(myMouseListener);
		contentPane.add(label);
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		this.setVisible(true);
	}

	class MyMouseListener implements MouseListener,MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			label.setText("dragged(" + e.getX());
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			label.setText("moved(" + e.getX());
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			label.setText("pressed(" + e.getX());
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Component contentPane=(Component)e.getSource();
			contentPane.setBackground(Color.YELLOW);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			Component contentPane=(Component)e.getSource();
			contentPane.setBackground(Color.GREEN);
			
		}
		
	}
	public static void main(String[] args) {
		new MouseListenerEx();
	}
}


