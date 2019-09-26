package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Person;
import entities.Address;
import entities.Customer;

public class FlatFileReader {

	public  void fileReader() {
		Scanner sc = null;
		
		
		try {
			sc = new Scanner (new File("data/Persons.dat"));
			sc.nextLine();
			
			ArrayList<Person> personList = new ArrayList<Person>();
			ArrayList<Customer> customerList = new ArrayList<Customer>();
			ArrayList<String> emailList = new ArrayList<String>();
			while(sc.hasNext()) {
				String line = sc.nextLine();
				String data[] = line.split(";");
				
				
				String personCode = data[0];
				String name[] = data[1].split(",");
				String firstName = name[0];
				String lastName = name[1];
				
				String address = data[2];
				String address2[] = data[2].split(",");
				String city = address2[1];
				String street = address2[0];
				String state = address2[2];
				String zip= address2[3];
				String country = address2[4];
			
				String email = "";
				if(data.length > 3) {
					emailList.add(data[3]);
				}
				
				Address addressObject = new Address(city, street, state, zip, country);
				Person person = new Person(personCode,firstName, lastName, addressObject,emailList );
			}
			sc.close();
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		sc = null;
		try {
			sc = new Scanner (new File("data/Customers.dat"));
			sc.nextLine();
			ArrayList<Customer> customerList = new ArrayList<Customer>();
			while(sc.hasNext()) {
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
			}
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			sc = new Scanner(new File("data/Product.dat"));
			sc.nextLine();
			
		
			while(sc.hasNext()) {
				String line = sc.nextLine();
				String data[] = line.split(";");
				
				String productCode = data[0];
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
				}
				if(data[1].charAt(1) == 'S') {
					dateTime = data[2];
					address = data[3];
					cost = data[4];
					
				}
				if(data[1].charAt(1) == 'P') {
					parkingFee = data[2];
				
				}
				if(data[1].charAt(1) == 'A') {
					name = data[2];
					cost = data[3];
				}
				
			}
			sc.close();
		} catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	
	}
}
