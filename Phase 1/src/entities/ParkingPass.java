package entities;

public class ParkingPass extends Product {
	private String parkingFee;

	

	public ParkingPass(String parkingFee) {
		super(parkingFee, parkingFee);
		this.parkingFee = parkingFee;
	}

	public String getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(String parkingFee) {
		this.parkingFee = parkingFee;
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
