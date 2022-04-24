package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {

        int age = 45;
        System.out.println(age); // 45

        //reference - object
        Dog dog1 = new Dog(); //Dog@1540e19d
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.breed = "puppy";
        dog1.age = 2;

        System.out.println(dog1); // Dog@1540e19d
        System.out.println(dog2); // Dog@677327b6
        System.out.println(dog3); // Dog@14ae5a5


        System.out.println("\n\n\n");

        String s1 = "Data";
        String s2 = "Data";


        System.out.println("without new checking the VALUES = " + s1.equals(s2)); // checking the VALUES
        System.out.println("without new checking the LOCATION = " + (s1 == s2)); // checking the LOCATION

        String s3 = new String("Data");
        String s4 = new String("Data");

        System.out.println("with new checking the VALUES = " + s3.equals(s4)); // checking the VALUES
        System.out.println("with new checking the LOCATION = " + (s3 == s4)); // checking the LOCATION

        s3 = s4;

        System.out.println("with new checking the VALUES = " + s3.equals(s4)); // checking the VALUES
        System.out.println("with new checking the LOCATION = " + (s3 == s4)); // checking the LOCATION


    }
}
