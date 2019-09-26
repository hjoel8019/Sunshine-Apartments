package entities;

public class Customer {
	private String customerCode;
	private Person contact;
	private String name;
	private AddressCustomer address;
	public Customer(String customerCode, Person contact, String name, AddressCustomer address) {
		super();
		this.customerCode = customerCode;
		this.contact = contact;
		this.name = name;
		this.address = address;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public Person getContact() {
		return contact;
	}
	public void setContact(Person contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressCustomer getAddress() {
		return address;
	}
	public void setAddress(AddressCustomer address) {
		this.address = address;
	}
	
	

}
