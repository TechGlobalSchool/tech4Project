package homeworks;

public class ExtraPractice {

    /*
    luckyUnluckyGame
        Create a method which will take an int as an argument and returns a String.
        •If the int number is in between -50/ 0 return "The number is negative and more than -50"
        •If the int number is in between 0/ 50 return "The number is positive and less than 50"
        •If the int number is  0 return "The number is zero"
        •If the number is 9 return "You have hit the lucky number!"
        •If the number is -11 return "You have hit the unlucky number!"
        -77
     */

    public static String luckyUnluckyGame(int num){
        if(num == -11) return "You have hit the unlucky number!";
        else if(num == 9) return "You have hit the lucky number!";
        else if(num > -50 && num < 0) return "The number is negative and more than -50";
        else if(num > 0 && num < 50) return "The number is positive and less than 50";
        else if(num == 0) return "The number is zero";

        return "The number you provided is not good for this game";
    }

    public static void main(String[] args) {
        //EDGE CASES - BOUNDARY CASES
        System.out.println(luckyUnluckyGame(-11));
        System.out.println(luckyUnluckyGame(9));
        System.out.println(luckyUnluckyGame(0));
        System.out.println(luckyUnluckyGame(-12));
        System.out.println(luckyUnluckyGame(49));
        System.out.println(luckyUnluckyGame(-75));
        System.out.println(luckyUnluckyGame(34223));

    }
}
