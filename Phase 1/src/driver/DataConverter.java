package driver;

import java.util.ArrayList;
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
		List<Person> persons= fr.fileReader();
		//JsonWriter gson = new JsonWriter(null);
		//gson.jsonConverter(persons);
		System.out.println("hi");
		for(Person it : persons) {
		     System.out.print(it.toString() + ", ");
		}
		//JsonWriter write = new JsonWriter();
		DataConverter foo = new DataConverter();
		System.out.println(foo.toString());
		
		List<Customer> customers = fr.fileReaderC();
		
		List<Product> products = fr.flatFileReaderP();
	}
	public String toString(ArrayList<Person> person){
        return person.toString();
    }
}
