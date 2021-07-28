package test0728;

class StaticSample{
    public int x;
    public static int y;
    public static int f() { return y; }

}

public class test1002_static {


public static void main(String[] args) {
	
	
	//StaticSample.x=5;
	StaticSample.y=10;
	int tmp =StaticSample.f();
	StaticSample a= new StaticSample();
	tmp =a.y;
	a.x=5;
	a.y=10;
}
}