package test0729;

import java.util.Scanner;


abstract class Converter{
	
	
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;

	public void run() {
		Scanner scanner =new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+ getDestString()+"로 바꿉니다.");
		System.out.print(getSrcString() +"을 입력하세요>> ");
		double val =scanner.nextDouble();
		double res =convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
		scanner.close();
	}
}

class Won2Dollar extends Converter{
	int rate;
	public Won2Dollar(int rate){
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
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}
		
}

public class test03 {
	public static void main(String[] args) {
		Won2Dollar toDollar= new Won2Dollar(1200);
		toDollar.run();
	}	
}
