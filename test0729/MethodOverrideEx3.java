package test0729;


class Weapon{
	protected int fire() {
		return 1;
	}
}
class Cannon extends Weapon{
	protected int fire() {
		return 10;
	}
}


public class MethodOverrideEx3 {

public static void main(String[] args) {
	
	
	Weapon weapon =new Cannon();
	
	System.out.println(weapon.fire());
}
}
