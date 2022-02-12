package learningObjects;

public class PrintOutPractice {
    public static void main(String[] args) {
        char capitalH = 'H';
        char e = 'e';
        char l = 'l';
        char o = 'o';

        System.out.println("" + capitalH + e + l + l + o); // 72 + 101 + 108 + 108 + 111 = 500

        int valueOfCapitalH = 'H';
        int capitalHNumber = 72;

        System.out.println("capitalH = " + capitalH); //capitalH = H
        System.out.println("valueOfCapitalH = " + valueOfCapitalH); // valueOfCapitalH = 72
        System.out.println("capitalHNumber = " + capitalHNumber);   // capitalHNumber = 72


        System.out.println("\n\n\n\n");

        System.out.print(capitalH);
        System.out.print(e);
        System.out.print(l);
        System.out.print(l);
        System.out.print(o);


        String greetings = "Hello";
        System.out.print("\n" + greetings);


        System.out.println("\n\n\n\n");


        String studentName = "Regina";
        System.out.println(studentName + " is sleeping. " +
                studentName + " is coding. " +
                studentName + " is eating.");
    }
}
