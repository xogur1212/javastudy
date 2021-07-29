package test0729;

class PositivePoint extends Point{
	
	 int x=0;
	 int y=0;
	
	public PositivePoint(int x, int y) {
		super(x=x>0?x:0,y=y>0?y:0);
		// TODO Auto-generated constructor stub
	}

	 public PositivePoint() {
		super(0,0);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return getX()+ " "+ getY();
	}
	public void move(int x, int y) {
		if(x>0 && y>0)
		super.move(x,y);
			
		
	}
	
}

public class test08 {

	public static void main(String[] args) {
		PositivePoint p =new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString() + "입니다");
		
		p.move(-5,-5);
		System.out.println(p.toString() + "입니다");
		
		PositivePoint p2 =new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "입니다");
	}
}
