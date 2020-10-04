package SortingEmployee;

public class Employe {

	private String firstName;
	private String lastName;
	private String DOB;
	private String country;
	
	public Employe(String firstName,String lastName,String DOB,String country) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.DOB = DOB;
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDOB() {
		return DOB;
	}

	public String getCountry() {
		return country;
	}
	
	
}
