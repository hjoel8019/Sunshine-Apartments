package writer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.util.List;

import entities.Person;

public class JsonWriter {

	public void jsonConverter(List<Person> persons) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonString = gson.toJson(persons);
		System.out.println(jsonString);
	}

}
