package org.example.day1;

import org.example.day3.userdefinedfunction.SimpleClass;

/**
 * @author Bibash Bogati
 * @created 2025-01-31
 */
public class Callable {


    public static void main(String[] args) {
        MyDetail myDetail = new MyDetail();
        myDetail.id=1;
        myDetail.name="Bibash";
        myDetail.average = 60.0f;

        MyDetail anotherDetail = new MyDetail();
        myDetail.id=2;
        myDetail.name="Ram";
        myDetail.average = 70.0f;


        if(myDetail.average > anotherDetail.average){
            System.out.println("myDetail Average is greater than anotherDetail.average");
        } else {
            System.out.println("anotherDetail Average is greater than my.average");
        }


//        SimpleClass simpleClass = new SimpleClass();
//        simpleClass.test();
    }
}
