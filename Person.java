import java.util.*;
public class Person {

	// Variables
	private  String firstName;
	private  String lastName;
	private  String address;
	private  String phoneNumber;
	
	// Constructor
	public Person (String firstName, String lastName, String address, String phoneNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setPhoneNumber(phoneNumber);
	}
	
	// Getters and Setters
	public String getFirstName () {
		return firstName;
	}
	
	public  void setFirstName( String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName () {
		return lastName;
	}
	
	public  void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress () {
		return address;
	}
	
	public  void setAddress ( String address) {
		this.address = address;
	}
	
	public String getPhoneNumber () {
		return phoneNumber;
	}
	
	public  void setPhoneNumber( String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// To String Method
	@Override
	public String toString() {
		return " \nName: " + firstName + " " + lastName + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\n"; 
	}
}




