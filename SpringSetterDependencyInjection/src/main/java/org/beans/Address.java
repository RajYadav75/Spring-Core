package org.beans;

public class Address {
    private int houseNo;
    private String city;
    private int pincode;

    public void setHouseNo(int houseNo) {
        System.out.println("Setter method houseNo");
        this.houseNo = houseNo;
    }

    public void setCity(String city) {
        System.out.println("Setter method city");
        this.city = city;
    }

    public void setPincode(int pincode) {
        System.out.println("Setter method pincode");
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "#"+houseNo+", "+city+", "+pincode;
    }
}
