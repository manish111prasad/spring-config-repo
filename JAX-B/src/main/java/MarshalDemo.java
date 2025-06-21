import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshalDemo {

	public static void main(String[] args) throws Exception {

		Customer c = new Customer();
		c.setId(1);
		c.setName("Manish");
		c.setEmail("hello@gmail.com");
		c.setPhno(1234567890);

		JAXBContext context = JAXBContext.newInstance(Customer.class);

		Marshaller marshal = context.createMarshaller();

		marshal.marshal(c, new File("Customer.xml"));

		System.out.println("xml file created");

	}

}
