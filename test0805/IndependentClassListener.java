package test0805;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("버튼이 눌러졌어요");
	}
	
	
}
public class IndependentClassListener extends JFrame {
	public IndependentClassListener() {
		this.setTitle("독립 클래스 이벤트 리스너 만들기");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane =this.getContentPane();
		contentPane.setLayout(new FlowLayout());
		JButton btn= new JButton("Click");
		btn.addActionListener(new MyActionListener());
		contentPane.add(btn);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new IndependentClassListener();
	}
}
