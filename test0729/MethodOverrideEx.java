package test0729;

class Shape{
	public Shape() {
		
	}
	public void draw() {
		System.out.println("shape draw");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("line draw");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect Draw");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle Draw");
	}
}
public class MethodOverrideEx {
	static void paint(Shape s) {
		s.draw();
	}
public static void main(String[] args) {
	
	
	Shape s1= new Shape();
	Line l1=new Line();
	
	
	s1.draw();
	l1.draw();
	paint (new Circle());
	paint(new Rect());
	
}
}
