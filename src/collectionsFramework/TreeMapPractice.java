package collectionsFramework;

import java.util.TreeMap;

public class TreeMapPractice {
    public static void main(String[] args) {
        TreeMap<String, Integer> studentAges = new TreeMap<>();
        studentAges.put("Kaly", 17);
        studentAges.put("Torrie", 20);
        studentAges.put("Alona", 15);
        studentAges.put("Andrei", 25);
        //studentAges.put(null, 15); // NullPointerException
        studentAges.put("Guluzar", null);
        studentAges.put("Melda", null);
        studentAges.put("Taylor", null);
        studentAges.put("Ismail", null);

        System.out.println(studentAges);
    }
}
