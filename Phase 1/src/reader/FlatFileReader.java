package reader;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Person;
import entities.Customer;

public class FlatFileReader {

	public  void fileReader() {
		Scanner sc = null;
		
		
		try {
			sc = new Scanner (new File("data/Customers.Dat"));
			sc.nextLine();
			
			ArrayList<Person> personList = new ArrayList<Person>();
			ArrayList<Customer> customerList = new ArrayList<Customer>();
			while(sc.hasNext()) {
				String line = sc.nextLine();
				String data[] = line.split(";");
				
			}
		}
		
	}

}
