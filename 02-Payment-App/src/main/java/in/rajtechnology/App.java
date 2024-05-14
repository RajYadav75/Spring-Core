package in.rajtechnology;

public class App {
	public static void main(String[] args) {
		IPayment p1 = new CreditCardPayment();
		IPayment p2 = new DebitCardPayment();
		/*
		 * Setter Injection
		 * PaymentService service = new PaymentService();
		 * service.setPayment(p2); 
		 * Constructor Injection 
		 * PaymentService service1 = new PaymentService(p1);
		 * service.doPayment(450.00);
		 */
		
		//Constructor Injection
		PaymentService ps = new PaymentService(p1);// First set the value Credit Card then
		
		//Setter Injection
		ps.setPayment(p2);// this setter method will override the value and set new value
		
		ps.doPayment(100.00);
	}
}
