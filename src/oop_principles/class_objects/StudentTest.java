package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {

        /*
        Create a Student object with below information
        firstName = John
        lastName = Doe
        age = 45;
        dateOfBirth = 01/01/1977
        gender = male
        address = Chicago
        weight = 170.5
        height = 5.7
        email = johndoe@gmail.com
        id = 1001

        Then, print the object
        Student{firstName='John', lastName='Doe', age=45, dateOfBirth='01/01/1977', gender='male', address='Chicago', weight=170.5, height=5.7, email='johndoe@gmail.com', id=1001}
         */

        Student student1 = new Student();
        student1.firstName = "John";
        student1.lastName = "Doe";
        student1.age = 45;
        student1.dateOfBirth = "01/01/1977";
        student1.gender = "male";
        student1.address = "Chicago";
        student1.weight = 170.5;
        student1.height = 5.7;
        student1.email = "johndoe@gmail.com";
        student1.id = 1001;

        System.out.println(student1);


        /*
        Create another Student object with below information
        firstName = Lionel
        lastName = Messi
        age = 34;
        dateOfBirth = 01/01/1988
        gender = male
        address = Paris
        weight = 150
        height = 4.9
        email = lionel@gmail.com
        id = 1002

        Then, print the object
        Student{firstName='Lionel', lastName='Messi', age=34, dateOfBirth='01/01/1988', gender='male', address='Paris', weight=150.0, height=4.9, email='lionel@gmail.com', id=1002}
         */
        Student student2 = new Student();

        student2.firstName = "Lionel";
        student2.lastName = "Messi";
        student2.age = 34;
        student2.dateOfBirth = "01/01/1988";
        student2.gender = "male";
        student2.address = "Paris";
        student2.weight = 150;
        student2.height = 4.9;
        student2.email = "lionel@gmail.com";
        student2.id = 1002;

        System.out.println(student2);

        /*
        Create 3 more Student object with below information
        firstName = Alex, Jessie, Kaly
        lastName = Morgan, Smith, Ngo
        age = 20, 15, 16;
        dateOfBirth = 01/01/2002 - 01/01/2007 - 01/01/2006
        gender = male, female, female
        address = Chicago, Miami, Berlin
        weight = 165, 160, 150
        height = 5.5, 5.7, 5.3
        email = alex@gmail.com, jessie@gmail.com, kaly@gmail.com
        id = 1003, 1004, 1005

        Then, print the objects
         */

        Student student3 = new Student();
        student3.firstName = "Alex";
        student3.lastName = "Morgan";
        student3.age = 20;
        student3.dateOfBirth = "01/01/2020";
        student3.gender = "male";
        student3.address = "Chicago";
        student3.weight = 165;
        student3.height = 5.5;
        student3.email = "alex@gmail.com";
        student3.id = 1003;
        System.out.println(student3);

        Student student4 = new Student();
        student4.firstName = "Jessie";
        student4.lastName = "Smith";
        student4.age = 15;
        student4.dateOfBirth = "01/01/2007";
        student4.gender = "female";
        student4.address = "Miami";
        student4.weight = 160;
        student4.height = 5.7;
        student4.email = "jessie@gmail.com";
        student4.id = 1004;
        System.out.println(student4);

        Student student5 = new Student();
        student5.firstName = "Kaly";
        student5.lastName = "Ngo";
        student5.age = 16;
        student5.dateOfBirth = "01/01/2006";
        student5.gender = "female";
        student5.address = "Berlin";
        student5.weight = 150;
        student5.height = 5.3;
        student5.email = "kaly@gmail.com";
        student5.id = 1005;
        System.out.println(student5);


        /*
        TASK-1
        Count how many students are from Chicago

        EXPECTED:
        2
         */

        /*
        TASK-2
        Count how many student are male and female

        EXPECTED:
        male = 3
        female = 2
         */

        /*
        TASK-3
        Count how many student are teenager

        EXPECTED:
        2
         */

        System.out.println("\n-------TASK-1----------\n");

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        int countChicago = 0;
        int males = 0;

        for (Student student : students) {
            if(student.address.equalsIgnoreCase("chicago")) countChicago++;
            if(student.gender.toLowerCase().startsWith("m")) males++;
        }

        System.out.println(countChicago);

        System.out.println("\n-------TASK-2----------\n");
        System.out.println("males = " + males);
        System.out.println("females = " + (students.size() - males));


        System.out.println("\n-------TASK-3----------\n");
        int countTeen = 0;
        for (Student student : students) {
            if(student.age > 12 && student.age < 20) countTeen++;
        }
        System.out.println(countTeen);


        /*
        TASK-4
        Print all information of each student in separate lines
         */

        System.out.println("\n-------TASK-4----------\n");

        students.forEach(student -> {
            System.out.println(student.firstName);
            System.out.println(student.lastName);
            System.out.println(student.age);
            System.out.println(student.dateOfBirth);
            System.out.println(student.gender);
            System.out.println(student.address);
            System.out.println(student.weight);
            System.out.println(student.height);
            System.out.println(student.email);
            System.out.println(student.id);
            student.study();
            student.eat();
            System.out.println();
        });

    }
}
