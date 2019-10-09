package entities;

public class Agreement extends Product {
	public Agreement(String productCode, String productType,double isaService) {
		super(productCode, productType);
		// TODO Auto-generated constructor stub
		this.isaService = isaService;
	}

	private double isaService;
	public void isaService(double isaService) {
		this.isaService = isaService;
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
