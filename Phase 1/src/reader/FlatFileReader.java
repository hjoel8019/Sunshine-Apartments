package reader;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import entities.Person;
import entities.Product;
import entities.SaleAgreements;
import entities.Address;
import entities.Amenity;
import entities.Customer;
import entities.LeaseAgreements;
import entities.ParkingPass;

public class FlatFileReader {
	List<Person> resultp = new ArrayList<Person>();
	List<Customer> customerList = new ArrayList<Customer>();
	List<Product> productList = new ArrayList<Product>();
	public  List<Person> fileReader() {
		Scanner sc = null;
		
		
		try {
			sc = new Scanner (new File("data/Persons.dat"));
			sc.nextLine();
			
			
			
			
			while(sc.hasNext()) {
				ArrayList<String> email = new ArrayList<String>();
				Person p = null;
				String line = sc.nextLine();
				String data[] = line.split(";");
				
				
				String personCode = data[0];
				String name[] = data[1].split(",");
				String firstName = name[0];
				String lastName = name[1];
				
	
				String address2[] = data[2].split(",");
				String city = address2[1];
				String street = address2[0];
				String state = address2[2];
				String zip= address2[3];
				String country = address2[4];
			
				
				if(data.length == 4) {
					email.add(data[3]);
					Address addressObject = new Address(city, street, state, zip, country);
					p = new Person(personCode,firstName, lastName, addressObject,email);
					continue;
				}
				
				Address addressObject = new Address(city, street, state, zip, country);
				p = new Person(personCode,firstName, lastName, addressObject,email );
				resultp.add(p);
			}
			sc.close();
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
		return resultp;
		
	}
	public List<Customer> fileReaderC() {
		Scanner sc = null;
		try {
			sc = new Scanner (new File("data/Customers.dat"));
			sc.nextLine();
			
			while(sc.hasNext()) {
				Customer c = null;
				String line = sc.nextLine();
				String data[] = line.split(";");
	
				
			String customerCode = data[0];
			String customerType = data[1];
			String primaryContact = data[2];
			String customerName = data[3];
			String address2[] = data[4].split(",");
			
			String city = address2[1];
			String street = address2[0];
			String state = address2[2];
			String zip = address2[3];
			String country = address2[4];
		
			Address addressObject = new Address(city, street, state, zip, country);
			Person contact = null;
			for(Person p:resultp ) {
				if(p.getPersonCode() == primaryContact ) {
					contact = p;
				}
			}
			
			c = new Customer(customerCode,customerType, contact,customerName, addressObject);
			customerList.add(c);
			}
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return customerList;
	}
	public List<Product>flatFileReaderP() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("data/Products.dat"));
			sc.nextLine();
			
		
			while(sc.hasNext()) {
				Product pr = null;
				String line = sc.nextLine();
				String data[] = line.split(";");
				
				String productCode = data[0];
				String productType = data[1];
				String startDate;
				String endDate;
				String address;
				String customerName;
				String pricePerAppartment;
				String dateTime;
				String cost;
				String parkingFee;
				String name;
				
				if(data[1].charAt(1) == 'L') {
				
					startDate = data[2];
					endDate = data[3];
					address = data[4];
					customerName = data[5];
					pricePerAppartment = data[6];
					pr = new LeaseAgreements(startDate, endDate, address, customerName, pricePerAppartment);
				}
				else if(data[1].charAt(1) == 'S') {
					dateTime = data[2];
					address = data[3];
					cost = data[4];
					pr = new SaleAgreements(dateTime, address, cost);
					
				}
				else if(data[1].charAt(1) == 'P') {
					parkingFee = data[2];
					
					pr = new ParkingPass(parkingFee);
				
				}
				else if(data[1].charAt(1) == 'A') {
					name = data[2];
					cost = data[3];
					
					pr = new Amenity(name,cost);
				}
				productList.add(pr);
			}
			sc.close();
		} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
		return productList;
	
	}

}
