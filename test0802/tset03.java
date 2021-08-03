package test0802;

import java.util.HashMap;
import java.util.Scanner;

public class tset03 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000");
			String country="country";
			String findcountry;
			int HMP=0;
			int findHMP;
			HashMap<String,Integer> nations= new HashMap<String,Integer>();
			while(true) {
				System.out.print("나라이름, 인구 >>");
				country=sc.next();
				if(country.equals("그만"))
				{
					break;
				}
				HMP=sc.nextInt();
				nations.put(country, HMP);
				
				
			}
			while(true) {
				
				System.out.print("인구 검색 >>");
				findcountry= sc.next();
				if(findcountry.equals("그만"))
				{
					break;
				}
			
				if(nations.containsKey(findcountry)) {
				
					findHMP=nations.get(findcountry);
					System.out.println(findcountry+"의 인구는 "+findHMP);
				}
				else {
					
					System.out.println(findcountry+" 나라는 없습니다.");
				}
				
		
				
				
			}
			
		}
}
