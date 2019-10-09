package entities;

public class Service extends Product {

	private double isaService;
	public void isaService(double isaService) {
		this.isaService = isaService;
	}

	public Service(String productCode, String productType) {
		super(productCode, productType);
		// TODO Auto-generated constructor stub
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
