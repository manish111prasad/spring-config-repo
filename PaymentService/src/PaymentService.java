public class PaymentService {
	
	private IPayment iPayment;
	
	public PaymentService(IPayment iPayment) {
		this.iPayment=iPayment;
	}
	public boolean doPayment(double billAmt) {
		boolean Status = iPayment.processPayment(billAmt);
		System.out.println("Done");
		return Status;
	}
}
