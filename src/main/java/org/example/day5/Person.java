package org.example.day5;

/**
 * @author Bibash Bogati
 * @created 2025-02-16
 */
public class Person {

    private int age;
    private Address address;
    private TestAddress testAddress;



    public Address getAddress() {
        return address;
    }

    public static class Address {

        private String city;
        private String street;
    }
}
