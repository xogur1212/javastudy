package blockGame;

public class Block {
	public int x;
	public int y;
	public int width;
	public int height;
	public int color;
	public boolean isHide =false;
	public Block() {
		this.width = GamePanel.BLOCK_WIDTH;
		this.height = GamePanel.BLOCK_HEIGHT;
		this.color = 0;
		this.isHide =false;
	}
}
