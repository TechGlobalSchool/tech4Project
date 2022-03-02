package utilities;

public class Calculator {

    /*
    What do we need to create a method
    1. A proper name
    2. Decide its accessibility level (public)
    3. Decide its accessibility way (You want to call it with class name or with object name)
        static -> You want to call it with class name
        non-static -> You want to call it with object name
    4. Decide if it returns something or not
        if it returns -> then decide what it returns
        if it does not return -> then put void
    5. Does it take any argument
        if it takes, then decide what arguments it takes and how many arguments it takes

        NOTE: if your method is not void meaning it is return type you MUST use return keyword in the body
        of the method
        NOTE: if your method returns an int, then the variable used next to return keyword in the body MUST be an int
        NOTE: Every method must have a body that runs a task
        NOTE: We can have multiple methods sharing the same name in the same class only if they have different arguments.
        Different arguments could be either the number of arguments are different or the types of arguments are different

        NOTE: Do not ever create a method inside another method
     */



    public static int divide(int num1, int num2){ // 15, 2 ->7
         return num1 / num2;
    }

    public static double divide(double num1, double num2){
        return num1 / num2;
    }


    //Create a method that finds the sum of 2 int numbers and returns it
    //Create a method that finds the sum of 2 double numbers and returns it
    //Create a method that finds the absolute difference of 2 int numbers and returns it
    //Create a method that finds the absolute difference of 2 double numbers and returns it
    //Create a method that finds the product of 2 int numbers and returns it
    //Create a method that finds the product of 2 double numbers and returns it

}
