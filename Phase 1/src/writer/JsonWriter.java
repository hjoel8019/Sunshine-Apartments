package writer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import reader.FlatFileReader;

import java.util.ArrayList;
import java.util.List;

import entities.Person;

public class JsonWriter {

	public void jsonConverter(ArrayList<Person>person) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonString = gson.toJson(person);
		System.out.println(jsonString);
	}

}
