package entities;

public class Amenity extends Product {
	String name;
	String cost;
	public Amenity(String name, String cost) {
		super(cost, cost);
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCost(String cost) {
		this.cost = cost;
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
