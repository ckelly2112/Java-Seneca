package Lab3;
/*
 * Student Name: Christopher Kelly
 * Student ID: 134358183
 */
import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first complex number: ");
		Complex first = new Complex(input.nextDouble(), input.nextDouble());
		System.out.print("Enter the second complex number: ");
		Complex second = new Complex(input.nextDouble(), input.nextDouble());
		
		System.out.println("(" + first + ") + (" + second + ") = " + first.add(second));
		System.out.println("(" + first + ") - (" + second + ") = " + first.subtract(second));
		System.out.println("(" + first + ") x (" + second + ") = " + first.multiply(second));
		System.out.println("(" + first + ") / (" + second + ") = " + first.divide(second));
		
		System.out.println("|(" + first + ")| = " + Math.sqrt(Math.pow(first.getRealPart(), 2) + Math.pow(first.getImaginaryPart(), 2)));
		
	}

}


class Complex {
	private double a;
	private double b;
	
	Complex(){
		this.a = 0;
		this.b = 0;
	}
	
	Complex(double a){
		this.a = a;
		this.b = 0;
	}
	
	Complex(double a, double b){
		this.a = a;
		this.b = b;
	}
	//𝒂+𝒃𝒊+𝒄+𝒅𝒊=(𝒂+𝒄)+(𝒃+𝒅)𝒊
	public Complex add(Complex opr) {
		Complex sum = new Complex(this.a + opr.a, this.b + opr.b);
		
		return sum;
	}
	
	//𝒂+𝒃𝒊−(𝒄+𝒅𝒊)=(𝒂−𝒄)+(𝒃−𝒅)𝒊
	public Complex subtract(Complex opr) {
		Complex sub = new Complex(this.a - opr.a, this.b - opr.b);
		
		return sub;
		
	}
	
	//(𝒂+𝒃𝒊)/(𝒄+𝒅𝒊)=(𝒂𝒄+𝒃𝒅)/(𝒄𝟐+𝒅𝟐)+(𝒃𝒄−𝒂𝒅)𝒊/(𝒄𝟐+𝒅𝟐)
	public Complex divide(Complex opr) {
		double a = (this.a * opr.a + this.b * opr.b) / (Math.pow(opr.a, 2) + Math.pow(opr.b, 2));
		double b = (this.b * opr.a - this.a * opr.b) / (Math.pow(opr.a, 2) + Math.pow(opr.b, 2));
		
		return new Complex(a, b);
	}
	//(𝒂+𝒃𝒊)∗(𝒄+𝒅𝒊)=(𝒂𝒄−𝒃𝒅)+(𝒃𝒄+𝒂𝒅)𝒊
	public Complex multiply(Complex opr) {
		double a = (this.a * opr.a - this.b * opr.b);
		double b = (this.b * opr.a + this.a * opr.b);
		return new Complex(a,b);
		
	}
	
	public double getRealPart() {
		
		return this.a;
	}
	
	public double getImaginaryPart() {
		
		return this.b;
	}
	
	public String toString() {
		String str;
		if (getImaginaryPart() != 0) {
			str = getRealPart() + " + " + getImaginaryPart() + "i";
		} else {
			str = Double.toString(getRealPart());
		}
		
		return str;
		
	}
	
}