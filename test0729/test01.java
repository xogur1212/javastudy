package test0729;

class TV{
	private int size;
	public TV(int size) {this.size=size;}
	protected int getSize() { return size;}
}
class ColorTV extends TV{

	int inch;
	public ColorTV(int size,int inch) {
		super(size);
		this.inch=inch;
		// TODO Auto-generated constructor stub
	
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+inch+"컬러");
	}
	
}

public class test01 {
	public static void main(String[] args) {
		
		ColorTV myTV =new ColorTV(32,1024);
		myTV.printProperty();
		
		
	}
}
