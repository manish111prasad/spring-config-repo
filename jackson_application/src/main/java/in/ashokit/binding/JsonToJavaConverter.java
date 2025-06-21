package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter {

	public static void main(String [] args) throws Exception{
		
		File f = new File("manishFile.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		Customer customer = mapper.readValue(f, Customer.class);
		
		System.out.println(customer);
		
	}
	
}
