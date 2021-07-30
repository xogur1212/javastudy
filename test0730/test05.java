package test0730;

import java.util.Calendar;

public class test05 {
	
	public static void printhi(Calendar cal) {
		int hour=cal.get(Calendar.HOUR);
		int hourOfDay=cal.get(Calendar.HOUR_OF_DAY);
		int min=cal.get(Calendar.MINUTE);
		
		
		System.out.println("현재시간은 "+ hourOfDay+"시 "+min + "분입니다." );
		
		if(hourOfDay>=4&& hourOfDay<12) {
			System.out.println("Good Morning");
		}else if(hourOfDay<18) {
			System.out.println("Good Afternoon");
		}else {
				System.out.println("Good Night");
		}
			
	}
	public static void main(String[] args) {
		Calendar now =Calendar.getInstance();
		printhi(now);
		
	}
}
