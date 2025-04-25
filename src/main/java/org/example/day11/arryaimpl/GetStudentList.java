package org.example.day11.arryaimpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bibash Bogati
 * @created 2025-04-20
 */
public class GetStudentList {

    public static void main(String[] args) {

//        int [] data = new int [9];
//        data [0] = 1;
//        int  d = data[2];
//
//
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }
//

        // add
        // remove
        //addAll
        // get --> index
        // contains


        // null
        // duplicate
        // contains
        //add all
        // isEmpty
        // size()

        List<Student> students = new ArrayList<>();
        //
        List<Student> students1 = new ArrayList<>();

        Student s1 =  new Student("Roshan1", 21);

        students.add(new Student("Roshan", 20));
        students.add(s1);
        students.add(new Student("Roshan2", 22));

        students1.add(new Student("Roshana", 21));

//
//        Student student = students.get(2);
//
//        System.out.println(student.getName());


//        students.remove(1);


        students.addAll(students1);
        System.out.println(students.contains(s1));

        // looping
        for (Student student1 : students) {
            System.out.println(student1.getName());
        }

//        students.forEach(student -> {
//            System.out.println(student.getName());
//        });



    }
}
