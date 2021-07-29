package test0729;

class Km2Mile extends Converter{
	double rate;
	public Km2Mile(double rate) {
		this.rate=rate;
	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/rate;
	}
	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "km";
	}
	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}
}
public class test04 {
public static void main(String[] args) {
	Km2Mile toMile =new Km2Mile(1.6);
	toMile.run();
}
}
