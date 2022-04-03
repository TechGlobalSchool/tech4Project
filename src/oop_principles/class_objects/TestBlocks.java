package oop_principles.class_objects;

public class TestBlocks {
    //static block of Fruit will be executed
    public static void main(String[] args) {
        System.out.println("This is line 1 in the main method before object being created");
        Fruit fruit1 = new Fruit();
        Fruit fruit2 = new Fruit();
        Fruit fruit3 = new Fruit();
        Fruit fruit4 = new Fruit();
        System.out.println("This is last line in the main method after object being created");
    }
}
