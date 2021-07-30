package test0730;

import java.util.Objects;

class Circle{
	
	int x;
	int y;
	int radius;
	public Circle(int x,int y, int radius) {
		this.x=x;
		this.y=y;
		this.radius =radius;
	}
	@Override
	public String toString() {
		return "Circle (x=" + x + ", y=" + y + ")반지름" + radius ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return  x == other.x && y == other.y;
	}
	
	
}


public class test02 {
	public static void main(String[] args) {
		Circle a= new Circle(2,3,5);
		Circle b= new Circle(2,3,30);
		
		System.out.println("원 a: " + a);
		System.out.println("원 b: " + b);
		
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}
