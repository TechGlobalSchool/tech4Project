package loops.nestedLoops;

public class PrintAllLetters {
    public static void main(String[] args) {


        for (int i = 1; i <= 2; i++) {
            int start = 97;
            if(i == 1){
                //First iteration start point = 97 end = 122 = start+25
                System.out.println("Lowercase Letters");
            }
            else{
                //Second iteration start point = 65 end = 90
                System.out.println("Uppercase Letters");
                start = 65;
            }

            for (int j = start; j <= start+25; j++) {
                System.out.println((char)j);
            }
        }

        System.out.println("\n\n-----Separate Loops Solution-----\n");

        System.out.println("Lowercase letters");
        for (int i = 97; i <= 122; i++) { // 97 122 -> 26
            System.out.println((char)i);
        }

        System.out.println("Uppercase letters");
        for (int i = 65; i <= 90; i++) { // 65 90 -> 26
            System.out.println((char)i);
        }

        System.out.println("End of the program!");
    }
}
