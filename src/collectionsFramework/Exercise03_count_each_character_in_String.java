package collectionsFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise03_count_each_character_in_String {
    public static void main(String[] args) {


        /*
        Count each character
        C=1
        h=1
        i=4
        c=3
        a=2
        g=1
        o=1
         =4
        s=1
        n=1
        e=1
        t=1
        y=1
         */
        String word = "Chicago is a nice city";

        LinkedHashMap<Character, Integer> charCounts = new LinkedHashMap<>();// {}

        for(Character c: word.toCharArray()){ // C
            if(!charCounts.containsKey(c)) charCounts.put(c, 1);
            else charCounts.put(c, charCounts.get(c)+1);
        }

        for(Map.Entry entry : charCounts.entrySet()){
            System.out.println(entry);
        }
    }
}
