package test0728;


public class test1003_final {

		final protected int x=5;
		final public void f() {		//1�� final�� �����ߴµ� f�� �ؿ��� �ҷ����ٲ�  
			x++;	//2��int�� final�ε� �����Ϸ�����
			System.out.print(x);
		}
		

class SpecialRect extends Rect {	//3�� final�� ��ӹ������Ѵ�
	
	
		public void f() {
		//	System.out.print(super.x);
		}
		
			
	}
}