package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("o");
        Matcher matcher = pattern.matcher("I love TechGlobal");

        System.out.println(matcher.matches());// returns ture or false --> checks if given string matches given pattern

        while(matcher.find()){//find the next matched pattern in the given string
            System.out.println(matcher.group());// print out the next matched pattern in the given string
            System.out.println("Start index: " + matcher.start());// returns int --> prints out where found pattern starts
            System.out.println("End index: " + matcher.end());// returns int --> prints out where found pattern ends
        }


    }
}
