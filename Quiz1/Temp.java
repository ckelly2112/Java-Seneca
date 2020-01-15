package Quiz1;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter water in kg: ");
		double water = sc.nextDouble();
		System.out.println("Starting Temp:");
		double start = sc.nextDouble();
		System.out.println("EndTemp");
		double end = sc.nextDouble();
		double joules = water * (end - start) * 4184;
		System.out.println(joules);
		
		
		
		
		
	}
}
