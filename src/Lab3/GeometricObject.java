package Lab3;

/*
 * Student Name: Christopher Kelly
 * Student ID: 134358183
 */
import java.util.Date;

public class GeometricObject{
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new Date();
	}
	
	public GeometricObject(String newColor, boolean newFilled) {
		dateCreated = new Date();
		color = newColor;
		filled = newFilled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean newFilled) {
		filled = newFilled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "color is " + color + ", filled is " + filled +
				", created on " + dateCreated;
	}
}

class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	Triangle(){
		
	}
	
	Triangle(double a, double b, double c){
		side1 = a;
		side2 = b;
		side3 = c;
	}
	
	public double getSide1() {return side1;}
	public double getSide2() {return side2;}
	public double getSide3() {return side3;}

	//Heron's formula
	public double getArea() {
		
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double getPerimeter() { return side1 + side2 + side3; }
	
	public String toString() {
		String str = super.toString() + '\n' + "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
		return str;
	}
	
}
