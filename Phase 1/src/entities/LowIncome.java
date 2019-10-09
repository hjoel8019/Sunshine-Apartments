package entities;

public class LowIncome extends Customer {
	private boolean isGeneral;
	public LowIncome(String customerCode, String customerType, Person contact, String name, Address address, boolean isGeneral) {
		super(customerCode, customerType, contact, name, address);
		// TODO Auto-generated constructor stub
		this.isGeneral = isGeneral;
	}
	
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 1000.00;
	}

	@Override
	public double additionalFee() {
		// TODO Auto-generated method stub
		return 50.75;
	}

	

}
