package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {

		Adress addr = new Adress();
		addr.setState("Maharastra");
		addr.setCity("Pune");
		addr.setArea("Wakad");
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("manish");
		c.setEmail("hello@gmail.com");
		c.setPhno(123456789);
		c.setAddr(addr);

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("manishFile.json"), c);
		
		System.out.println("json file created");

	}

}
