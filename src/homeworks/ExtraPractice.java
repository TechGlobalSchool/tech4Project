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

    /*
        Create a method which will take an int for age and String as a
        name
        •if the age is older than 30 and first letter is uppercase print out "Age and letter checks out"
        •if the age is older than 30 and first letter is lowercase print out "Age checks out but letter doesn't"
        •if the age is equal or younger than 30 and first letter is uppercase print out "Age doesn't check out but letter does"
        •if the age is equal or younger than 30 and first letter is lowercase print out "Nothing checks out"

        age being more than 30 || less than or equal to 30
        name being uppercase || lowercase
     */


    public static void checkAgeAndName(String name, int age){
        if(age > 30){
            if(Character.isUpperCase(name.charAt(0))){
                // age is > 30 and firs letter is uppercase
                System.out.println("Age and letter checks out");
            }
            else{
                // age is > 30 and firs letter is lowercase
                System.out.println("Age checks out but letter doesn't");
            }
        }
        else{
            if(Character.isUpperCase(name.charAt(0))){
                // age is <= 30 and firs letter is uppercase
                System.out.println("Age doesn't check out but letter does");
            }
            else{
                // age is <= 30 and firs letter is lowercase
                System.out.println("Nothing checks out");
            }
        }
    }

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


        checkAgeAndName("Abe", 31); //
        checkAgeAndName("Data", 25);
        checkAgeAndName("kaly", 35);
        checkAgeAndName("guluzar", 19);
    }
}
