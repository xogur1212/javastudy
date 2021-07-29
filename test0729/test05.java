package test0729;

class Point{
	private int x,y;
	public Point(int x, int y) {this.x=x; this.y=y;}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move (int x, int y) {this.x=x;this.y=y;}
}


class ColorPoint extends Point {
	
	
	String Color;
	public ColorPoint(int x,int y,String Color) {
		super(x,y);
	
		this.Color=Color;
	}
	public ColorPoint() {
		super(0,0);
		this.Color="BLACK";
	}
	public ColorPoint(int x,int y) {
		super(x,y);
	}
	void setXY(int changex,int changey) {
		move(changex,changey);
	}
	void setColor(String Color) {
		this.Color=Color;
	}
	public String toString() {
		return this.Color+"색의 " +"("+getX()+","+getY()+")의 점";
	}
}
public class test05 {
	public static void main(String[] args) {
		ColorPoint cp =new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str=cp.toString();
		System.out.println(str+ "입니다.");
	}
}
