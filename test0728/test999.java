package test0728;

public class test999 {
	
int a=10;	
public test999(int a) {
	this.a=a;
}



public static void main(String[] args) {
	test999 t1=new test999(5);
	test999 t2=new test999(6);
	
	
	t1=t2;
	System.out.println(t1.a);
	System.out.println(t2.a);
	
	t1.a=9;
	System.out.println(t1.a);
	System.out.println(t2.a);
	
}
}
