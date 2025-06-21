package in.AIT;

public class PaymentService {

	IPayment iPayment;
	
	public PaymentService() {

	}
	
	public PaymentService(IPayment iPayment) {
		this.iPayment=iPayment;
	}
	
	public void doPayment(double billAmt) {
		
		boolean status = iPayment.processPayment(billAmt);
		
		if(status) {
			System.out.println("Sucessfull");
		}
		else {
			System.out.println("Not Sucessfull");
		}
		
		return;
	}
	
}
