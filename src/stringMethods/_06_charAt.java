package stringMethods;

public class _06_charAt {
    public static void main(String[] args) {
        /*
        Method Task: It helps to get a character at a specific index
        NOTE: Index starts with zero
        -It is non-static as we call it with object name
        -It is a return type and returns char primitive
        -It takes an argument which is int (index)

        NOTE: It will throw StringIndexOutOfBoundsException when the given index is not in the bounds
         */
        String name = "John";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

        //System.out.println(name.charAt(4)); // -1, 4

        /*
        Check if the name starts with A and print "This name starts with A"
        print "This name is not starting with A" otherwise
         */

        char firstChar = name.charAt(0);

        if(firstChar == 65 || firstChar == 97){
            System.out.println("This name starts with A");
        }
        else {
            System.out.println("This name is not starting with A");
        }
    }
}
