package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {
        /*
        TASK-1
        Write a program that counts spaces for below String.
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
         */

        System.out.println("\n---TASK-1---\n");
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int count1 = 0;

        for (int i = 0; i <= address.length()-1; i++) {
            if(Character.isSpaceChar(address.charAt(i))) {
                count1++;
            }
        }

        System.out.println(count1);



        /*
        TASK-2
        Write a program that counts letters for below String.
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        25
         */
        System.out.println("\n---TASK-2---\n");
        int count2 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) count2++;
        }

        System.out.println(count2);

        /*
        TASK-3
        Write a program that counts uppercase and lowercase letters for below String.
        Then, find the difference between lowercase letters and uppercase letters
        Basically, find totalCountOfLowercaseLetters - totalCountOfUppercaseLetters
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
         */

        System.out.println("\n---TASK-3---\n");

        int countL = 0, countU = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(Character.isUpperCase(c)) countU++;
            else if(Character.isLowerCase(c)) countL++;
        }

        System.out.println(Math.abs(countL - countU));

        System.out.println("\n---TASK-3 - Second Way---\n");

        int count3 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(Character.isUpperCase(c)) count3++;
            else if(Character.isLowerCase(c)) count3--;
        }

        //String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        System.out.println(Math.abs(count3));

        System.out.println("\n---TASK-3 - Third Way---\n");

        count3 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)) count3++;
                else count3--;
            }
        }

        System.out.println(Math.abs(count3));


        /*
        TASK-4
        Write a program that counts vowel and consonants letters for below String.
        Then, print them with below messages

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        Vowels = 10
        Consonants = 15
         */

        System.out.println("\n---TASK-4---\n");
        int countV = 0, countC = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(Character.isLetter(c)){
                if(CharacterHelper.isVowel(c)) countV++;
                else countC++;
            }
        }

        System.out.println("Vowels = " + countV);
        System.out.println("Consonants = " + countC);



        /*
        TASK-5 - Putting all together
        Write a program that characters from the below String.
        Then, print them with below messages

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        Letters = 25
        Lowercases = 17
        Uppercases = 8
        Vowels = 10
        Consonants = 15
        Digits = 12
        Even digits = 9
        Odd digits = 3
        Spaces = 9
        Specials = 2

        Letters
            Uppercase or Lowercase
            Vowel or Consonant
        Digits
            Even
            Odd
        Spaces
        Specials
         */

        System.out.println("\n---TASK-5---\n");
        int letterCounter = 0, digitCounter = 0, spaceCounter = 0, specialCounter = 0,
                lowerCounter = 0, upperCounter = 0, vowelCounter = 0, consonantCounter = 0, evenCounter = 0, oddCounter = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if(Character.isLetter(c)){
                letterCounter++;
                if(Character.isUpperCase(c)){
                    upperCounter++;
                }
                else{
                    lowerCounter++;
                }

                if(CharacterHelper.isVowel(c)){
                    vowelCounter++;
                }
                else{
                    consonantCounter++;
                }
            }
            else if(Character.isDigit(c)){
                digitCounter++;
                if(Integer.parseInt("" + c) % 2 == 0){
                    evenCounter++;
                }
                else{
                    oddCounter++;
                }
            }
            else if(Character.isSpaceChar(c)){
                spaceCounter++;
            }
            else{
                specialCounter++;
            }
        }

        System.out.println("Letters = " + letterCounter);
        System.out.println("Uppercases = " + upperCounter);
        System.out.println("Lowercases = " + lowerCounter);
        System.out.println("Vowels = " + vowelCounter);
        System.out.println("Consonants = " + consonantCounter);
        System.out.println("Digits = " + digitCounter);
        System.out.println("Evens = " + evenCounter);
        System.out.println("Odds = " + oddCounter);
        System.out.println("Spaces = " + spaceCounter);
        System.out.println("Specials = " + specialCounter);


    }
}
