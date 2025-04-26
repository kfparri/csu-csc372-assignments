package csc372.module06.objects;

/**
 * Student - An object that holds the students name, roll number and address
 * @author	Kyle Parrish
 * @version	1.0.0
 */
public class Student {
	private int rollno;
	private String name, address;
	
	public int getRollNumber() {
		return rollno;
	}
	
	public void setRollNumber(int value) {
		rollno = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String value) {
		name = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String value) {
		address = value;
	}
	
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
}
