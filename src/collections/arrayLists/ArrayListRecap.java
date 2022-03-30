package collections.arrayLists;

import java.util.*;

public class ArrayListRecap {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> group = new ArrayList<>();
        group.add("Melda");
        System.out.println(names.size());

        names.add("Abraham");
        System.out.println(names.size());
        names.add("Regina");
        System.out.println(names.size());
        names.add("Andrei");
        System.out.println(names.size());
        names.add(1, "Melda");
        System.out.println(names.size());

        names.set(2, names.get(0));

        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        System.out.println(names.indexOf("Abraham"));
        System.out.println(names.contains("Abraham"));
        System.out.println(names.containsAll(group));
        System.out.println(names.indexOf("Abe"));
        System.out.println(names.lastIndexOf("Abraham"));


        System.out.println("\nCONVERSION\n");

        String[] cars  = {"bmw", "mercedes", "audi"};

        ArrayList<String> carsList1 = new ArrayList<>(Arrays.asList(cars)); // 1
        List<String> carsList2 = Arrays.asList(cars);                       // 2
        ArrayList<String> carsList3 = new ArrayList<>();                    // 3
        for (int i = 0; i < cars.length; i++) carsList3.add(cars[i]);

        carsList3.addAll(Arrays.asList(cars));                              // 4


        System.out.println(carsList1);
        System.out.println(carsList2);
        System.out.println(carsList3);


        System.out.println("\n\n");


        int[] nums = {1, 2, 3};

        ArrayList<Integer> numsList1 = new ArrayList<>();
        for (int num : nums) numsList1.add(num);
        System.out.println(numsList1);

        System.out.println("\nITERATOR\n");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("yellow");
        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.add("orange");
        System.out.println(colors);

        Iterator<String> it = colors.iterator();

        while (it.hasNext()){
            String element = it.next();
            if (element.length() == 6 && element.contains("e")){
                System.out.println(element);
                it.remove();
            }
        }

        System.out.println(colors);
    }
}
