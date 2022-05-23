package com.company.model;

public class Address {

    private String city;
    private String street;
    private int home;
    private int flat;

    public Address(String city, String street, int home, int flat) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.flat = flat;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getFlat() {
        return flat;
    }

    public String displayInfo() {
        return "Адрес: Город " + city + ", улица " + street + ", дом № " + home + ", квартира № " + flat + "\n";
    }
}