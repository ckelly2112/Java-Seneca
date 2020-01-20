package week01;

import java.util.Scanner;

public class _3ReadRadius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount of the radius: ");
		
		double radius = sc.nextDouble();
		
		double area = PI * (radius * radius);

		System.out.println(area);    
		
		}

}
