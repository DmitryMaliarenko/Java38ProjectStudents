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
    public String displayInfo() {
        return "Адрес: Город " + city + ", улица " + street + ", дом № " + home + ", квартира № " + flat + "\n";
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setHome(int home) {
        this.home = home;
    }
    public void setFlat(int flat) {
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
}