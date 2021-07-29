package test0729;

interface PhoneInterface{
	int num=10;
	final int TIMEOUT =10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	default void prntLogo() {
		System.out.println("asdasd");
	}
	
}
interface MP3Interface{
	void play();
	void stop();
}

class PDA {
	public int calculate (int x, int y) {
		return x+y;
	}
}

class SamsungPhone extends PDA implements MobilePhoneInterface,MP3Interface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("3");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("4");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("5");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("6");
	}
	
}
interface MobilePhoneInterface extends PhoneInterface{
	public abstract void sendSMS();
	public abstract void receiveSMS();
} 


public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone sp=new SamsungPhone();
		sp.sendCall();
		sp.receiveCall();
		
		sp.prntLogo();
		
	}
}
