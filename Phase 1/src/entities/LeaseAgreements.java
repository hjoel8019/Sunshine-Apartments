package entities;

public class LeaseAgreements extends Product {
	private String startDate;
	private String endDate;
	private String address;
	private String customerName;
	private String pricePerAppartment;
	public LeaseAgreements(String startDate, String endDate, String address, String customerName,
			String pricePerAppartment) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
		this.customerName = customerName;
		this.pricePerAppartment = pricePerAppartment;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPricePerAppartment() {
		return pricePerAppartment;
	}
	public void setPricePerAppartment(String pricePerAppartment) {
		this.pricePerAppartment = pricePerAppartment;
	}
	
	
	
}
