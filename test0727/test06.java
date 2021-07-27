package test0727;

import java.util.Scanner;

public class test06 {
	public static void main(String[] args) {
		
		int []unit= {50000,10000,1000,500,100,50,10,1};
		Scanner sc=new Scanner(System.in);
		System.out.println("금액을입력받아 오만원몇개 만원몇개 천원몇개 500원몇개 100원몇개 10원몇개 1원 몇개로 되는지 출력");
		int money=sc.nextInt();
		int ohman;
		int man;
		int thousand;
		int ohback;
		int hundrand=0;
		int ohship;
		int ten=0;
		int one=0;
		ohman=(money/unit[0]);
		man=(money%unit[0]/unit[1]);
		thousand=(money%unit[1]/unit[2]);
		ohback=(money%unit[2]/unit[3]);
		hundrand=(money%unit[3]/unit[4]);
		ohship=(money%unit[4]/unit[5]);
		ten=(money%unit[5]/unit[6]);
		one=(money%unit[6]);
		
		System.out.println(money+"    " +"5만원권:"+ohman +"  만원권:"+man + "  천원권:"+thousand +  
				"  오백원:"+ohback +"  백원짜리:"+hundrand  +
				"  오십원:"+ohship +	"  십원:"+ten + "  일원" + one  );

	
	}
}
