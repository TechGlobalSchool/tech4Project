package collections.arrayLists;

import java.util.*;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        //[Java, JavaScript, C#, Python, C++]

        /*
        TASK-1
        Remove Python from the list and print it

        RESULT:
        [Java, JavaScript, C#, C++]
         */

        System.out.println("\n------TASK-1-------\n");
        languages.remove("Python");
        System.out.println(languages);


        /*
        TASK-2
        Remove all elements that start with J

        RESULT:
        [C#, C++]
         */

        System.out.println("\n------TASK-2-------\n");

        /*
        DO NOT USE FOR EACH LOOP
        for (String language : languages) { // ConcurrentModificationException
            if(language.startsWith("J")) languages.remove(language);
        }

        System.out.println(languages);
         */

        /*
        Even though fori can be fixed by updating i when an element removed, it is still not preferred to use

        for (int i = 0; i < languages.size(); i++) {
            if(languages.get(i).startsWith("J")){
                languages.remove(languages.get(i));
                i--;
            }
        }

        System.out.println(languages);

         */

        /*
        WAY TO SURVIVE
        List<String> elementsStartWithJ = new LinkedList<>();

        for(String language: languages){
            if(language.toUpperCase().startsWith("J")) elementsStartWithJ.add(language);
        }

        languages.removeAll(elementsStartWithJ);
        System.out.println(languages);
         */

        /*
        languages.removeIf(x -> x.startsWith("J"));
        System.out.println(languages);

         */

        //USING ITERATOR

        Iterator<String> iterator = languages.iterator(); // I put all elements in a queue

        while(iterator.hasNext()){ // We are asking if there is an element in the queue
            String element = iterator.next(); // this gets an element from the queue
            if(element.startsWith("J")) { // if element came from the queue starts with J
                iterator.remove(); // Remove
            }
        }

        System.out.println(languages);

    }
}
