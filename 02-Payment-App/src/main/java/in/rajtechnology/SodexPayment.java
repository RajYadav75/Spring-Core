package in.rajtechnology;

public class SodexPayment implements IPayment{
	@Override
	public boolean processPayment(double billAmt) {

		System.out.println("Sodexo payment processed....");
		return true;
	}

}
