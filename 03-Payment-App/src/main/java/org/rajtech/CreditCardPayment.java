package org.rajtech;

public class CreditCardPayment implements IPayment{
    public CreditCardPayment(){
        System.out.println("CreditCard constructor executed");
    }
    @Override
    public boolean processPayment(double billAmt) {
        System.out.println("CreditCard Payment Successfully...");
        return true;
    }
}
