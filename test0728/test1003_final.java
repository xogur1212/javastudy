package test0728;


public class test1003_final {

		final protected int x=5;
		final public void f() {		//1번 final로 선언했는데 f를 밑에서 불러서바꿈  
			x++;	//2번int가 final인데 변경하려고함
			System.out.print(x);
		}
		

class SpecialRect extends Rect {	//3번 final은 상속받지못한다
	
	
		public void f() {
		//	System.out.print(super.x);
		}
		
			
	}
}