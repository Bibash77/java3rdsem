package org.example.day4;

/**
 * @author Bibash Bogati
 * @created 2025-02-10
 */
public class Vehicle {

     String color;

    private Float price;

    // getter setter

//    get garni function
    public String getColor() {
        return color;
    }


//    set garni function
    public void setColor(String color) {
        if(color == null ){
            throw new NullPointerException("color is null");
        }

        this.color = color;
    }



    public void ride() {

        System.out.println("It rides on 10km per hour");
    }


    public Vehicle() {
        System.out.println("It is a vehicle");

    }
    public Vehicle(String color, Float price) {
        System.out.println("It is a vehicle with color  " + color + " and price " + price);
        this.color = color;
        this.price = price;

    }
}
