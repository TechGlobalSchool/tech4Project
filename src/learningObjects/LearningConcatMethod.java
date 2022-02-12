package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args) {

//        String tech = "Tech";
//        String global = "Global";
//
//        String schoolName1 = tech + global;         //+ operator
//        String schoolName2 = tech.concat(global);   //concat method
//
//        System.out.println(schoolName1 + "\n" + schoolName2);



        String myName = "Salih";
        String myLastName = "Aydin";
        String space = " ";

        // "Salih Aydin"
        // create a String variable double quotations
        // create a String variable with '+'
        // create a String variable with concat()v method

        String fullName1 = "Salih Aydin";
        String fullName2 = myName + " " + myLastName;
        String fullName3 = myName.concat(" ".concat(myLastName));
        // "Salih".concat()

        // " Aydin"
        " ".concat(myLastName);

        System.out.println("This is fullName1 --> " + fullName1);
        System.out.println("This is fullName2 --> " + fullName2);
        System.out.println("This is fullName3 --> " + fullName3);

    }
}
