package reader;


import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.graalvm.compiler.code.DataSection.Data;

import entities.Person;
import entities.Product;
import entities.SaleAgreements;
import entities.Address;
import entities.Amenity;
import entities.Customer;
import entities.General;
import entities.Invoice;
import entities.LeaseAgreements;
import entities.LowIncome;
import entities.ParkingPass;
public class FlatFileReader{
List<Person> personsList = new ArrayList<Person>();
List<Customer> customersList = new ArrayList<Customer>();
List<Product> productsList = new ArrayList<Product>();
List <Invoice> invoiceList = new ArrayList<Invoice>();
public List<Person> readPersons() {
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
			
			String street = address2[0];
			String city = address2[1];
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
			personsList.add(p);
		}
		sc.close();
	
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	

	return personsList;
	
}
public List<Customer> readCustomers() {
	Scanner sc = null;
	try {
		sc = new Scanner (new File("data/Customers.dat"));
		sc.nextLine();
		List<Customer> customersList = new ArrayList<Customer>();
		
		while(sc.hasNext()) {
			Customer c = null;
			String line = sc.nextLine();
			String data[] = line.split(";");

			
		String customerCode = data[0];
		String customerType = data[1];
		String primaryContact = data[2];
		String customerName = data[3];
		String address2[] = data[4].split(",");
		boolean isGeneral;
		
		String city = address2[1];
		String street = address2[0];
		String state = address2[2];
		String zip = address2[3];
		String country = address2[4];
	
		Address addressObject = new Address(city, street, state, zip, country);
		Person contact = null;
		for(Person p:personsList ) {
			if(p.getPersonCode() == primaryContact ) {
				contact = p;
			}
		}
		
		if(customerCode.contentEquals("G")) {
			isGeneral = true;
			c = new General(customerCode,customerType, contact,customerName, addressObject,isGeneral);
		}
		if(customerCode.contentEquals("L")) {
			isGeneral = false;
			c = new LowIncome(customerCode,customerType, contact,customerName, addressObject, isGeneral);
		}
	
		customersList.add(c);
		}
		sc.close();
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	return customersList;
}
public List<Product> readProducts() {
	Scanner sc = null;
	try {
		sc = new Scanner(new File("data/Products.dat"));
		sc.nextLine();
		List<Product> productsList = new ArrayList<Product>();
	
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
			
			if(productType == "L") {
			
				startDate = data[2];
				endDate = data[3];
				address = data[4];
				customerName = data[5];
				pricePerAppartment = data[6];
				pr = new LeaseAgreements(startDate, endDate, address, customerName, pricePerAppartment);
			}
			else if(productType == "S") {
				dateTime = data[2];
				address = data[3];
				cost = data[4];
				pr = new SaleAgreements(dateTime, address, cost);
				
			}
			else if(productType == "P") {
				parkingFee = data[2];
				
				pr = new ParkingPass(parkingFee);
			
			}
			else if(productType == "A") {
				name = data[2];
				cost = data[3];
				
				pr = new Amenity(name,cost);
			}
			productsList.add(pr);
		}
		sc.close();
	} catch(FileNotFoundException e) {
	e.printStackTrace();
}
	return productsList;

}

	public List<Invoice> flatFileReaderI(){
		
		Scanner sc = null;
		try {
			sc = new Scanner (new File("data/Invoice.dat"));
			sc.nextLine();
			while(sc.hasNext()) {
				Invoice i = null;
				
				String invoiceCode = "";
				String customerCode = "";
				String realtorCode = "";
				String invoiceDate;
				String productInfo = "";
				String line = sc.nextLine();
				String data[] = line.split(";");
				Customer customer = null;
				Person realtor = null;
				Invoice in = null;
				int year = 0;
				int month = 0;
				int day = 0;
				
				invoiceCode = data[0];
				customerCode = data[1];
				realtorCode = data[2];
				
				productInfo = data[4];
				
				String dataDate[] = data[3].split("-");
				year = Integer.valueOf(dataDate[0]);
				month = Integer.valueOf(dataDate[1]);
				day = Integer.valueOf(dataDate[2]);
				
				LocalDate invoiceDate1 = LocalDate.of(year, month, day);
				
				String data2[] = line.split(",");
				
				String data3[] = line.split(":");
				
				for(Customer x : customersList ) {
					if(x.getCustomerCode() == customerCode ) {
						customer = x;
					}
					
				}
				for(Person x : personsList ) {
					if(x.getPersonCode() == realtorCode ) {
						realtor = x;
					}
					
				}
				in = new Invoice (invoiceCode,invoiceDate1,customer,realtor);
				
				
				
				
				invoiceList.add(in);
			
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
			return invoiceList;
		
		}

		
	}


