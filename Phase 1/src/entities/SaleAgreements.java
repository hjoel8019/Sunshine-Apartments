package entities;

public class SaleAgreements extends Product {
	private String dateTime;
	private String address;
	private String cost;
	public SaleAgreements(String dateTime, String address, String cost) {
		super();
		this.dateTime = dateTime;
		this.address = address;
		this.cost = cost;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	

}
