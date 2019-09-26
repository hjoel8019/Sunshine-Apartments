package entities;

public class Address {
// test here 
	private String city;
	private String street;
	private String state;
	private String zip;
	private String country;
	
	public Address(String city, String street, String state, String zip, String country) {
		super();
		this.city = city;
		this.street = street;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
