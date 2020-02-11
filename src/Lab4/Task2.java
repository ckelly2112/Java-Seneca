package Lab4;

import java.util.*;
/*
 * Student Name: Christopher Kelly
 * Student ID: 134358183
 */
public class Task2 {

	public static void main(String[] args) {
		MyDate todaysDate = new MyDate();
		Person person = new Person("Chris", "a", "a", "a");
		Student student = new Student("Billy", "a", "a", "a", "FrEshMan");
		Employee employee = new Employee("Steph", "a", "a", "a", "a", 3523525, todaysDate);
		Faculty faculty = new Faculty("Jane", "a", "a", "a", "a", 12313, new MyDate(3123123), "hours", "rank");
		Staff staff = new Staff("Jane", "a", "a", "a", "a", 12313, new MyDate(3123123), "hours");
		
		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);
		

	}

}

class Person{
	String pName;
	String pAddress;
	String pPhoneNumber;
	String pEmail;
	
	Person(String name, String address, String phone, String email){
		pName = name;
		pAddress = address;
		pPhoneNumber = phone;
		pEmail = email;
	}
	
	public String toString() {
		String str = "Person named " + pName;
		return str;
	}
	
}

class Student extends Person{
	String status;
	
	Student(String name, String address, String phone, String email, String type){
		super(name, address, phone, email);
		type.toLowerCase();
		switch(type) {
		case "freshman":
			status = "Freshman";
			break;
		case "sophomore":
			status = "Sophomore";
			break;
		case "junior":
			status = "Junior";
			break;
		case "senior":
			status = "Senior";
			break;
		default:
			status = "Not Found";
			break;
		}
		
	}
	public String toString() {
		String str = "Student named " + pName;
		return str;
	}
	
}

class Employee extends Person{
	String eOffice;
	double eSalary;
	String eDateHired;
	
	public Employee(String name, String address, String phone, String email, String office, double salary, MyDate hireDate) {
		super(name, address, phone, email);
		eOffice = office;
		eSalary = salary;
		eDateHired = "" + hireDate.getYear() + hireDate.getMonth() + hireDate.getDay() + "";
	}
	public String toString() {
		String str = "Employee named " + pName;
		return str;
	}
}

class Faculty extends Employee{
	String fOfficeHours;
	String fRank;
	
	public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate hireDate,
			String hours, String rank) {
		super(name, address, phone, email, office, salary, hireDate);
		fOfficeHours = hours;
		fRank = rank;
	}
	public String toString() {
		String str = "Faculty named " + pName;
		return str;
	}
}

class Staff extends Employee{
	String sTitle;
	public Staff(String name, String address, String phone, String email, String office, double salary, MyDate hireDate, String title) {
		super(name, address, phone, email, office, salary, hireDate);
		sTitle = title;
	}
	public String toString() {
		String str = "Staff named " + pName;
		return str;
	}
}

class MyDate{
	private int year;
	private int month;
	private int day;
	
	MyDate(){
		year = Calendar.getInstance().get(Calendar.YEAR);
		month = Calendar.getInstance().get(Calendar.MONTH);
		day = Calendar.getInstance().get(Calendar.DATE);
		
	}
	MyDate(long elapsed){
		setDate(elapsed);	
	}
	
	MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	int getYear() {return year;}
	int getMonth() {return month;}
	int getDay() {return day;}
	
	public void setDate(long elapsedTime) {
		Calendar time = Calendar.getInstance();
		time.setTimeInMillis(elapsedTime);
		year = time.get(Calendar.YEAR);
		month = time.get(Calendar.MONTH);
		day = time.get(Calendar.DAY_OF_MONTH);	
	}
}
