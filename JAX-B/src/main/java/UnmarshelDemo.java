import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshelDemo {

	public static void main(String[] args) throws JAXBException {

		File f = new File("Customer.xml");

		JAXBContext context = JAXBContext.newInstance(Customer.class);

		Unmarshaller unmarshaller = context.createUnmarshaller();

		Object object = unmarshaller.unmarshal(f);

		Customer c = (Customer) object;

		System.out.println(c);
		
		System.out.println("Unmarshelled");

	}

}
