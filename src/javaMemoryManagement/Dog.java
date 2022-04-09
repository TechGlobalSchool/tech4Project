package javaMemoryManagement;

public class Dog {

    public String breed;
    public int age;


    //This method will execute whenever a Dog object loses reference
    @Override
    protected void finalize(){
        System.out.println("A dog object is garbage collected");
    }
}
