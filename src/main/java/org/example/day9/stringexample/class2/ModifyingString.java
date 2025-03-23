package org.example.day9.stringexample.class2;

/**
 * @author Bibash Bogati
 * @created 2025-03-16
 */
public class ModifyingString {

    public static void main(String[] args) {

        String data = "This is a very long text ";
        int index =  data.indexOf("ba");
        System.out.println(index);



//        contains example
        boolean isExist = data.contains("text");
        System.out.println("isExist = " + isExist);


        // replace

       data =  data.replace("text", "new Text");
        System.out.println(data);
    }
}
