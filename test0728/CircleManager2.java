package test0728;

import java.util.Arrays;
import java.util.Scanner;


class Circle2{
	private double x,y;
	private int radius;
	public Circle2( double x, double y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void show() {
		System.out.print("("+x+","+y+")"+radius);
		System.out.println("");
	}
	
	
	
}

public class CircleManager2 {

	public CircleManager2() {
		
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Circle2 c[]=new Circle2[3];
		int biggest=0;
		
		for(int i=0;i<3;i++) {
			System.out.print("x,y, radius >>");
			double x=scanner.nextDouble();
			double y=scanner.nextDouble();
			int radius=scanner.nextInt();
			c[i]=new Circle2(x,y,radius);
		
			
		}
			for(int i=0;i<3;i++) 
			{
				if(biggest<c[i].getRadius()) 
				{
					biggest=c[i].getRadius();
				}
					
			}
			for(int i=0;i<3;i++) 
			{
				if(biggest==c[i].getRadius()) 
				{
					System.out.print("가장  면적이 큰 원은");
					c[i].show();
				}
					
			}
					
			scanner.close();
		
		//c2.biggestcircle(c);
	}

	
}
