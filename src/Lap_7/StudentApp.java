package Lap_7;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        //create Objects as Student
        student student1 = new student();

        student1.setId("111111111111");
        student1.setMajor("Information System");
        student1.setFaculty("Management Technology");
        student1.setName("Boy Saiyai");
        System.out.println();

        student1.toString();


        student student2 = new student("222222222222", "Management", " Business Management", "Girl Songkhla");

        System.out.println(student2.toString());

        student student3 = new student();
        student3 = inputData (student3 );

        System.out.println(student3.toString());


    }//main

    private static student inputData( student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your student data: ");
                System.out.print("Name: ");
        s.setName(scanner.nextLine());
        System.out.print("ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Major: :");
        s.setMajor(scanner.nextLine());
        System.out.print("Faculty:");
        s.setFaculty(scanner.nextLine());
        return s;

    }
}//class

