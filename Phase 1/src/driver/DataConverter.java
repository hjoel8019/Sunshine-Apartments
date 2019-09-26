package driver;

import java.util.List;

import entities.Customer;
import entities.Person;
import entities.Product;
import reader.FlatFileReader;

public class DataConverter {

	public static void main(String args[]) {
		FlatFileReader fr= new FlatFileReader();
		List<Person> persons = fr.fileReader();
		
		List<Customer> customers = fr.fileReaderC();
		
		List<Product> products = fr.flatFileReaderP();
	}
}
