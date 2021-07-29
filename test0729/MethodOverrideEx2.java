package test0729;

class Shape2{
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("shape draw");
	}
}

class CirCle2 extends Shape2{
	public void draw(){
		System.out.println("circle");
	}
}
public class MethodOverrideEx2 {
	static void paint(Shape s) {
		s.draw();
	}
public static void main(String[] args) {
	
	
	Shape2 s=new CirCle2();
	s.paint();
}
}
