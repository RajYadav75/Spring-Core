package org.rajtech;

public class DebitCardPayment implements IPayment
{
    public DebitCardPayment(){
        System.out.println("DebitCard constructor executed");
    }
    @Override
    public boolean processPayment(double billAmt) {
        System.out.println("DebitCard Payment Successfully...");
        return true;
    }
}
