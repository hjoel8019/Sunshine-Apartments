package entities;

public class ParkingPass extends Product {
	private String parkingFee;

	

	public ParkingPass(String parkingFee) {
		super();
		this.parkingFee = parkingFee;
	}

	public String getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(String parkingFee) {
		this.parkingFee = parkingFee;
	}
	
	
	
}
