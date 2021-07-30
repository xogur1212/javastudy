package test0730;

import java.util.Random;

public class random {
	  public static void main(String[] args) {
	      System.out.println(Math.PI);
	      System.out.println(Math.ceil(3.14));
	      System.out.println(Math.floor(3.14));
	      System.out.println(Math.round(3.14));
	      System.out.println(Math.sqrt(9));
	      System.out.println( Math.sqrt(  Math.pow(3,2) + Math.pow(4, 2) ) );
	      System.out.println( Math.ceil( Math.random()*45 ) );
	      Random ran = new Random();
	      
	      System.out.println("Random 객체를 통해 뽑은 값=="+(ran.nextInt(46)+1));
	      
	      for(int j=0;j<5;j++) {
	         for(int i = 0;i<6;i++) {
	            System.out.print( (int)( Math.random()*45+1 )+"," );
	         }
	         System.out.println("");
	      }
	   }

}
