package homeworks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {
    public static void main(String[] args) {
//        String data = "{104}LA{101}Paris{102}Berlin{103}Chicago{100}London";
//        parseData(data);
//        System.out.println(parseData(data));
        Map<String, Integer> quantityOfItems = new HashMap<>();
        quantityOfItems.put("Apple", 3);
        quantityOfItems.put("Mango", 5);
        System.out.println(calculateTotalPrice2(quantityOfItems));
    }

    public static TreeMap<String, String> parseData(String data){
        /*
        {104}LA{101}Paris{102}Berlin{103}Chicago{100}London
        "", "104}LA", "101}Paris", "102}Berlin", "103}Chicago", "100}London"
         */

        TreeMap<String, String> parsedData = new TreeMap<>();
        for (String keyValue: data.split("\\{")) {
            if (!keyValue.isEmpty()) {
//                String key = keyValue.substring(0, keyValue.indexOf('}'));
//                String value = keyValue.substring(keyValue.indexOf('}') + 1);
                parsedData.put(
                        keyValue.substring(0, keyValue.indexOf('}')),
                        keyValue.substring(keyValue.indexOf('}') + 1)
                );
            }
        }
        return parsedData;
    }

    public static double calculateTotalPrice1(Map<String, Integer> quantityOfItems){

        // quantityOfItems = {Apple=3, Mango = 1}
        /*
        Apple = $2.00
        Orange = $3.29
        Mango = $4.99
        Pineapple = $5.25
         */
        double totalPrice = 0;

        HashMap<String, String> pricesOfItems = new HashMap<>();
        pricesOfItems.put("Apple", "$2.00");
        pricesOfItems.put("Orange", "$3.29");
        pricesOfItems.put("Mango", "$4.99");
        pricesOfItems.put("Pineapple", "$5.25");

        for (String item :quantityOfItems.keySet()) {
//            Integer amountOfItem = quantityOfItems.get(item);
            totalPrice += Double.parseDouble(pricesOfItems.get(item).substring(1)) * quantityOfItems.get(item);
        }
        return totalPrice;
    }

    public static double calculateTotalPrice2(Map<String, Integer> quantityOfItems){
        double totalPrice = 0;

        HashMap<String, String> pricesOfItems = new HashMap<>();
        pricesOfItems.put("Apple", "$2.00");
        pricesOfItems.put("Orange", "$3.29");
        pricesOfItems.put("Mango", "$4.99");

        for (String item :quantityOfItems.keySet()) {
//            Integer amountOfItem = quantityOfItems.get(item);
            // mango --> 10 / 4 = 2
            // mango -->  quantityOfItems.get(item) / 4 = 2

            // Apple --> 11 / 2 = 5
            // Apple --> 12 / 2 = 6
            // Apple -->  quantityOfItems.get(item) / 2

            totalPrice += Double.parseDouble(pricesOfItems.get(item).substring(1)) * quantityOfItems.get(item);
            if (item.equals("Mango")) totalPrice -=
                    Double.parseDouble(pricesOfItems.get(item).substring(1)) * (int)(quantityOfItems.get(item) / 4);
            if (item.equals("Apple")) totalPrice -=
                    (Double.parseDouble(pricesOfItems.get(item).substring(1)) / 2) * (int)(quantityOfItems.get(item) / 2);
        }
        return totalPrice;
    }


    public static double getNumberAfterPoint(double number, int decimal){
        int decimalValue = 1 ;
        for (int i = 0; i < decimal; i++) decimalValue *= 10;
        return (double) Math.round(number * decimalValue) / decimalValue;
    }
}
