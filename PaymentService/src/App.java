
public class App {

	public static void main(String[] args) {
		
		IPayment p = new debitCardPayment();
	     PaymentService paymentService = new PaymentService(p);
		paymentService.doPayment(500);
	}

}
