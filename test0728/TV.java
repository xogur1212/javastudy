package test0728;



public class TV {
	
	private String bymade;
	private int year;
	private int inch;
	public TV(String bymade,int year,int inch) {
		
		
		this.bymade=bymade;
		this.year=year;
		this.inch=inch;
		
	}
	
	public void show(){
		System.out.println(bymade+" " +year+ " "+ inch);
	}
public static void main(String[] args) {
	TV myTV =new TV("LG",2017,32);
	myTV.show();
}
}
