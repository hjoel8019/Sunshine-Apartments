package entities;

public class SaleAgreements extends Product {
	private String dateTime;
	private String address;
	public SaleAgreements(String dateTime, String address) {
		super(address, address);
		this.dateTime = dateTime;
		this.address = address;
		
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
	
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double grandTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
