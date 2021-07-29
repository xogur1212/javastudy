package test0729;

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
	
}
public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}

	public static void main(String[] args) {
		GoodCalc gc= new GoodCalc();
		System.out.println(gc.add(2, 3));
		System.out.println(gc.subtract(2, 3));
		System.out.println(gc.average(new int[] {1,2,3,4}));
	}

	
}
