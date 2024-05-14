package org.rajtech;

public class PaymentService {
    private IPayment payment;
    public PaymentService(){
        System.out.println("0-Constructor :: Payment Service constructor executed means object created");
    }
    public PaymentService(IPayment payment){
        System.out.println(" Payment Service :: Param constructor ");
        this.payment = payment;
    }
    public void setPayment(IPayment payment){
        System.out.println("Setter method is calling");
        this.payment = payment;

    }
    public void doPayment(double billAmt){
        boolean status = payment.processPayment(billAmt);
        if (status)
            System.out.println("Receipt Printing-------------");
        else
            System.out.println("Card Declined...-------------....");
    }
}