package in.rajtechnology;

public class DebitCardPayment implements IPayment{
	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Debit card payment Processed...");
		return true;
	}
}
