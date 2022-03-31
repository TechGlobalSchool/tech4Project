package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleTest {
    public static void main(String[] args) {
        //Create 2 Apple objects

        Apple apple1 = new Apple();
        apple1.color = "Red";
        apple1.taste = "Sweet";
        apple1.price = 0.99;


        // Apple{color='Red', taste='Sweet', price='0.99'}
        System.out.println(apple1);

        Apple apple2 = new Apple();
        apple2.color = "Green";
        apple2.taste = "Sour";
        apple2.price = 1.29;

        System.out.println(apple2);

        Apple apple3 = new Apple();
        apple3.color = "Yellow";
        apple3.price = .95;
        apple3.taste = "Sweet";
        System.out.println(apple3);


        //apple1, apple2, apple3
        Apple[] myApples = {apple1, apple2, apple3};

        System.out.println(Arrays.toString(myApples));

        ArrayList<Apple> myAppleList = new ArrayList<>(Arrays.asList(myApples));
        System.out.println(myAppleList);

        for (Apple apple : myAppleList) {
            System.out.println("My Apple = " + apple);
        }

        for (Apple apple : myAppleList) {
            System.out.println(apple.color);
            System.out.println(apple.taste);
            System.out.println(apple.price);
        }
    }
}
