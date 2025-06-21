package in.AIT;

public class debitCardPayment implements IPayment {

	public boolean processPayment(double billAmt) {
		
		System.out.println("Debit Card");
		
		return true;
	}

}
