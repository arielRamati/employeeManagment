package model;

import java.sql.Date;

import model_params.EmployeeType;
import model_params.Nationality;
import org.hibernate.annotations.Entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Employee {

	private int employeeSerialNumber;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeIDNumber;
	private Date ishurExpirationDate;
	@Enumerated(EnumType.STRING)
	private Nationality nationality;
	private EmployeeType employeeType;
	private String phoneNumber;
	private String address;
	private String manager;
	private int travelExpenses;

	/**
	 * Empty constructor as required by the hibernate framework.
	 */
	public Employee() {}

	public Employee(int serial, String firstName, String lastName, String id, Date ishurExpiration, Nationality nash, EmployeeType type,
			String phoneNumber, String address, String manager, int travelEx ) throws Exception {
	this.employeeSerialNumber = serial;
	this.employeeFirstName = firstName;
	this.employeeLastName = lastName;
	this.employeeIDNumber = id;
	this.ishurExpirationDate = ishurExpiration;
	nationality = nash;
	this.employeeType = type;
	this.phoneNumber = phoneNumber; //new PhoneNumber(phoneNumber);
	this.address = address;
	this.manager = manager;
	this.travelExpenses = travelEx;	
	}

	public int getEmployeeSerialNumber() {
		return employeeSerialNumber;
	}

	public void setEmployeeSerialNumber(int employeeSerialNumber) {
		this.employeeSerialNumber = employeeSerialNumber;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeIDNumber() {
		return employeeIDNumber;
	}

	public void setEmployeeIDNumber(String employeeIDNumber) {
		this.employeeIDNumber = employeeIDNumber;
	}

	public Date getIshurExpirationDate() {
		return ishurExpirationDate;
	}

	public void setIshurExpirationDate(Date ishurExpirationDate) {
		this.ishurExpirationDate = ishurExpirationDate;
	}

	public Nationality getNationality() {
		return nationality;
	}

	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public int getTravelExpenses() {
		return travelExpenses;
	}

	public void setTravelExpenses(int travelExpenses) {
		this.travelExpenses = travelExpenses;
	}
}
