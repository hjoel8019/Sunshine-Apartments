package entities;

public class General extends Customer {
	private boolean isGeneral;

	public General(String customerCode, String customerType, Person contact, String name, Address address, boolean isGeneral) {
		super(customerCode, customerType, contact, name, address);
		this.isGeneral = isGeneral;
	}

	@Override
	public double getTax() {
		if(isGeneral) {
			return .06;
		}
		// TODO Auto-generated metdhod stub
		else {
		return 0.10;
		}
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public double additionalFee() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	
}
