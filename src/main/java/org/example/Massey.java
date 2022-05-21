package org.example;

public class Massey {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String address;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    int phoneNumber;

    public static void main (String[] args){

        Massey newMassey = new Massey();
        newMassey.setName("SMita Kolurwar");

        newMassey.setAddress("Suffolk place");

        newMassey.setPhoneNumber(1354155315);

    System.out.println(newMassey.getName());
        System.out.println(newMassey.getAddress());
        System.out.println(newMassey.getPhoneNumber());
    }

}
