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
			sc = new Scanner (new File("data/Persons.Dat"));
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
		
	}

}
