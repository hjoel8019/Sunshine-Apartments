package driver;

import java.util.Arrays;
import java.util.List;

import com.google.gson.stream.JsonWriter;

import entities.Customer;
import entities.Person;
import entities.Product;
import reader.FlatFileReader;

public class DataConverter {

	public static void main(String args[]) {
		FlatFileReader fr= new FlatFileReader();
		List<Person> persons = fr.fileReader();
		//JsonWriter gson = new JsonWriter(null);
		//gson.jsonConverter(persons);
		System.out.println("hi");
		//JsonWriter write = new JsonWriter();
		
		
		List<Customer> customers = fr.fileReaderC();
		
		List<Product> products = fr.flatFileReaderP();
	}
}
