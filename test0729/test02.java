package test0729;

class IPTV extends ColorTV {

	String ip;
	public IPTV(String ip,int size, int inch) {
		super(size, inch);
		this.ip=ip;
		// TODO Auto-generated constructor stub
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 "+ip+"주소의 "+getSize()+"인치 "+inch+"컬러");
	}
	
}

public class test02 {
	public static void main(String[] args) {
		
		IPTV iptv= new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}
