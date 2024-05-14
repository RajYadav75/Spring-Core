package in.rajtechnology;

public class CreditCardPayment implements IPayment{
	@Override
	public boolean processPayment(double billAmt) {

		System.out.println("Credit card payment Processed....");
		return true;
	}

}
