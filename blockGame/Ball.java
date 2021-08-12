package blockGame;

public class Ball {
	public int x;
	public int y;
	public int width;
	public int height;
	public int dir;
	public int speed;
	
	public Ball() {
		this.x = GamePanel.GAME_WIDTH/2 - GamePanel.BALL_DIAMETER/2;
		this.y = GamePanel.GAME_HEIGHT/2 - GamePanel.BALL_DIAMETER/2;
		this.width = GamePanel.BALL_DIAMETER;
		this.height = GamePanel.BALL_DIAMETER;
		this.speed = 2;
	}
}
