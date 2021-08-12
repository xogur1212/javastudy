package blockGame;

import java.awt.*;
import javax.swing.*;

public class BlockGame extends JFrame {
	public BlockGame() {
		this.setTitle("벽돌 깨기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		GamePanel gamePanel = new GamePanel();
		Container contentPane = this.getContentPane();
		contentPane.add(gamePanel);
//		this.setSize(GamePanel.GAME_WIDTH,GamePanel.GAME_HEIGHT);
		
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new BlockGame();
	}
}
