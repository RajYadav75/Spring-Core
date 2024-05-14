package org.example;

public class Address {
    private int houseNo;
    private String city;
    private String pincode;

    public Address(int houseNo, String pincode, String city) {
        this.houseNo = houseNo;
        this.pincode = pincode;
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" +
                "houseNo= " + houseNo +
                ", city= '" + city + '\'' +
                ", pincode= '" + pincode + '\'' +
                '}';
    }
}
