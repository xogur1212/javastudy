package test0730;

import java.util.Objects;

class MyPoint{
	
	int x;
	int y;
	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyPoint other = (MyPoint) obj;
		return x == other.x && y == other.y;
	}
	public String toString() {
		return "Point(" +x+","+y+")";
	}

	
}


public class test01 {
	public static void main(String[] args) {
		MyPoint p =new MyPoint(3,50);
		MyPoint q =new MyPoint(4,50);
		System.out.println(p);			//System.out.println(p.toString()); 이랑 같게 출력됨
		if(p.equals(q))
			System.out.println("같은점");
		else
			System.out.println("다른점");
	}
}
