package blockGame;

public class Paddle {
	public int x;
	public int y;
	public int width;
	public int height;
	public int speedX;
	public boolean left;
	public boolean right;
	
	public Paddle() {
		this.x = GamePanel.GAME_WIDTH/2 - GamePanel.PADDLE_WIDTH/2;
		this.y = GamePanel.GAME_HEIGHT - 100;
		this.width = GamePanel.PADDLE_WIDTH;
		this.height = GamePanel.PADDLE_HEIGHT; 
	}
}
